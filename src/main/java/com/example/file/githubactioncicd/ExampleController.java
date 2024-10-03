package com.example.file.githubactioncicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/workflows")
    public String getExample(){
        return "Hello World";
    }
}


/*
* echo "# github-actions.example" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/DevHasanboy/github-actions.example.git
git push -u origin main*/