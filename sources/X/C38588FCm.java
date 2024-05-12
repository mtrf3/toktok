package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FCm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38588FCm {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.util.List r4) {
        /*
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r3 = r4.next()
            X.EJ6 r3 = (X.EJ6) r3
            java.lang.String r2 = r3.LIZ
            r1 = 1
            java.lang.String r0 = "Location"
            boolean r0 = ujb.o.LJJJJIZL(r0, r2, r1)
            if (r0 == 0) goto L9
            java.lang.String r0 = r3.LIZIZ
            if (r0 != 0) goto L26
        L24:
            java.lang.String r0 = ""
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38588FCm.LIZ(java.util.List):java.lang.String");
    }

    public static boolean LIZIZ(android.net.Uri uri) {
        if (C38586FCk.LIZJ(uri) || (!o.LJ("link.e.tiktok.com", uri.getHost()))) {
            return true;
        }
        return false;
    }
}
