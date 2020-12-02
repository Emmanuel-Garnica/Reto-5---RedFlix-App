package Reto5Equipo10G1M3.Reto5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto5Application {
    
    public static void main(String[] args) {
        new VentanaPeliculas().setVisible(true);
    }

    public static void ServerSpring(String[] args) {
            SpringApplication.run(Reto5Application.class, args);
    }

}
