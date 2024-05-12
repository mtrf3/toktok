package X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes15.dex */
public final class WFR {
    public static final Logger LIZ = Logger.getLogger(WFR.class.getName());

    public static void LIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            LIZ.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
        }
    }

    public static void LIZIZ(InputStream inputStream) {
        try {
            LIZ(inputStream);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
