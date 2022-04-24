package com.examples;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) {
        Path p1= Paths.get("a/b");//relative
        Path p2= Paths.get("a/b/c");//aboslute
        Path p3= Paths.get("C:/a/b/c");//absolute
        printAboutPath(p1);printAboutPath(p2);printAboutPath(p3);
    }
    private static void printAboutPath(Path p){
        System.out.println(p.getFileName());
        System.out.println(p.getRoot());
        System.out.println(p.getParent());
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
    }
}
