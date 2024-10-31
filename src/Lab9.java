class Lab9 {

    interface Strategy {
        int doOperation(int num1, int num2);
    }

    static class OperationAdd implements Strategy {
        public int doOperation(int num1, int num2) {
            return num1 + num2;
        }
    }

    static class OperationSubtract implements Strategy {
        public int doOperation(int num1, int num2) {
            return num1 - num2;
        }
    }

    static class OperationMultiply implements Strategy {
        public int doOperation(int num1, int num2) {
            return num1 * num2;
        }
    }

    static class Context {
        private Strategy strategy;

        public Context(Strategy strategy) {
            this.strategy = strategy;
        }

        public int executeStrategy(int num1, int num2) {
            return strategy.doOperation(num1, num2);
        }
    }

    public void demonstrate() {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
