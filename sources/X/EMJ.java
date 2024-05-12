package X;

/* loaded from: classes7.dex */
public abstract class EMJ {
    public final C37065Egf LIZ;
    public final XKW LIZIZ;

    public abstract Object LIZJ(InterfaceC67352kd<? super C9U5> interfaceC67352kd);

    public boolean LIZ() {
        return C77266UUc.LIZIZ.LJIILLIIL().LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C9U5> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.EMI
            if (r0 == 0) goto L20
            r5 = r7
            X.EMI r5 = (X.EMI) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            X.EMJ r2 = r5.LJLIL
            goto L51
        L20:
            X.EMI r5 = new X.EMI
            r5.<init>(r6, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r1)
            boolean r0 = r6.LIZ()
            r2 = 0
            if (r0 == 0) goto L6b
            X.Egf r0 = r6.LIZ     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L63
            r0.LIZ()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L63
            X.XKW r1 = r6.LIZIZ     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L63
            X.EMH r0 = new X.EMH     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L63
            r0.<init>(r6, r2)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L63
            r5.LJLIL = r6     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L63
            r5.LJLJJI = r3     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L63
            java.lang.Object r1 = X.XKX.LJI(r1, r0, r5)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L63
            if (r1 != r4) goto L4f
            return r4
        L4f:
            r2 = r6
            goto L54
        L51:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L61
        L54:
            X.9U5 r1 = (X.C9U5) r1     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L61
            X.Egf r0 = r2.LIZ
            r0.LIZIZ()
            return r1
        L5c:
            r0 = move-exception
            goto L60
        L5e:
            r0 = move-exception
            r2 = r6
        L60:
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r1 = move-exception
            goto L65
        L63:
            r1 = move-exception
            r2 = r6
        L65:
            X.Egf r0 = r2.LIZ
            r0.LIZIZ()
            throw r1
        L6b:
            r1 = 100
            r0 = 62
            X.C73802v2.LIZIZ(r1, r2, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "no relevant permissions!"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMJ.LIZIZ(X.2kd):java.lang.Object");
    }

    public EMJ(C37065Egf c37065Egf, XKW xkw) {
        this.LIZ = c37065Egf;
        this.LIZIZ = xkw;
    }
}
