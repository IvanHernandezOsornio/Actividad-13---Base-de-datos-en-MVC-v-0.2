CREATE DATABASE agenda_mvc;

USE agenda_mvc;

CREATE TABLE contactos( 
    id_contacto integer NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    email varchar(50) NOT NULL,
    telefono varchar(10) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO contactos (nombre, email, telefono) VALUES 
('Dejah Thoris','dejah@barson.ma', '7751548796'), 
('Jhon Carter','jhon@barson.ma', '7754758963'),
('Carthoris Carter','carthoris@barson.ma', '7754896321'),
('Luis hernandez','luis@hotmail.com.com', '7751961245'),
('Nancy hernandez','nancy@hotmail.com.com', '7751965874'),
('Ivan hernandez','ivan@hotmail.com.com', '7751964523'),
('Anel hernandez','Anel@hotmail.com.com', '7751962519');
SELECT * FROM contactos;

CREATE USER 'user_mvc'@'localhost' IDENTIFIED BY 'pass_mvc.2018';
GRANT ALL PRIVILEGES ON agenda_mvc.* TO 'user_mvc'@'localhost';
FLUSH PRIVILEGES;
