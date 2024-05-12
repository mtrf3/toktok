package X;

import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes15.dex */
public final class WEC {
    public static void LIZ(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!C16880lQ.LLLZZIL(file)) {
                throw new WEH(file.getAbsolutePath(), new WEI(file.getAbsolutePath()));
            }
        }
        if (file.mkdirs() || file.isDirectory()) {
        } else {
            throw new WEH(file.getAbsolutePath());
        }
    }

    public static void LIZIZ(File file, File file2) {
        Throwable wei;
        file.getClass();
        file2.getClass();
        C16880lQ.LLLZZIL(file2);
        if (file.renameTo(file2)) {
            return;
        }
        if (!file2.exists()) {
            if (file.getParentFile().exists()) {
                if (!file.exists()) {
                    wei = new FileNotFoundException(file.getAbsolutePath());
                } else {
                    wei = null;
                }
            } else {
                wei = new WEJ(file.getAbsolutePath());
            }
        } else {
            wei = new WEI(file2.getAbsolutePath());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Unknown error renaming ");
        LIZ.append(file.getAbsolutePath());
        LIZ.append(" to ");
        LIZ.append(file2.getAbsolutePath());
        throw new C42298Gis(X1D.LIZIZ(LIZ), wei);
    }
}
