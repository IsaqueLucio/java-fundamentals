package collections_framework.lists.security_alert_filter;

public class TestAlertFilter {
    public static void main(String[] args) {
        AlertMonitor alertMonitor = new AlertMonitor();

        SecurityAlert securityAlert1 = new SecurityAlert("Very dangerous!!! Run!!!", "CRITICAL");
        SecurityAlert securityAlert2 = new SecurityAlert("Too much danger, run!!!", "CRITICAL");
        SecurityAlert securityAlert3 = new SecurityAlert("Almost nothing.", "LOW");
        SecurityAlert securityAlert4 = new SecurityAlert("Danger, be careful.", "MEDIUM");
        SecurityAlert securityAlert5 = new SecurityAlert("Run faster!", "HIGH");

        alertMonitor.displayCriticalAlerts();
        
        alertMonitor.registerAlert(securityAlert1);
        alertMonitor.registerAlert(securityAlert2);
        alertMonitor.registerAlert(securityAlert3);
        alertMonitor.registerAlert(securityAlert4);
        alertMonitor.registerAlert(securityAlert5);

        alertMonitor.displayCriticalAlerts();
    }
}
