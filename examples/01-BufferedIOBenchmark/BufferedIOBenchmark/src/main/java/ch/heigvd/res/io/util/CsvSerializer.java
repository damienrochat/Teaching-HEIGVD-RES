package ch.heigvd.res.io.util;

import java.io.PrintStream;

/**
 * @author Damien Rochat
 */
public class CsvSerializer implements ISerializer {

    public void serialize(IData data, PrintStream ps) {
        String csv = "";
        for (String entry : data.getValues())
            csv += entry + ",";
        csv = csv.substring(0, csv.length() - 1);
        ps.println(csv);
    }
}
