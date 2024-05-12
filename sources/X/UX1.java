package X;

/* loaded from: classes14.dex */
public abstract class UX1<T> implements InterfaceC65462ha<T> {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC65462ha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.InterfaceC64672gJ<? super T> r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.UX0
            if (r0 == 0) goto L20
            r5 = r8
            X.UX0 r5 = (X.UX0) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 != r2) goto L2c
            X.Ua7 r1 = r5.LJLIL
            goto L26
        L20:
            X.UX0 r5 = new X.UX0
            r5.<init>(r6, r8)
            goto L12
        L26:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Throwable -> L2a
            goto L55
        L2a:
            r0 = move-exception
            goto L5c
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r4)
            X.Ua7 r1 = new X.Ua7
            X.MBA r0 = r5.getContext()
            r1.<init>(r7, r0)
            r5.LJLIL = r1     // Catch: java.lang.Throwable -> L5b
            r5.LJLJJI = r2     // Catch: java.lang.Throwable -> L5b
            r0 = r6
            X.3C3 r0 = (X.C3C3) r0     // Catch: java.lang.Throwable -> L5b
            X.Ynr<X.2gJ<? super T>, X.2kd<? super X.UCe>, java.lang.Object> r0 = r0.LJLIL     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r0.invoke(r1, r5)     // Catch: java.lang.Throwable -> L5b
            if (r0 != r3) goto L50
            goto L52
        L50:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L5b
        L52:
            if (r0 != r3) goto L55
            return r3
        L55:
            r1.releaseIntercepted()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5b:
            r0 = move-exception
        L5c:
            r1.releaseIntercepted()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UX1.collect(X.2gJ, X.2kd):java.lang.Object");
    }
}
