package vn.com.viettel.vds.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import vn.com.viettel.vds.constant.Variables;

import javax.inject.Named;

@Named("amountCalculator")
public class AmountCalculator implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Double salary = Double.parseDouble((String) delegateExecution.getVariable(Variables.SALARY));
        Integer employees = (Integer) delegateExecution.getVariable(Variables.EMPLOYEES);
        Double feePercentage = 0.1D;

        Double totalSalary = salary * employees;
        Double totalFee = feePercentage * totalSalary;
        Double totalAmount = totalSalary + totalFee;

        delegateExecution.setVariable(Variables.TOTAL_SALARY, totalSalary);
        delegateExecution.setVariable(Variables.TOTAL_FEE, totalFee);
        delegateExecution.setVariable(Variables.TOTAL_AMOUNT, totalAmount);
    }
}
