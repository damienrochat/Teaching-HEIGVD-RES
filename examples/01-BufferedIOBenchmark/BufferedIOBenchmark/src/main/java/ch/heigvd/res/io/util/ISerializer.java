package ch.heigvd.res.io.util;

import java.io.PrintStream;

/**
 *
 * @author Damien Rochat
 */
public interface ISerializer {
    void serialize(IData data, PrintStream ps);
}
