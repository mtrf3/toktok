package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;

/* renamed from: X.PgW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65084PgW implements IHostNetworkDepend {
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final java.util.Map<String, Object> getAPIParams() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        r3.add(new com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor());
     */
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit createRetrofit(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "baseUrl"
            kotlin.jvm.internal.o.LJIIJ(r8, r0)
            X.EZH r4 = new X.EZH
            X.PgC r3 = new X.PgC
            r3.<init>()
            r3.LJ(r8)
            X.Pj0 r0 = X.C65238Pj0.LJFF()
            r3.LIZIZ(r0)
            X.PhY r0 = new X.PhY
            r6 = 0
            r0.<init>(r6)
            r3.LIZ(r0)
            X.Pc2 r0 = new X.Pc2
            r0.<init>()
            r3.LJI = r0
            com.bytedance.ttnet.retrofit.SsInterceptor r0 = new com.bytedance.ttnet.retrofit.SsInterceptor
            r0.<init>()
            r3.LIZJ(r0)
            if (r9 == 0) goto L40
            X.PbY r0 = new X.PbY
            r0.<init>()
        L35:
            r3.LIZIZ = r0
            com.ss.android.ugc.aweme.net.settings.PayLoadControl r0 = X.PXY.LIZ()
            boolean r0 = r0.enable
            if (r0 == 0) goto L76
            goto L46
        L40:
            X.Pge r0 = new X.Pge
            r0.<init>()
            goto L35
        L46:
            com.bytedance.common.utility.reflect.Reflect r2 = com.bytedance.common.utility.reflect.Reflect.on(r3)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "clientProvider"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L76
            com.bytedance.common.utility.reflect.Reflect r0 = r2.field(r1, r0)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L76
            X.Pc1 r0 = (X.InterfaceC64805Pc1) r0     // Catch: java.lang.Throwable -> L76
            X.PbZ r2 = r0.get()     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "com.ss.android.ugc.aweme.app.api.OkClient"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L76
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L71
            boolean r0 = r2 instanceof X.C64667PZn     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L71
            goto L76
        L71:
            X.PfT r5 = X.C65089Pgb.LIZ(r3)     // Catch: java.lang.Throwable -> L76
            goto Lbc
        L76:
            X.PfT r5 = X.C65089Pgb.LIZ(r3)
            java.util.List<X.Ej6> r1 = r5.LJIIIIZZ
            if (r1 == 0) goto Lbc
            com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor r0 = new com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor
            r0.<init>()
            r1.add(r0)
            com.ss.android.ugc.aweme.network.experiment.HybridTrafficColoringSettings$HybridTrafficColoringModel r0 = com.ss.android.ugc.aweme.network.experiment.HybridTrafficColoringSettings.LIZ()
            boolean r0 = r0.enabled
            if (r0 == 0) goto Laa
            java.util.List<X.Ej6> r3 = r5.LJIIIIZZ
            r2 = 0
        L91:
            int r0 = r3.size()
            r1 = -1
            if (r2 >= r0) goto La2
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r2)
            boolean r0 = r0 instanceof com.bytedance.helios.network.ttnet.TTNetMonitorInterceptor
            if (r0 == 0) goto Lce
            if (r2 != r1) goto Lc5
        La2:
            com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor r0 = new com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor
            r0.<init>()
            r3.add(r0)
        Laa:
            java.util.List<X.Ej6> r0 = r5.LJIIIIZZ
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.Ej6 r2 = (X.InterfaceC37216Ej6) r2
            java.util.List<X.Ej6> r1 = r5.LJIIIIZZ
            X.Ej5 r0 = new X.Ej5
            r0.<init>(r2)
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r1, r6, r0)
        Lbc:
            java.lang.String r0 = "Retrofit.Builder()\n     …\n                .build()"
            kotlin.jvm.internal.o.LJFF(r5, r0)
            r4.<init>(r5)
            return r4
        Lc5:
            com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor r0 = new com.ss.android.ugc.aweme.net.monitor.HybridTrafficColoringInterceptor
            r0.<init>()
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r3, r2, r0)
            goto Laa
        Lce:
            int r2 = r2 + 1
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65084PgW.createRetrofit(java.lang.String, boolean):com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit");
    }
}
