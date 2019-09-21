package org.smartworld.spring.kafka.model;

public class MessageModel {

    private String id;
    private String name;

    public MessageModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MessageModel(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
