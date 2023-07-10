package in.sudhanshuUpadhyay.expensetrackerapi.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_expenses")
@Setter
@Getter
public class Expense {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Column(name="expense_name")
	@NotBlank(message="Expense name must not be null")
	@Size(min=3 , message ="Expense name must be atleast 3 characters long")
	private String name ;
	
	private String description ; 
	
	@Column(name="expense_amount")
	private BigDecimal amount ;
	
	private String category ;
	
	private Date date ;
	
	
	@Column(name ="created_at" , nullable=false , updatable=false)
	@CreationTimestamp
	private Timestamp createdAt;
	
	@Column(name ="updated_at")
	@UpdateTimestamp
	private Timestamp updatedAt;
	
	
	
	
}




