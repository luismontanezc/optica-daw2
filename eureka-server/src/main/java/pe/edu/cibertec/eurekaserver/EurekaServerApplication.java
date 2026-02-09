package pe.edu.cibertec.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server - Service Discovery para arquitectura de microservicios
 *
 * Este servidor actúa como registro central donde todos los microservicios
 * se registran y descubren entre sí.
 *
 * @author Visum Óptica - Equipo Desarrollo
 * @version 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);

        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("🚀 EUREKA SERVER iniciado correctamente");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("📍 Dashboard: http://localhost:8761");
        System.out.println("📡 Eureka URL: http://localhost:8761/eureka/");
        System.out.println("💚 Health Check: http://localhost:8761/actuator/health");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("✅ Esperando registro de microservicios...");
        System.out.println("═══════════════════════════════════════════════════════");
    }
}