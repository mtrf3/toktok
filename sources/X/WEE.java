package X;

import java.io.File;

/* loaded from: classes15.dex */
public class WEE {
    public final String LIZ;
    public final String LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("(");
        return JBR.LJFF(LIZ, this.LIZIZ, ")", LIZ);
    }

    public static WEE LIZ(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf <= 0) {
            return null;
        }
        String substring = name.substring(lastIndexOf);
        String str = ".cnt";
        if (!".cnt".equals(substring)) {
            if (!".tmp".equals(substring)) {
                return null;
            }
            str = ".tmp";
        }
        String substring2 = name.substring(0, lastIndexOf);
        if (str.equals(".tmp")) {
            int lastIndexOf2 = substring2.lastIndexOf(46);
            if (lastIndexOf2 <= 0) {
                return null;
            }
            substring2 = substring2.substring(0, lastIndexOf2);
        }
        return new WEE(str, substring2);
    }

    public WEE(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
