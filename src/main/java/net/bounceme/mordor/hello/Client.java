package net.bounceme.mordor.hello;

import static java.lang.System.out;
import net.bounceme.mordor.hello.HelloLibrary;

public class Client {

    public static void main(String[] args) {
        new Client().foo();
    }

    private void foo() {
        HelloLibrary foo = new HelloLibrary();
        out.println(foo.hello("hmm"));
    }

}
