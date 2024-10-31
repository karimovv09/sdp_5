class Lab11 {

    interface ComputerPart {
        void accept(ComputerPartVisitor computerPartVisitor);
    }

    static class Keyboard implements ComputerPart {
        public void accept(ComputerPartVisitor computerPartVisitor) {
            computerPartVisitor.visit(this);
        }
    }

    static class Monitor implements ComputerPart {
        public void accept(ComputerPartVisitor computerPartVisitor) {
            computerPartVisitor.visit(this);
        }
    }

    static class Mouse implements ComputerPart {
        public void accept(ComputerPartVisitor computerPartVisitor) {
            computerPartVisitor.visit(this);
        }
    }

    interface ComputerPartVisitor {
        void visit(Keyboard keyboard);
        void visit(Monitor monitor);
        void visit(Mouse mouse);
    }

    static class ComputerPartDisplayVisitor implements ComputerPartVisitor {
        public void visit(Keyboard keyboard) {
            System.out.println("Displaying Keyboard.");
        }

        public void visit(Monitor monitor) {
            System.out.println("Displaying Monitor.");
        }

        public void visit(Mouse mouse) {
            System.out.println("Displaying Mouse.");
        }
    }

    public void demonstrate() {
        ComputerPart keyboard = new Keyboard();
        ComputerPart monitor = new Monitor();
        ComputerPart mouse = new Mouse();

        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

        keyboard.accept(visitor);
        monitor.accept(visitor);
        mouse.accept(visitor);
    }
}
