package org.first.em.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class EmpController {

    
   //   EmployeeService employeeService = new EmployeeServiceImpl() ;
    //Dependency injection

     @Autowired
    EmployeeService employeeService ;

     @GetMapping("employees")
    public List<Employee> getAllEmployees(){
       return employeeService.readEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
       return employeeService.readEmployee(id);
    }

      @PostMapping("/employees")
      public String createEmployee(@RequestBody Employee employee){
       return employeeService.createEmployee(employee);
      }

      @DeleteMapping("/employees/{id}")
      public String deleteEmployee(@PathVariable Long id){
       if(employeeService.deleteEmployee(id)){
         return "Delete Succesfully";
       }
       else{
         return "Not found";
       }
    } 
    
    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }
}
