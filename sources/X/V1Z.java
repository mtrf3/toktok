package X;

/* loaded from: classes14.dex */
public final class V1Z implements InterfaceC65462ha<Object> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public V1Z(InterfaceC65462ha interfaceC65462ha, int i) {
        this.LJLIL = interfaceC65462ha;
        this.LJLILLLLZI = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r1.getOwner() != r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.InterfaceC65462ha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.InterfaceC64672gJ<? super java.lang.Object> r8, X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C79058V1a
            if (r0 == 0) goto L20
            r6 = r9
            X.V1a r6 = (X.C79058V1a) r6
            int r2 = r6.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 != r4) goto L2a
            X.2gJ r8 = r6.LJLJJI
            goto L26
        L20:
            X.V1a r6 = new X.V1a
            r6.<init>(r7, r9)
            goto L12
        L26:
            X.C141335gf.LIZJ(r1)     // Catch: X.C3CM -> L4e
            goto L55
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r1)
            X.2zl r3 = new X.2zl
            r3.<init>()
            X.2ha r2 = r7.LJLIL     // Catch: X.C3CM -> L4e
            X.TFx r1 = new X.TFx     // Catch: X.C3CM -> L4e
            int r0 = r7.LJLILLLLZI     // Catch: X.C3CM -> L4e
            r1.<init>(r3, r0, r8)     // Catch: X.C3CM -> L4e
            r6.LJLJJI = r8     // Catch: X.C3CM -> L4e
            r6.LJLILLLLZI = r4     // Catch: X.C3CM -> L4e
            java.lang.Object r0 = r2.collect(r1, r6)     // Catch: X.C3CM -> L4e
            if (r0 != r5) goto L55
            return r5
        L4e:
            r1 = move-exception
            X.2gJ r0 = r1.getOwner()
            if (r0 != r8) goto L58
        L55:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L58:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1Z.collect(X.2gJ, X.2kd):java.lang.Object");
    }
}
