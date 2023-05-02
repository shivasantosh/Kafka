package com.example.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	@KafkaListener(topics = "topic-example-cmd", groupId = "group1", topicPartitions = {
			@TopicPartition(topic = "topic-example-cmd", partitions = "1") })
	public void consumerTopicListner(String message) {
		System.out.println("consumerTopicListner " + message);
	}

	@KafkaListener(topics = "topic-example-cmd", groupId = "group2")
	public void consumerTopicListnerGroup2(String message) {
		System.out.println(message);
	}
}
