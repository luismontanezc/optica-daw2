package pe.edu.cibertec.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * API Gateway - Punto de entrada único para todos los microservicios
 *
 * Funcionalidades:
 * - Enrutamiento dinámico a microservicios
 * - Balanceo de carga automático
 * - Circuit Breaker (tolerancia a fallos)
 * - CORS configurado
 * - Service Discovery con Eureka
 *
 * @author Visum Óptica - Equipo Desarrollo
 * @version 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);

        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("🚀 API GATEWAY iniciado correctamente");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("🌐 Gateway URL: http://localhost:8080");
        System.out.println("📡 Eureka Client: Conectado a Discovery Server");
        System.out.println("🔄 Circuit Breaker: Resilience4J activado");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("📋 RUTAS DISPONIBLES:");
        System.out.println("   /api/auth/**        → ms-auth");
        System.out.println("   /api/citas/**       → ms-citas");
        System.out.println("   /api/sucursales/**  → ms-citas");
        System.out.println("   /api/productos/**   → ms-productos");
        System.out.println("   /api/categorias/**  → ms-productos");
        System.out.println("   /api/pedidos/**     → ms-pedidos");
        System.out.println("   /api/carrito/**     → ms-pedidos");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("💚 Health: http://localhost:8080/actuator/health");
        System.out.println("📊 Gateway Routes: http://localhost:8080/actuator/gateway/routes");
        System.out.println("═══════════════════════════════════════════════════════");
    }
}