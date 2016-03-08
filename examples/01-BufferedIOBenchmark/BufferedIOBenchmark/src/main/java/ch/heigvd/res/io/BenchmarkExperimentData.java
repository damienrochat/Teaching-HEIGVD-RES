package ch.heigvd.res.io;

import ch.heigvd.res.io.util.IData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Damien Rochat
 */
public class BenchmarkExperimentData implements IData {

    private String operation;
    private String strategy;
    private long blockSize;
    private long fileSizeInBytes;
    private long durationInMs;

    public BenchmarkExperimentData(String operation, String strategy, long blockSize, long fileSizeInBytes, long durationInMs) {
        this.operation = operation;
        this.strategy = strategy;
        this.blockSize = blockSize;
        this.fileSizeInBytes = fileSizeInBytes;
        this.durationInMs = durationInMs;
    }

    @Override
    public List<String> getValues() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(operation);
        list.add(strategy);
        list.add(Long.toString(blockSize));
        list.add(Long.toString(fileSizeInBytes));
        list.add(Long.toString(durationInMs));
        return list;
    }
}
