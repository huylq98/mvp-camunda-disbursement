package vn.com.viettel.vds.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.com.viettel.vds.constant.Variables;

import javax.inject.Named;

@Named
public class NotificationSender implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(NotificationSender.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("SMS sent to {}", delegateExecution.getVariable(Variables.RECEIVER));
    }
}
