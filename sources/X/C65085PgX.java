package X;

/* renamed from: X.PgX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65085PgX implements F9Q {
    public static C65019PfT LIZIZ(C65064PgC c65064PgC) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400200, "com/bytedance/retrofit2/Retrofit$Builder", "build", c65064PgC, new Object[0], "com.bytedance.retrofit2.Retrofit", new C65300Pk0(false, "()Lcom/bytedance/retrofit2/Retrofit;", "-6769672857672281710"));
        return LIZJ.LIZ ? (C65019PfT) LIZJ.LIZIZ : c65064PgC.LIZLLL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        r3.add(new com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor());
     */
    @Override // X.F9Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.F9P LIZ(java.lang.String r7) {
        /*
            r6 = this;
            X.Pgd r1 = new X.Pgd
            r1.<init>()
            X.PgC r3 = new X.PgC
            r3.<init>()
            r3.LJ(r7)
            X.Pc2 r0 = new X.Pc2
            r0.<init>()
            r3.LJI = r0
            com.bytedance.ttnet.retrofit.SsInterceptor r0 = new com.bytedance.ttnet.retrofit.SsInterceptor
            r0.<init>()
            r3.LIZJ(r0)
            r3.LIZIZ = r1
            com.ss.android.ugc.aweme.net.settings.PayLoadControl r0 = X.PXY.LIZ()
            boolean r0 = r0.enable
            r5 = 0
            if (r0 == 0) goto L57
            com.bytedance.common.utility.reflect.Reflect r2 = com.bytedance.common.utility.reflect.Reflect.on(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "clientProvider"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L57
            com.bytedance.common.utility.reflect.Reflect r0 = r2.field(r1, r0)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L57
            X.Pc1 r0 = (X.InterfaceC64805Pc1) r0     // Catch: java.lang.Throwable -> L57
            X.PbZ r2 = r0.get()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "com.ss.android.ugc.aweme.app.api.OkClient"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L57
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L52
            boolean r0 = r2 instanceof X.C64667PZn     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L52
            goto L57
        L52:
            X.PfT r4 = LIZIZ(r3)     // Catch: java.lang.Throwable -> L57
            goto L9d
        L57:
            X.PfT r4 = LIZIZ(r3)
            java.util.List<X.Ej6> r1 = r4.LJIIIIZZ
            if (r1 == 0) goto L9d
            com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor r0 = new com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor
            r0.<init>()
            r1.add(r0)
            com.ss.android.ugc.aweme.network.experiment.HybridTrafficColoringSettings$HybridTrafficColoringModel r0 = com.ss.android.ugc.aweme.network.experiment.HybridTrafficColoringSettings.LIZ()
            boolean r0 = r0.enabled
            if (r0 == 0) goto L8b
            java.util.List<X.Ej6> r3 = r4.LJIIIIZZ
            r2 = 0
        L72:
            int r0 = r3.size()
            r1 = -1
            if (r2 >= r0) goto L83
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r2)
            boolean r0 = r0 instanceof com.bytedance.helios.network.ttnet.TTNetMonitorInterceptor
            if (r0 == 0) goto Lac
            if (r2 != r1) goto La3
        L83:
            com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor r0 = new com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor
            r0.<init>()
            r3.add(r0)
        L8b:
            java.util.List<X.Ej6> r0 = r4.LJIIIIZZ
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            X.Ej6 r2 = (X.InterfaceC37216Ej6) r2
            java.util.List<X.Ej6> r1 = r4.LJIIIIZZ
            X.Ej5 r0 = new X.Ej5
            r0.<init>(r2)
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r1, r5, r0)
        L9d:
            X.F9R r0 = new X.F9R
            r0.<init>(r4)
            return r0
        La3:
            com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor r0 = new com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor
            r0.<init>()
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r3, r2, r0)
            goto L8b
        Lac:
            int r2 = r2 + 1
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65085PgX.LIZ(java.lang.String):X.F9P");
    }
}
