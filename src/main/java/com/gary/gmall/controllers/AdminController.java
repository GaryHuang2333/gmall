package com.gary.gmall.controllers;

import com.gary.gmall.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        return "add user id[" + user.getId() + "] group[" + user.getGroup() + "] right[" + user.getRight() + "]";

    }

    @PostMapping("/delete")
    public String deleteUser(@RequestParam("id") String id) {

        return "delete user id[" + id + "]";

    }

    @GetMapping("/search")
    public String searchUser(@RequestParam("id") String id) {
        return "search user id[" + id + "]";
    }

    @PostMapping("/update")
    public String updateUser(@RequestBody User user) {
        return "update user id[" + user.getId() + "] group[" + user.getGroup() + "] right[" + user.getRight() + "]";

    }
}
