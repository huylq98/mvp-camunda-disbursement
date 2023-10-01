package vn.com.viettel.vds.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import vn.com.viettel.vds.constant.Variables;

import javax.inject.Named;

@Named("disbursementRequestValidator")
public class DisbursementRequestValidator implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Integer employees = (Integer) delegateExecution.getVariable(Variables.EMPLOYEES);
        boolean isRequestValid = employees > 0;
        delegateExecution.setVariable(Variables.IS_REQUEST_VALID, isRequestValid);
    }
}
