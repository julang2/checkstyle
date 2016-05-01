//Compilable with Java8
package com.puppycrawl.tools.checkstyle.checks.coding;

import java.math.BigDecimal;

public class InputFinalLocalVariableNameLambda {
    private interface Lambda {
        public Object op(AugmentedOrder a, AugmentedOrder b);
    }
    private static class AugmentedOrder {
        public BigDecimal reduce(final BigDecimal zero, final Lambda l) {
            return null;
        }
        public Object add(final Object amount) {
            return null;
        }
        public Object getAmount() {
            return null;
        }
    }

    private void addTotalValueOfOrder(final AugmentedOrder order) {
    final BigDecimal totalValueOfOrder = order
            .reduce(BigDecimal.ZERO,
                    (t, u) -> t.add(u.getAmount()));
 }
}
interface Operation {
    public Object apply();

    public static final Operation OPERATION = () -> {
        Object result;
        result = null;
        return result;
    };
}