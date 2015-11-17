import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import pack.State;

/**
 */
public class Main {
    public static void main(String[] t) {

        KieServices ks = KieServices.Factory.get();

        KieContainer kc = ks.getKieClasspathContainer();

        KieSession ksession = kc.newKieSession("ksession1");

        final State a = new State("A");
        final State b = new State("B");
        final State c = new State("C");
        final State d = new State("D");

        ksession.insert(a);
        ksession.insert(b);
        ksession.insert(c);
        ksession.insert(d);

        ksession.fireAllRules();

        ksession.dispose();

    }
}
