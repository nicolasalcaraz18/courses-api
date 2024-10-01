package com.mycourses.cursos.service;

import com.mycourses.cursos.models.Topic;
import org.springframework.boot.jdbc.metadata.TomcatDataSourcePoolMetadata;

import java.util.List;

public interface ITopicService {

    List<Topic> getTopics();

    void saveTopic(Topic topic);

    void editTopic(Topic topic);

}
