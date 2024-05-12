package X;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: X.0EI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0EI {
    public static final Charset LIZ = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void LIZ(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    LIZ(file2);
                }
                if (!C16880lQ.LLLZZIL(file2)) {
                    throw new IOException(C0F0.LIZJ("failed to delete file: ", file2));
                }
            }
            return;
        }
        throw new IOException(C0F0.LIZJ("not a readable directory: ", file));
    }
}
