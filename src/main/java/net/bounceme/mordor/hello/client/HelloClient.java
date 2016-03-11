package net.bounceme.mordor.hello.client;

import static java.lang.System.out;
import net.bounceme.mordor.hello.library.HelloLibrary;
        
public class HelloClient {

    public static void main(String[] args) {
        new HelloClient().runLibrary();
    }

    private void runLibrary() {
        HelloLibrary library = new HelloLibrary();
        out.println(library.hello("fred"));
    }

}
