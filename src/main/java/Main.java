import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import pack.Fib;

/**
 */
public class Main {
    public static void main(String[] t) {

        KieServices ks = KieServices.Factory.get();

        KieContainer kc = ks.getKieClasspathContainer();

        KieSession ksession = kc.newKieSession("ksession1");

        ksession.insert(new Fib(50));

        ksession.fireAllRules();
    }
}
