package in.sudhanshuUpadhyay.expensetrackerapi.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class UserModel {
	
	@NotBlank(message="Name should not be empty")
	private String name;
	
	
	@NotNull(message="Email should not be empty")
	@Email(message="Enter valid email Id")
	private String email;
	
	@NotNull(message="password should not be empty")
	@Size(min=5,message="Password should be atleast 5 chracters")
	private String password;
	
	private Long age = 0L;
	
	
}
