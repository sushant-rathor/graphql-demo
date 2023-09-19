package com.example.graphql.dto;

import java.util.Objects;

public class Post {

    private String id;
    private String title;
    private String text;
    private String category;
    private String authorId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(getId(), post.getId()) && Objects.equals(getTitle(), post.getTitle()) && Objects.equals(getText(), post.getText()) && Objects.equals(getCategory(), post.getCategory()) && Objects.equals(getAuthorId(), post.getAuthorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getText(), getCategory(), getAuthorId());
    }

    public Post(String id, String title, String text, String category, String authorId) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.category = category;
        this.authorId = authorId;
    }

    public Post() {
    }
}
