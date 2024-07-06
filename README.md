# HTTPServerMYO
## Motivación
El objetivo de este proyecto es aprender el funcionamiento de un servidor HTTP sin el uso de librerías externas al lenguaje escogido, en este caso Java.  
## 1º Fase Documentación;  
Para empezar me he documentado sobre el protocolo HTTP V1.1 y como se puede levantar un servidor genérico  
Wikipedia HTTP: https://en.wikipedia.org/wiki/HTTP  
Make a Http Server en 25 lines of code: https://www.youtube.com/watch?v=7GBlCinu9yg&t=213s&ab_channel=Computerphile  

A continuación encontré los siguientes contenidos que me han servido como guía para realizar el proyecto.  

Build your own Http server from scratch - James Smith  
Make a simple Http Server in java: https://www.youtube.com/playlist?list=PLAuGQNR28pW56GigraPdiI0oKwcs8gglW  

Hypertext Transfer Protocol (HTTP/1.1): Message Syntax and Routing:
https://datatracker.ietf.org/doc/html/rfc7230
  
Tras conocer un poco sobre HTTP y ver distintas ejemplos de implementacion extraí los pasos necesarios para realizar el servidor.    
- 1º Establecer una comunicación mediante Sockets
    - 1.1 Echo Server asíncrono mediante Threads
    - 1.2 Web Server asíncrono mediante Threads
- 2º Establecer una comunicación siguiendo un protocolo, en este caso, TCP 
- 3º Manejar la entrada de datos HTTP
    - 3.1 Crear el Parser HTTP
- 4º Responder a los datos
- 5º Mejorar el servidor añadiendo distintas funcionalidades como compresión, autentificación, etc..  

Como ampliación podríamos utilizar WebSockets en vez de Sockets.  
Centraremos principalmente en el desarrollo de HTTP, pues ya hemos visto a lo largo de la carrera los conceptos de Sockets y el protocolo TCP.  

