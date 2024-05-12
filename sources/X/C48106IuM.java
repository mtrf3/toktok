package X;

/* renamed from: X.IuM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48106IuM implements InterfaceC48118IuY {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0038  */
    @Override // X.InterfaceC48118IuY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.net.InetAddress> LIZ(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = X.C47455Ijr.LJJIFFI
            r3 = 0
            if (r0 == 0) goto L29
            java.util.List r4 = com.bytedance.ttnet.TTNetInit.dnsLookup(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "TAG_PROXY_DNS"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "ttnet dns lookup: hostname: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L27
            r1.append(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = ", adds: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L27
            r1.append(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L27
            X.C48841JEv.LJIILIIL(r2, r0, r3)     // Catch: java.lang.Throwable -> L27
            goto L36
        L27:
            r0 = move-exception
            goto L2d
        L29:
            r4 = r3
            goto L36
        L2b:
            r0 = move-exception
            r4 = r3
        L2d:
            java.lang.String r1 = "TAG_PROXY_DNS"
            java.lang.String r0 = X.C48841JEv.LJIIL(r0)
            X.C48841JEv.LJIIIZ(r1, r0, r3)
        L36:
            if (r4 != 0) goto L5b
            X.IuX r0 = X.InterfaceC48118IuY.LIZ
            java.util.List r4 = r0.LIZ(r6)
            java.lang.String r2 = "TAG_PROXY_DNS"
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "system dns lookup: hostname: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", adds: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C48841JEv.LJIILIIL(r2, r0, r3)
        L5b:
            if (r6 == 0) goto L78
            if (r4 == 0) goto L78
            java.util.Map<java.lang.Long, android.util.Pair<java.lang.String, java.util.List<java.net.InetAddress>>> r3 = X.C48103IuJ.LIZJ
            java.lang.Class<X.Ijr> r2 = X.C47455Ijr.class
            monitor-enter(r2)
            long r0 = X.C47455Ijr.LJIL     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L6a:
            monitor-exit(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r6, r4)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            r3.put(r1, r0)
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48106IuM.LIZ(java.lang.String):java.util.List");
    }
}
