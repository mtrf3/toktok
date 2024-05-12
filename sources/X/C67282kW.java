package X;

/* renamed from: X.2kW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67282kW {
    public static final C67282kW LIZ = new C67282kW();

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:13)(2:10|11))(3:27|28|(1:30))|14|(2:18|19)|23|24|25))|33|6|7|(0)(0)|14|(3:16|18|19)|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r8, java.lang.String r9, X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C64612gD
            if (r0 == 0) goto L1e
            r6 = r10
            X.2gD r6 = (X.C64612gD) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L24
            goto L98
        L1e:
            X.2gD r6 = new X.2gD
            r6.<init>(r7, r10)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r1)
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "experiment_version"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Throwable -> Lc4
            X.2wP r0 = com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.OrderCenterApi.LIZ     // Catch: java.lang.Throwable -> Lc4
            r0.getClass()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "previousPage"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)     // Catch: java.lang.Throwable -> Lc4
            X.38c r1 = X.C74652wP.LIZIZ     // Catch: java.lang.Throwable -> Lc4
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.OrderCenterApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.OrderCenterApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Throwable -> Lc4
            com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.OrderCenterApi r0 = (com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api.OrderCenterApi) r0     // Catch: java.lang.Throwable -> Lc4
            X.Svk r1 = r0.getOrderCenter(r2, r9)     // Catch: java.lang.Throwable -> Lc4
            r6.getClass()     // Catch: java.lang.Throwable -> Lc4
            r6.getClass()     // Catch: java.lang.Throwable -> Lc4
            r6.LJLJI = r3     // Catch: java.lang.Throwable -> Lc4
            X.XKS r4 = new X.XKS     // Catch: java.lang.Throwable -> Lc4
            X.2kd r0 = X.C78555UsJ.LJJII(r6)     // Catch: java.lang.Throwable -> Lc4
            r4.<init>(r3, r0)     // Catch: java.lang.Throwable -> Lc4
            r4.LJIIL()     // Catch: java.lang.Throwable -> Lc4
            X.T0k r0 = X.T16.LIZ()     // Catch: java.lang.Throwable -> Lc4
            X.Sro r1 = r1.LJJL(r0)     // Catch: java.lang.Throwable -> Lc4
            X.T0k r0 = X.C73969T1h.LIZIZ()     // Catch: java.lang.Throwable -> Lc4
            X.SsE r3 = r1.LJJJ(r0)     // Catch: java.lang.Throwable -> Lc4
            Y.AfS53S0100000_1 r2 = new Y.AfS53S0100000_1     // Catch: java.lang.Throwable -> Lc4
            r0 = 50
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> Lc4
            Y.AfS53S0100000_1 r1 = new Y.AfS53S0100000_1     // Catch: java.lang.Throwable -> Lc4
            r0 = 51
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> Lc4
            X.3kP r2 = r3.LJJJLIIL(r2, r1)     // Catch: java.lang.Throwable -> Lc4
            kotlin.jvm.internal.AqS167S0100000_1 r1 = new kotlin.jvm.internal.AqS167S0100000_1     // Catch: java.lang.Throwable -> Lc4
            r0 = 249(0xf9, float:3.49E-43)
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lc4
            r4.LJIILIIL(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r1 = r4.LJIIJJI()     // Catch: java.lang.Throwable -> Lc4
            if (r1 != r5) goto L9b
            return r5
        L98:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> Lc4
        L9b:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r1 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r1     // Catch: java.lang.Throwable -> Lc4
            if (r1 == 0) goto Lbe
            boolean r0 = r1.isCodeOK()     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto Lbe
            java.lang.String r2 = X.C27739Aud.LJI(r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "order_center_prefetch"
            java.lang.String r0 = X.C71284RyK.LIZJ     // Catch: java.lang.Throwable -> Lb6
            X.C71284RyK.LIZIZ(r1, r0, r2)     // Catch: java.lang.Throwable -> Lb6
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Lb6
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> Lb6
            goto Lbe
        Lb6:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Throwable -> Lc4
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> Lc4
        Lbe:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Lc4
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> Lc4
            goto Lcc
        Lc4:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        Lcc:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67282kW.LIZ(java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }
}
