package X;

/* renamed from: X.0j5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15430j5 {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r2.getBoolean(r0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(android.content.Context r7) {
        /*
            java.lang.String r3 = "android"
            r6 = 0
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = "get"
            r4 = 1
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L34
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r6] = r0     // Catch: java.lang.Exception -> L34
            java.lang.reflect.Method r2 = r5.getMethod(r2, r1)     // Catch: java.lang.Exception -> L34
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = "qemu.hw.mainkeys"
            r1[r6] = r0     // Catch: java.lang.Exception -> L34
            java.lang.Object r1 = r2.invoke(r5, r1)     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L2b
            goto L48
        L2b:
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L34
            goto L49
        L34:
            android.content.res.Resources r2 = r7.getResources()
            java.lang.String r1 = "bool"
            java.lang.String r0 = "config_showNavigationBar"
            int r0 = r2.getIdentifier(r0, r1, r3)
            if (r0 <= 0) goto L48
            boolean r0 = r2.getBoolean(r0)
            if (r0 != 0) goto L49
        L48:
            return r6
        L49:
            android.content.res.Resources r2 = r7.getResources()
            java.lang.String r1 = "navigation_bar_height"
            java.lang.String r0 = "dimen"
            int r0 = r2.getIdentifier(r1, r0, r3)
            if (r0 <= 0) goto L5c
            int r0 = r2.getDimensionPixelSize(r0)
            return r0
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15430j5.LIZ(android.content.Context):int");
    }
}
