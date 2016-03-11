package net.bounceme.mordor.hello.client;

import static java.lang.System.out;
import net.bounceme.mordor.hello.library.HelloLibrary;
        
public class Client {

    public static void main(String[] args) {
        new Client().runLibrary();
    }

    private void runLibrary() {
        HelloLibrary library = new HelloLibrary();
        out.println(library.hello("fred"));
    }

}
