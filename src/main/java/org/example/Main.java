package org.example;

import java.util.ArrayList;
import java.util.Arrays;

class Main {
    static class Input {
        public Integer id;
        public Integer parent;
        public String name;

        public Input(Integer id, Integer parent, String name) {
            this.id = id;
            this.parent = parent;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Write a simple java function which displays in the console log a tree structure indented correctly and sorted by name, like the example below:

        /*
         1 root
           2 subfolder1
             3 nested11
             4 nested12
           5 subfolder2
             6 nested21
             7 nested22
        */

        var input = new ArrayList<Input>(Arrays.asList(
                new Input(7, 5, "nested22"),
                new Input(6, 5, "nested21"),
                new Input(5, 1, "subfolder2"),
                new Input(1, null, "root"),
                new Input(2, 1, "subfolder1"),
                new Input(3, 2, "nested11"),
                new Input(4, 2, "nested12")
        ));
    }
}