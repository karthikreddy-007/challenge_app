package com.karthik.challenge_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller {
    private List<Challenge> challenges = new ArrayList<>();

    public controller() {
        Challenge challenge1 = new Challenge("First challenge", "January", "1234");
        challenges.add(challenge1);
    }

    @GetMapping("/challenges")
    public List<Challenge> getChallenges() {
        return challenges;
    }

    @PostMapping("/challenges")
    public String addChallenges(@RequestBody Challenge challenge) {
        challenges.add(challenge);
        return "Challenge added successfully";
    }
}
