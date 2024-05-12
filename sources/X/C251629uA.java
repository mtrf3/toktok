package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.9uA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251629uA {
    public final String LIZ = "newpendant";

    public final String LIZ(String str) {
        String str2;
        Context LJ;
        String path;
        StringBuilder LIZ = X1D.LIZ();
        String str3 = this.LIZ;
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null && (LJ = abstractC247499nV.LJ()) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            File LLIIIZ = C16880lQ.LLIIIZ(LJ);
            if (LLIIIZ != null || (LLIIIZ = C16880lQ.LLIIIL(LJ)) != null) {
                path = LLIIIZ.getPath();
            } else {
                path = null;
            }
            LIZ2.append(path);
            str2 = JBR.LJFF(LIZ2, File.separator, str3, LIZ2);
        } else {
            str2 = "";
        }
        LIZ.append(str2);
        return JBR.LJFF(LIZ, File.separator, str, LIZ);
    }

    public static String LIZIZ(String str, boolean z) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        if (z) {
            str2 = ".zip";
        } else {
            str2 = "";
        }
        LIZ.append(str2);
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZJ(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZ(str));
        LIZ.append(File.separator);
        LIZ.append(LIZIZ(str2, false));
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZLLL(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZ(str));
        LIZ.append(File.separator);
        LIZ.append(LIZIZ(str2, true));
        return X1D.LIZIZ(LIZ);
    }
}
