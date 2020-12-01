CREATE SCHEMA redflix33;

USE redflix33;

CREATE TABLE peliculas(
	id_pelicula  INT PRIMARY KEY,
    titulo VARCHAR(45),
    resumen  VARCHAR(500),
    año INT,
    director_pelicula VARCHAR(45)
);