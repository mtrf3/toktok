package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a36, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91964a36 {
    public final InterfaceC88472Yns<InterfaceC67352kd<? super String>, Object> LIZ;
    public final int LIZIZ;
    public String LIZJ;
    public Long LIZLLL;

    public C91964a36() {
        throw null;
    }

    public C91964a36(InterfaceC88472Yns refreshNonce) {
        o.LJIIIZ(refreshNonce, "refreshNonce");
        this.LIZ = refreshNonce;
        this.LIZIZ = 180000;
        this.LIZJ = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super java.lang.String> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C92853aHR
            if (r0 == 0) goto L6b
            r8 = r10
            X.aHR r8 = (X.C92853aHR) r8
            int r2 = r8.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r8.LJLJJI = r2
        L12:
            java.lang.Object r7 = r8.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJI
            r5 = 1
            if (r0 == 0) goto L3c
            if (r0 != r5) goto L79
            java.lang.Object r4 = r8.LJLIL
            X.a36 r4 = (X.C91964a36) r4
            X.C141335gf.LIZJ(r7)
        L24:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L71
            r4.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = r4.LIZIZ
            long r0 = (long) r0
            long r2 = r2 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.LIZLLL = r0
            r4.LIZJ = r7
            return r7
        L3c:
            X.C141335gf.LIZJ(r7)
            java.lang.Long r0 = r9.LIZLLL
            if (r0 != 0) goto L49
        L43:
            r0 = 0
        L44:
            if (r0 == 0) goto L5c
            java.lang.String r0 = r9.LIZJ
            return r0
        L49:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L43
            java.lang.Long r0 = r9.LIZLLL     // Catch: java.lang.Throwable -> L43
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> L43
            long r1 = r0.longValue()     // Catch: java.lang.Throwable -> L43
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L43
            r0 = 1
            goto L44
        L5c:
            r8.LJLIL = r9
            r8.LJLJJI = r5
            X.Yns<X.2kd<? super java.lang.String>, java.lang.Object> r0 = r9.LIZ
            java.lang.Object r7 = r0.invoke(r8)
            if (r7 != r6) goto L69
            return r6
        L69:
            r4 = r9
            goto L24
        L6b:
            X.aHR r8 = new X.aHR
            r8.<init>(r9, r10)
            goto L12
        L71:
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r0 = "get nonce failed"
            r1.<init>(r0)
            throw r1
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91964a36.LIZ(X.2kd):java.lang.Object");
    }
}
