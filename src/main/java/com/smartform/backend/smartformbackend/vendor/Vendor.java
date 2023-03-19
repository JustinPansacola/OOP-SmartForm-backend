package com.smartform.backend.smartformbackend.vendor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vendors")
public class Vendor {
    @Id
    private String id;
    private String name;
    private String country;
    private String details;
    private List<String> users = new ArrayList<String>();
    private List<String> forms = new ArrayList<String>();

    public Vendor() {

    }

    public Vendor(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // CRUD for name
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    // CRUD for users
    public List<String> getUsers() {
        return this.users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public void addUser(String userId) {
        this.users.add(userId);
    }

    // CRUD for forms
    public List<String> getForms() {
        return this.forms;
    }

    public void setForms(List<String> forms) {
        this.forms = forms;
    }

    public void insertForm(String formId) {
        this.forms.add(formId);
    }
}
