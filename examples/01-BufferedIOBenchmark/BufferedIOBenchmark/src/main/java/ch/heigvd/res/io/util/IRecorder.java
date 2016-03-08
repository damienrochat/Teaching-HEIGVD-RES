package ch.heigvd.res.io.util;

/**
 *
 * @author Damien Rochat
 */
public interface IRecorder {
    void init();
    void record(IData data);
    void close();
}
