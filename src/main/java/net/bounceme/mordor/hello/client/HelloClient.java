package net.bounceme.mordor.hello.client;

import static java.lang.System.out;
import net.bounceme.mordor.hello.library.HelloLibrary;
        
public class HelloClient {

    public static void main(String... args) {
        new HelloClient().runLibrary(args);
    }

    private void runLibrary(String... args) {
        HelloLibrary library = new HelloLibrary();
        out.println(library.hello(args));
    }

}
