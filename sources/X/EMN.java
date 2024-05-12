package X;

/* loaded from: classes7.dex */
public final class EMN implements InterfaceC237529Tw {
    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(5:14|15|16|17|18)(2:11|12))(5:20|21|22|17|18))(2:24|(7:32|33|(1:35)|21|22|17|18)(7:28|29|(1:31)|15|16|17|18))))|40|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        r1 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005e, code lost:
    
        r1 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // X.InterfaceC237529Tw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.EnumC58085Mqv r9, X.InterfaceC67352kd<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.EMP
            if (r0 == 0) goto L21
            r7 = r10
            X.EMP r7 = (X.EMP) r7
            int r2 = r7.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r7.LJLJI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJI
            r5 = 1
            r4 = 2
            if (r0 == 0) goto L2f
            if (r0 == r5) goto L54
            if (r0 != r4) goto L27
            goto L7d
        L21:
            X.EMP r7 = new X.EMP
            r7.<init>(r8, r10)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C141335gf.LIZJ(r1)
            boolean r0 = X.C36289EMb.LIZ()
            r3 = 30
            r2 = 4
            if (r0 != 0) goto L41
            boolean r0 = X.EP5.LIZ()
            if (r0 == 0) goto L6a
        L41:
            X.EMK r1 = new X.EMK
            X.ELw r0 = new X.ELw
            r0.<init>(r9, r5, r2)
            r1.<init>(r9, r0, r3)
            r7.LJLJI = r5     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r1 = r1.LIZIZ(r7)     // Catch: java.lang.Throwable -> L5d
            if (r1 != r6) goto L57
            return r6
        L54:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L5d
        L57:
            X.9U5 r1 = (X.C9U5) r1     // Catch: java.lang.Throwable -> L5d
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L5d
            goto L65
        L5d:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L65:
            boolean r0 = X.C3C5.m13isSuccessimpl(r1)
            goto L92
        L6a:
            X.EML r1 = new X.EML
            X.ELw r0 = new X.ELw
            r0.<init>(r9, r5, r2)
            r1.<init>(r9, r0, r3)
            r7.LJLJI = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r1.LIZIZ(r7)     // Catch: java.lang.Throwable -> L86
            if (r1 != r6) goto L80
            return r6
        L7d:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L86
        L80:
            X.9U5 r1 = (X.C9U5) r1     // Catch: java.lang.Throwable -> L86
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L86
            goto L8e
        L86:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L8e:
            boolean r0 = X.C3C5.m13isSuccessimpl(r1)
        L92:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMN.LIZ(X.Mqv, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC237529Tw
    public final Object LIZIZ(EnumC58085Mqv enumC58085Mqv, InterfaceC67352kd<? super C9U5> interfaceC67352kd) {
        if (C36289EMb.LIZ() || EP5.LIZ()) {
            return new EMK(enumC58085Mqv, null, 62).LIZIZ(interfaceC67352kd);
        }
        return new EML(enumC58085Mqv, null, 62).LIZIZ(interfaceC67352kd);
    }

    @Override // X.InterfaceC237529Tw
    public final Object LIZJ(EnumC58085Mqv enumC58085Mqv, C54348LUq c54348LUq) {
        return new EMM(enumC58085Mqv).LIZIZ(c54348LUq);
    }
}
