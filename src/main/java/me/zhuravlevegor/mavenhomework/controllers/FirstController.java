package me.zhuravlevegor.mavenhomework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/")
    public String print(){
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String printInfo(){
        return """
               Журавлев Егор,
               MavenHomeWork,
               27.12.2022,
               Целью данного проекта было закрепление знаний,
               полученных во втором уроке третьего курса
               Java-разработчик 2.0 от Skypro
                """;
    }
}
