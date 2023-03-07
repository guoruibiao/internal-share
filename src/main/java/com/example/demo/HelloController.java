package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Objects;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/")
    @ResponseBody
    public HashMap<String, Object> index() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "file-sharing");
        map.put("description", "For file sharing between Android/iPhone and macOS/Linux/Windows");
        HashMap<String, String> uriMap = new HashMap<>();
        uriMap.put("/lists", "list all files can be download within platform");
        uriMap.put("/upload", "specific action for file uploading");
        uriMap.put("/file/xxx", "specific action for file downloading");
        map.put("uris", uriMap);
        return map;
    }

}
