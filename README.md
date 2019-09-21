# springboot-kafka
Producer consumer example, committed as I learnt


KAFKA INSTALLATION:
===================

1. Download from https://kafka.apache.org/downloads
2. Extract the downloaded distribution
3. Open terminal(I am using linux) inside extracted Kafka folder and execute bin/zookeper-server-start.sh config/zookeeper.properties  (Start Zookeeper server)
4. Open anyother tab in terminal then execute bin/kafka-server-start.sh config/server.properties  (Start Kafka Server)
5. Open one more tab in termical then execute bon/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic msgTopic   (Start Kafka Consumer)

