package com.example.githubapp.model.gists;

import com.example.githubapp.model.GitHubUser;

import java.sql.Date;
import java.util.Map;

public class Gist {

    private String id;
    private Map<String,GistFile> files;
    private Date created_at;
    private String description;
    private GitHubUser owner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, GistFile> getFiles() {
        return files;
    }

    public void setFiles(Map<String, GistFile> files) {
        this.files = files;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GitHubUser getOwner() {
        return owner;
    }

    public void setOwner(GitHubUser owner) {
        this.owner = owner;
    }
}
