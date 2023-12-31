package com.brkbthn.annotation;

import com.brkbthn.data.entity.EmployeeEntity;
import com.brkbthn.data.repository.IEmployeeRepository;
import lombok.RequiredArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//lombok
@RequiredArgsConstructor
public class UniqueEmailValidation implements ConstraintValidator<EmployeeUniqueEmail,String> {

    //repository constructor injection
   private final IEmployeeRepository repository;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        EmployeeEntity employeeEntity=repository.findByEmail(email);
        //eğer bu emailimizi database varsa
        if(employeeEntity!=null){
            return false;
        }
        return true;
    }
}
