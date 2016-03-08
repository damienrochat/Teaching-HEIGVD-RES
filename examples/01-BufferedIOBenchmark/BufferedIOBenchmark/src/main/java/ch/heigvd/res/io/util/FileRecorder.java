package ch.heigvd.res.io.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author Damien Rochat
 */
public class FileRecorder implements IRecorder {

    private String fileName;
    private ISerializer serializer;
    private PrintStream printStream;

    public FileRecorder(String fileName, ISerializer serializer) {
        this.fileName = fileName;
        this.serializer = serializer;
    }

    public void init() {
        File outputFile = new File(fileName);
        try {
            printStream = new PrintStream(outputFile);
        }
        catch (FileNotFoundException e) {}
    }

    public void record(IData data) {
        serializer.serialize(data, printStream);
    }

    public void close() {
        printStream.close();
    }
}
