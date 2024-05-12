package X;

/* renamed from: X.X4h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC84239X4h implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ X5M LJLILLLLZI;
    public final /* synthetic */ long LJLJI = 2000;
    public final /* synthetic */ C84240X4i LJLJJI;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r1 = r2.LIZ;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #2 {all -> 0x008a, blocks: (B:3:0x000b, B:4:0x0015, B:9:0x0021, B:12:0x003d, B:16:0x0045, B:20:0x006a, B:23:0x0071, B:24:0x007a, B:26:0x0081, B:30:0x0078, B:36:0x0089, B:6:0x0016, B:7:0x001e), top: B:2:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r12 = this;
            X.X4i r8 = r12.LJLJJI
            java.lang.String r7 = r12.LJLIL
            X.X5M r6 = r12.LJLILLLLZI
            long r3 = r12.LJLJI
            r8.getClass()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = r0.getHost()     // Catch: java.lang.Throwable -> L8a
            X.X40<java.lang.String, X.X5A> r1 = r8.LIZ     // Catch: java.lang.Throwable -> L8a
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L8a
            X.X40<java.lang.String, X.X5A> r0 = r8.LIZ     // Catch: java.lang.Throwable -> L87
            java.lang.Object r2 = r0.get(r5)     // Catch: java.lang.Throwable -> L87
            X.X5A r2 = (X.X5A) r2     // Catch: java.lang.Throwable -> L87
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L45
            X.X4H r9 = X.X4H.LJFF     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = "dns_expire_min"
            r0 = 10
            int r9 = r9.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L8a
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L8a
            long r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L8a
            long r10 = r10 - r0
            int r0 = r9 * 60
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L8a
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 >= 0) goto L45
            if (r6 == 0) goto L8a
            java.util.List<java.net.InetAddress> r0 = r2.LIZ     // Catch: java.lang.Throwable -> L8a
            X.X4U r6 = (X.X4U) r6     // Catch: java.lang.Throwable -> L8a
            r6.LJJII(r7, r0)     // Catch: java.lang.Throwable -> L8a
            goto L8a
        L45:
            Y.ARunnableS14S1200000_15 r9 = new Y.ARunnableS14S1200000_15     // Catch: java.lang.Throwable -> L8a
            r0 = 3
            r9.<init>(r2, r7, r6, r0)     // Catch: java.lang.Throwable -> L8a
            android.os.Handler r0 = r8.LIZJ     // Catch: java.lang.Throwable -> L8a
            r0.postDelayed(r9, r3)     // Catch: java.lang.Throwable -> L8a
            X.X4H r3 = X.X4H.LJFF     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = "use_host_dns"
            r1 = 1
            int r0 = r3.LJIIIIZZ(r0, r1)     // Catch: java.lang.Throwable -> L8a
            X.X3o r0 = X.C84212X3g.LJII()     // Catch: java.lang.Throwable -> L8a
            X.X3k r0 = (X.C84216X3k) r0     // Catch: java.lang.Throwable -> L75
            r0.getClass()     // Catch: java.lang.Throwable -> L75
            X.IuX r0 = X.InterfaceC48118IuY.LIZ     // Catch: java.lang.Throwable -> L75
            java.util.List r1 = r0.LIZ(r5)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L76
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L71
            goto L76
        L71:
            r8.LIZ(r5, r1)     // Catch: java.lang.Throwable -> L8a
            goto L7a
        L75:
            r1 = 0
        L76:
            if (r2 == 0) goto L7a
            java.util.List<java.net.InetAddress> r1 = r2.LIZ     // Catch: java.lang.Throwable -> L8a
        L7a:
            android.os.Handler r0 = r8.LIZJ     // Catch: java.lang.Throwable -> L8a
            r0.removeCallbacks(r9)     // Catch: java.lang.Throwable -> L8a
            if (r6 == 0) goto L8a
            X.X4U r6 = (X.X4U) r6     // Catch: java.lang.Throwable -> L8a
            r6.LJJII(r7, r1)     // Catch: java.lang.Throwable -> L8a
            goto L8a
        L87:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L8a
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC84239X4h.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC84239X4h(C84240X4i c84240X4i, String str, X5M x5m) {
        this.LJLJJI = c84240X4i;
        this.LJLIL = str;
        this.LJLILLLLZI = x5m;
    }
}
