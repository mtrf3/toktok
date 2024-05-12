package X;

/* loaded from: classes10.dex */
public final class M5P extends M5R {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        if (r2 == null) goto L16;
     */
    @Override // X.M5R
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<java.lang.Boolean, java.lang.String> LIZ(X.M5X r7, java.util.HashMap<java.lang.String, java.lang.Object> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "appendedMap"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            android.net.Uri r4 = r7.LJLILLLLZI
            boolean r1 = X.C55878LwQ.LIZ()
            java.lang.String r0 = "//"
            if (r1 == 0) goto L3c
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r0)
            android.net.Uri r0 = r7.LJLJJI
            java.lang.String r0 = r0.getHost()
            r1.append(r0)
            android.net.Uri r0 = r7.LJLJJI
            java.lang.String r0 = r0.getPath()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
        L2c:
            com.bytedance.router.RouteManager r0 = com.bytedance.router.RouteManager.getInstance()
            java.util.Map r0 = r0.getExternalRouteMap()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r5 = 0
            goto L56
        L3c:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r0)
            java.lang.String r0 = r4.getHost()
            r1.append(r0)
            java.lang.String r0 = r4.getPath()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            goto L2c
        L56:
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L5b
            goto L61
        L5b:
            android.app.Activity r0 = r7.LJLIL
            r0.finish()
            r3 = r5
        L61:
            X.M5R.LIZIZ(r4, r7, r8)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r7.LJLJJL
            java.lang.String r2 = "is_async_render_fact"
            java.lang.Object r1 = r0.get(r2)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.o.LJII(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.put(r2, r0)
            if (r3 == 0) goto L84
            java.lang.Object r5 = r3.newInstance()
        L84:
            X.LUj r5 = (X.AbstractC54341LUj) r5
            if (r5 == 0) goto L97
            android.app.Activity r1 = r7.LJLIL
            java.lang.String r0 = r4.toString()
            r5.open(r1, r0, r8, r7)
            java.lang.String r2 = r5.getTargetPageName()
            if (r2 != 0) goto L99
        L97:
            java.lang.String r2 = ""
        L99:
            r6.LIZ = r2
            r0 = 1
            r6.LIZIZ = r0
            X.OSZ r1 = new X.OSZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M5P.LIZ(X.M5X, java.util.HashMap):X.OSZ");
    }
}
