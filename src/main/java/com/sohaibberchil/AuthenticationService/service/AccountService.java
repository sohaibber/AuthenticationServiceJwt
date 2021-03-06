package com.sohaibberchil.AuthenticationService.service;

import com.sohaibberchil.AuthenticationService.entities.AppRole;
import com.sohaibberchil.AuthenticationService.entities.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username,String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();

}