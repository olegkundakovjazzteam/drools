import pack.RuleRunner;

/**
 * Created by JazzTeamUser on 13.11.2015.
 */
public class Main {
    //    public static void main(String[] t) {
//
//        KieServices ks = KieServices.Factory.get();
//
//        KieContainer kc = ks.getKieClasspathContainer();
//
//        KieSession ksession = kc.newKieSession("ksession1");
//
//
//        ksession.fireAllRules();
//    }
    public static void main(String[] args) throws Exception {
        new RuleRunner().runRules(new String[]{"pack/rule.drl"},
                new Object[0]);
    }
}
