package net.bounceme.mordor;

import static java.lang.System.out;
import net.bounceme.mordor.hello.HelloLibrary;

public class Hello {

    public static void main(String[] args) {
        new Hello().foo();
    }

    private void foo() {
        HelloLibrary foo = new HelloLibrary();
        out.println(foo.hello("hmm"));
    }

}
