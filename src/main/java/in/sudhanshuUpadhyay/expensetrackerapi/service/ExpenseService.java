package in.sudhanshuUpadhyay.expensetrackerapi.service;


import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import in.sudhanshuUpadhyay.expensetrackerapi.entity.Expense;

public interface ExpenseService {
	

	
	Expense getExpenseById(Long id);
	
	void deleteExpenseById(Long id);
	
	Expense saveExpense (Expense expense);
	
	Expense updateExpenseDetails(Long id , Expense expense);

	Page<Expense> getAllExpenses(Pageable page);
	
	List<Expense> readByCategory(String category , Pageable page);
	
	List<Expense> readByName(String Keyword , Pageable page);
	
	List<Expense> readByDate(Date startDate , Date endDate, Pageable page);

}


