# HTTPServerMYO
## Motivación
El objetivo de este proyecto es aprender el funcionamiento de un servidor HTTP sin el uso de librerías externas al lenguaje escogido, en este caso Java.  
## 1º Fase Documentación;  
Para empezar me he documentado sobre el protocolo HTTP V1.1 y como se puede levantar un servidor genérico  
https://en.wikipedia.org/wiki/HTTP  
https://www.youtube.com/watch?v=7GBlCinu9yg&t=213s&ab_channel=Computerphile  
  
Tras conocer un poco sobre HTTP y ver distintas ejemplos de implementacion extraí los pasos necesarios para realizar el servidor.  
- 1º Establecer una comunicación mediante Sockets
    - 1.1 Echo Server asíncrono mediante Threads
- 2º Establecer una comunicación siguiendo un protocolo, en este caso, TCP 
- 3º Manejar la entrada de datos HTTP
- 4º Responder a los datos
- 5º Mejorar el servidor añadiendo distintas funcionalidades como compresión, autentificación, etc..  

Como ampliación podríamos utilizar WebSockets en vez de Sockets.  
Centraremos principalmente en el desarrollo de HTTP, pues ya hemos visto a lo largo de la carrera los conceptos de Sockets y el protocolo TCP.  

