package action_classes;

import interfaces.ActionInterface;

public class DivideClass implements ActionInterface {

    @Override
    public int action(int a, int b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.err.println("Wrong value for b " +e.getMessage());
            return 0; // Return a default value zero
        }

    }
}
