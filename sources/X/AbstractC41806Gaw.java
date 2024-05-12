package X;

/* renamed from: X.Gaw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41806Gaw<PARAM, RESULT> {
    public long LIZ;

    public abstract Object LIZIZ(Object obj, C41805Gav c41805Gav);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(X.AbstractC41806Gaw<PARAM, RESULT> r5, PARAM r6, X.InterfaceC67352kd<? super RESULT> r7) {
        /*
            boolean r0 = r7 instanceof X.C41805Gav
            if (r0 == 0) goto L38
            r4 = r7
            X.Gav r4 = (X.C41805Gav) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r2 = 1
            if (r0 == 0) goto L24
            if (r0 != r2) goto L3e
            X.C141335gf.LIZJ(r1)
        L20:
            java.lang.System.currentTimeMillis()
            return r1
        L24:
            X.C141335gf.LIZJ(r1)
            long r0 = java.lang.System.currentTimeMillis()
            r5.LIZ = r0
            r4.LJLIL = r5
            r4.LJLJJI = r2
            java.lang.Object r1 = r5.LIZIZ(r6, r4)
            if (r1 != r3) goto L20
            return r3
        L38:
            X.Gav r4 = new X.Gav
            r4.<init>(r5, r7)
            goto L12
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41806Gaw.LIZ(X.Gaw, java.lang.Object, X.2kd):java.lang.Object");
    }
}
