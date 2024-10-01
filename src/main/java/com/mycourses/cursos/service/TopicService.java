package com.mycourses.cursos.service;

import com.mycourses.cursos.models.Topic;
import com.mycourses.cursos.repository.ITopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService implements ITopicService{

    @Autowired
    private ITopicRepository iTopicRepository;

    @Override
    public List<Topic> getTopics() {
        return iTopicRepository.findAll();
    }

    @Override
    public void saveTopic(Topic topic) {
        this.iTopicRepository.save(topic);
    }

    @Override
    public void editTopic(Topic topic) {
        this.saveTopic(topic);
    }
}
