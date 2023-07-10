package in.sudhanshuUpadhyay.expensetrackerapi.repository;



import java.sql.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sudhanshuUpadhyay.expensetrackerapi.entity.Expense;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	//Select * FROM tbl_expenses Where category =?
	Page<Expense> findByCategory(String category , Pageable page );
	
	//Select * FROM tbl_expenses Where name Like '%Keyword'
	Page<Expense> findByName(String Keyword , Pageable page );
	
	//Select * FROM tbl_expenses Where date Between ,startDate' and 'endDate'
	Page<Expense> findByDateBetween(Date startDate ,Date endDate, Pageable page );
	
	

}
