package org.courses.ex3_2;

import java.io.IOException;
import java.nio.file.*;

public class NewFile {
    public static void main(String[] args) throws IOException {

        Path pathtoFile = Paths.get("./NewFile.txt");
        Files.write(pathtoFile, "Hello, my friends!".getBytes(), StandardOpenOption.CREATE);
    }
}
