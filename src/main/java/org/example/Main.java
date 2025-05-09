package org.example;

import java.util.Comparator;
import java.util.List;

class Main {

    public static List<Input> allElements = List.of(
            new Input(7, 5, "nested22"),
            new Input(6, 5, "nested21"),
            new Input(5, 1, "subfolder2"),
            new Input(1, null, "root"),
            new Input(2, 1, "subfolder1"),
            new Input(3, 2, "nested11"),
            new Input(4, 2, "nested12")
    );

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
        var first = allElements.stream().filter(input -> input.parent == null).findFirst();
        if (first.isPresent()) {
            outputRecursively(first.get(), 0);
        } else {
            System.out.println("Not a tree;");
        }
    }


    public static void outputRecursively(Input currentLevel, int indent) {
        System.out.println(" ".repeat(indent) + currentLevel.id + " " + currentLevel.name);
        allElements.stream()
                .filter(input -> currentLevel.id.equals(input.parent))
                .sorted(Comparator.comparing(o -> o.name))
                .forEach(l -> outputRecursively(l, indent + 2));

    }
}