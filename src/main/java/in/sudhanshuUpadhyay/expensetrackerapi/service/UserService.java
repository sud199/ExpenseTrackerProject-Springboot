package in.sudhanshuUpadhyay.expensetrackerapi.service;

import in.sudhanshuUpadhyay.expensetrackerapi.entity.User;
import in.sudhanshuUpadhyay.expensetrackerapi.entity.UserModel;

public interface UserService {
	
	User createUser(UserModel user);
	
	User readUser(Long id);
	
	User updateUser(UserModel user , Long id);
	
	void deleteUser(Long id);
	
	

}
