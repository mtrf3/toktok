package X;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: X.X9p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84377X9p {
    public static final Charset LIZ = Charset.forName("US-ASCII");
    public static final char[] LIZIZ;
    public static final char[] LIZJ;

    static {
        Charset.forName("UTF-8");
        LIZIZ = new char[64];
        LIZJ = "0123456789abcdef".toCharArray();
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
