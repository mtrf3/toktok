package X;

import java.net.URISyntaxException;

/* loaded from: classes7.dex */
public final class EZY {
    public static java.net.URI LIZIZ(String str) {
        if (C38354F3m.LJ(str)) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return java.net.URI.create(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static java.net.URI LIZJ(String str) {
        if (C38354F3m.LJ(str)) {
            return null;
        }
        try {
            try {
                return new java.net.URI(str);
            } catch (Exception unused) {
                return LIZIZ(str);
            }
        } catch (URISyntaxException unused2) {
            return java.net.URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r5 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.URI LIZ(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r4 == 0) goto Lf
            r2.append(r4)
            java.lang.String r0 = "://"
            r2.append(r0)
        Lf:
            java.lang.String r0 = ""
            r2.append(r0)
            if (r3 <= 0) goto L1e
            r0 = 58
            r2.append(r0)
            r2.append(r3)
        L1e:
            if (r5 == 0) goto L28
            java.lang.String r0 = "/"
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L2f
        L28:
            r0 = 47
            r2.append(r0)
            if (r5 == 0) goto L32
        L2f:
            r2.append(r5)
        L32:
            if (r6 == 0) goto L3c
            r0 = 63
            r2.append(r0)
            r2.append(r6)
        L3c:
            if (r7 == 0) goto L46
            r0 = 35
            r2.append(r0)
            r2.append(r7)
        L46:
            java.net.URI r1 = new java.net.URI
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZY.LIZ(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.net.URI");
    }
}
