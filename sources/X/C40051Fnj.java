package X;

/* renamed from: X.Fnj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40051Fnj {
    public static String LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"")) {
            int indexOf = str.indexOf("\"", 1);
            if (indexOf == -1) {
                return null;
            }
            return str.substring(1, indexOf);
        }
        if (str.startsWith("'")) {
            int indexOf2 = str.indexOf("'", 1);
            if (indexOf2 == -1) {
                return null;
            }
            return str.substring(1, indexOf2);
        }
        return str;
    }

    public static String LIZJ(String str) {
        int i;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (str.startsWith("'") || str.startsWith("\"")) {
            i = 1;
        } else {
            i = 0;
        }
        if (str.endsWith("'") || str.endsWith("\"")) {
            length--;
        }
        if (i > length) {
            return null;
        }
        return str.substring(i, length);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C40052Fnk LIZ(X.VNU r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40051Fnj.LIZ(X.VNU, java.lang.String):X.Fnk");
    }
}
