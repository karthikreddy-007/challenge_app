package com.karthik.challenge_app;

public class Challenge {
    private String description;
    private String id;  // Changed to lowercase to follow convention
    private String month;  // Changed to lowercase to follow convention

    public Challenge(String description, String month, String id) {
        this.description = description;
        this.month = month;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {  // Changed parameter type to match field type
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
