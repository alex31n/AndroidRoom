package com.example.androidroom.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.androidroom.model.User;
import com.example.androidroom.repository.UserRepo;

import java.util.List;

public class UserViewModel extends AndroidViewModel {
    private UserRepo userRepo;
    private LiveData<List<User>> allUsers;

    public UserViewModel(@NonNull Application application) {
        super(application);

        userRepo = new UserRepo(application);
        allUsers = userRepo.getAllUsers();
    }


    public void insert(User user){
        userRepo.insert(user);
    }
    public void update(User user){
        userRepo.update(user);
    }
    public void delete(User user){
        userRepo.delete(user);
    }
    public void deleteAll(){
        userRepo.deleteAllUsers();
    }

    public LiveData<List<User>> getAllUsers(){
        return allUsers;
    }
}
