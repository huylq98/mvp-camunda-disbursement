package vn.com.viettel.vds.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.com.viettel.vds.constant.Variables;

import javax.inject.Named;

@Named("disbursementRequestTerminator")
public class DisbursementRequestTerminator implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(DisbursementRequestTerminator.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String fileName = (String) delegateExecution.getVariable(Variables.FILE_NAME);
        log.info("Disbursement Request {} terminated", fileName);
    }
}
