
# DOCUMENTACION KAFKA
### https://spring.io/projects/spring-kafka

# COMANDOS
## Comandos Basicos para iniciar
### Ubicarse en la Raiz del proyecto kafka (SRC), configurar el zookeeper.properties y server.properties
### buscar en la carpeta config :: esos archivos y modificar los log para windows
### log.dirs=/c:/src/kafka/kafka-logs -> server
### dataDir=c:/src/kafka/zookeeper-data -> zookeeper

# Iniciar Zookeeper
###  .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Iniciar Kafka
###   .\bin\windows\kafka-server-start.bat .\config\server.properties

# Crea un nuevo topic en el servidor de kafka
###   .\bin\windows\kafka-topics.bat --create --topic {topic-name} --bootstrap-server {host}:9092

# Decribir los detalles de un topic
###   .\bin\windows\kafka-topics.bat --describe --topic {topic-name} --bootstrap-server {host}:9092

# Listar todos los topics que existen dentro del broker
###   .\bin\windows\kafka-topics.bat --list --bootstrap-server {host}:9092

# Inicia una consola para ver mensajes de un topic específico
###   .\bin\windows\kafka-console-consumer.bat --topic {nombreTopic} --bootstrap-server {host}:9092

# Inicia una consola para enviar mensajes a un topic específico
###   .\bin\windows\kafka-console-producer.bat --broker-list {host}:9092 --topic {topic-name}

 
