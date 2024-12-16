package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FinancialService {
    
    private List<User>users=new ArrayList<>();

    public List<User>getAllUsers()
    {
        return users;
    }
    public void addUser(String date, String name, double balance) {
        User user = new User(date, name, balance);  // Use 'date' instead of 'id'
        users.add(user);
    }
    public void deleteUser(String date) {
        users.removeIf(user -> user.getDate().equals(date));  // Use 'date' instead of 'id'
    }
}
