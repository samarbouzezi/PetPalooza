package petpalooza.Services.userServices;

import petpalooza.Entities.ERole;
import petpalooza.Entities.Role;
import petpalooza.Entities.User;

import java.util.List;

public interface IUser {
    public List<User> retrieveallUsers();



    List<User> getAllUser();

    User addNewUser(User user);

    User updateUser(User user);

    void deleteUser( Long idUser);

    User findUserByID(Long idUser);

    Boolean usernameAlreadyExist(String username);
    Boolean emailExist(String email);

    void blockUser(Long idUser);
//    List<User> findbyRoles(String roles);

    void SignalerUser(Long idUser);



}
