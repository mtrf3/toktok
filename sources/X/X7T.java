package X;

import defpackage.i0;
import java.io.File;

/* loaded from: classes16.dex */
public class X7T implements X7E {
    public static final String[] LJLIL = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};

    public static final void LIZIZ(String str) {
        if (str == null || str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WCDB.DefaultDatabaseErrorHandler Remove database file: ");
        LIZ.append(str);
        C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
        File file = new File(str);
        File file2 = new File(file.getParentFile(), "corrupted");
        if (!file2.mkdirs()) {
            C63322OtC.LIZLLL("WCDB.DefaultDatabaseErrorHandler Could not create directory for corrupted database. Corruption backup may be unavailable.");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(file2.getPath());
        LIZ2.append("/");
        LIZ2.append(file.getName());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        for (String str2 : LJLIL) {
            String LJFF = i0.LJFF(str, str2);
            String LJFF2 = i0.LJFF(LIZIZ, str2);
            File file3 = new File(LJFF);
            if (!file3.renameTo(new File(LJFF2))) {
                C16880lQ.LLLZZIL(file3);
            }
        }
    }
}
