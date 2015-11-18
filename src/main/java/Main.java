import pack.Cashflow;
import pack.RuleRunner;
import pack.TypedCashflow;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 */
public class Main {


    public static void main(String[] args) throws Exception {

        Object[] cashflows = {
                new Cashflow(new SimpleDate("01/01/2007"), 300.00),
                new Cashflow(new SimpleDate("05/01/2007"), 100.00),
                new Cashflow(new SimpleDate("11/01/2007"), 500.00),
                new Cashflow(new SimpleDate("07/01/2007"), 800.00),
                new Cashflow(new SimpleDate("02/01/2007"), 400.00),
        };

        Object[] cashflows2 = {
                new TypedCashflow(new SimpleDate("01/01/2007"),
                        TypedCashflow.CREDIT, 300.00),
                new TypedCashflow(new SimpleDate("05/01/2007"),
                        TypedCashflow.CREDIT, 100.00),
                new TypedCashflow(new SimpleDate("11/01/2007"),
                        TypedCashflow.CREDIT, 500.00),
                new TypedCashflow(new SimpleDate("07/01/2007"),
                        TypedCashflow.DEBIT, 800.00),
                new TypedCashflow(new SimpleDate("02/01/2007"),
                        TypedCashflow.DEBIT, 400.00),
        };


//        Number[] nums = {3, 1, 4, 1, 5};

        new RuleRunner().runRules(new String[]{"pack/rule.drl"},
                cashflows2);
    }
}

class SimpleDate extends Date {
    private static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public SimpleDate(String datestr) throws Exception {
        setTime(format.parse(datestr).getTime());
    }
}