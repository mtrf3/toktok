package X;

/* loaded from: classes16.dex */
public final class X8L extends AbstractC65781Prl implements InterfaceC88472Yns<Class<Object>, Object> {
    public final /* synthetic */ X8K LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X8L(X8K x8k) {
        super(1);
        this.LJLIL = x8k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r1 == false) goto L13;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Class<java.lang.Object> r7) {
        /*
            r6 = this;
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r0 = "service"
            kotlin.jvm.internal.o.LJIIJ(r7, r0)
            X.X8K r0 = r6.LJLIL
            T extends X.X8D r1 = r0.LJLJJI
            X.X8M r1 = (X.X8M) r1
            android.os.Bundle r0 = r0.LJLJJLL
            X.FLr r4 = r1.getPreloadStrategy(r0)
            java.lang.String r5 = r4.LIZJ
            java.lang.String r3 = ""
            if (r5 == 0) goto L6f
        L19:
            X.X8K r0 = r6.LJLIL
            android.os.Bundle r2 = r0.LJLJJLL
            boolean r0 = X.X8K.LJLJLLL
            if (r0 != 0) goto L62
            r1 = 0
            if (r2 == 0) goto L2a
            java.lang.String r0 = "power_net_preload_key_strict_mode"
            boolean r1 = r2.getBoolean(r0, r1)
        L2a:
            java.lang.String r0 = r4.LIZJ
            if (r0 == 0) goto L2f
            r3 = r0
        L2f:
            if (r1 != 0) goto L62
        L31:
            X.Ol8 r2 = X.X8K.LJLL
            java.lang.Object r0 = r2.getValue()
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r1 = r0.get(r3)
            X.38c r1 = (X.InterfaceC789838c) r1
            if (r1 == 0) goto L46
        L41:
            java.lang.Object r0 = r1.create(r7)
            return r0
        L46:
            X.X8K r0 = r6.LJLIL
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = r0.LJLJLJ
            X.PgZ r0 = r0.LIZ(r5)
            if (r0 == 0) goto L71
            r0.LJII = r4
            X.PgU r1 = r0.LJFF()
            if (r1 == 0) goto L71
            java.lang.Object r0 = r2.getValue()
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r3, r1)
            goto L41
        L62:
            java.lang.String r0 = r4.toString()
            int r0 = r0.hashCode()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            goto L31
        L6f:
            r5 = r3
            goto L19
        L71:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "power preload create failed"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X8L.invoke(java.lang.Object):java.lang.Object");
    }
}
