package vn.com.viettel.vds.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

@Named
public class ReArrangeDisbursement implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(ReArrangeDisbursement.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("Performing aggressively heavy task to arrange disbursement flow...");
    }
}
