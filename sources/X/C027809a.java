package X;

import java.io.File;

/* renamed from: X.09a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C027809a {
    public static boolean LIZ(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                if (LIZ(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        C16880lQ.LLLZZIL(file);
        return true;
    }
}
