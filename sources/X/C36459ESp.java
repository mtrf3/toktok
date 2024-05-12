package X;

import java.io.File;

/* renamed from: X.ESp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36459ESp {
    public static long LIZ(File... fileArr) {
        long length;
        long j = 0;
        for (File file : fileArr) {
            try {
                File[] listFiles = file.listFiles();
                for (int i = 0; i < listFiles.length; i++) {
                    if (listFiles[i].isDirectory()) {
                        length = LIZ(listFiles[i]);
                    } else {
                        length = listFiles[i].length();
                    }
                    j += length;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return j;
    }
}
