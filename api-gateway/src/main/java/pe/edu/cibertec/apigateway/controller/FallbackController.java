package pe.edu.cibertec.apigateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Controlador de fallback para Circuit Breaker
 * Maneja respuestas cuando los microservicios no están disponibles
 */
@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/auth")
    public ResponseEntity<Map<String, Object>> authFallback() {
        return buildFallbackResponse(
                "El servicio de autenticación no está disponible en este momento",
                "ms-auth"
        );
    }

    @GetMapping("/citas")
    public ResponseEntity<Map<String, Object>> citasFallback() {
        return buildFallbackResponse(
                "El servicio de citas no está disponible en este momento",
                "ms-citas"
        );
    }

    @GetMapping("/productos")
    public ResponseEntity<Map<String, Object>> productosFallback() {
        return buildFallbackResponse(
                "El servicio de productos no está disponible en este momento",
                "ms-productos"
        );
    }

    @GetMapping("/pedidos")
    public ResponseEntity<Map<String, Object>> pedidosFallback() {
        return buildFallbackResponse(
                "El servicio de pedidos no está disponible en este momento",
                "ms-pedidos"
        );
    }

    private ResponseEntity<Map<String, Object>> buildFallbackResponse(String message, String service) {
        Map<String, Object> response = new HashMap<>();
        response.put("timestamp", LocalDateTime.now());
        response.put("status", HttpStatus.SERVICE_UNAVAILABLE.value());
        response.put("error", "Service Unavailable");
        response.put("message", message);
        response.put("service", service);
        response.put("suggestion", "Por favor, intente nuevamente en unos momentos");

        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
    }
}