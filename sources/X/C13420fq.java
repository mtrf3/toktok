package X;

/* renamed from: X.0fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13420fq {
    public final C12070df<C13400fo, C13390fn> LIZ = new C12070df<>();
    public final C12080dg<C13400fo, C13390fn> LIZIZ = new C12080dg<>(0);
    public final C78605Ut7 LIZJ = new C78605Ut7();

    public final C13390fn LIZ(InterfaceC13460fu interfaceC13460fu, InterfaceC13350fj interfaceC13350fj) {
        C13390fn LIZ;
        interfaceC13350fj.getCacheKey();
        C13400fo c13400fo = new C13400fo(interfaceC13460fu, null);
        synchronized (this.LIZJ) {
            LIZ = this.LIZ.LIZ(c13400fo);
            if (LIZ == null) {
                LIZ = this.LIZIZ.LIZ(c13400fo);
            }
        }
        return LIZ;
    }

    public static void LIZIZ(C13420fq c13420fq, InterfaceC13460fu interfaceC13460fu, InterfaceC13350fj interfaceC13350fj, Object obj) {
        interfaceC13350fj.getCacheKey();
        C13400fo c13400fo = new C13400fo(interfaceC13460fu, null);
        synchronized (c13420fq.LIZJ) {
            if (obj == null) {
            } else {
                c13420fq.LIZ.LIZIZ(c13400fo, new C13390fn(obj));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC13460fu r9, X.InterfaceC13350fj r10, X.C2ED r11, X.InterfaceC67352kd r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C21C
            if (r0 == 0) goto L63
            r7 = r12
            X.21C r7 = (X.C21C) r7
            int r2 = r7.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r7.LJLJJLL = r2
        L12:
            java.lang.Object r2 = r7.LJLJJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJLL
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L90
            boolean r1 = r7.LJLJI
            X.0fo r3 = r7.LJLILLLLZI
            X.0fq r0 = r7.LJLIL
            X.C141335gf.LIZJ(r2)
        L27:
            X.Ut7 r4 = r0.LIZJ
            monitor-enter(r4)
            if (r2 != 0) goto L74
            goto L69
        L2d:
            X.C141335gf.LIZJ(r2)
            X.0fo r3 = new X.0fo
            r10.getCacheKey()
            r3.<init>(r9, r5)
            X.Ut7 r1 = r8.LIZJ
            monitor-enter(r1)
            X.0df<X.0fo, X.0fn> r0 = r8.LIZ     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = r0.LIZ(r3)     // Catch: java.lang.Throwable -> L9c
            X.0fn r0 = (X.C13390fn) r0     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L4d
            X.0dg<X.0fo, X.0fn> r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = r0.LIZ(r3)     // Catch: java.lang.Throwable -> L9c
            X.0fn r0 = (X.C13390fn) r0     // Catch: java.lang.Throwable -> L9c
        L4d:
            if (r0 == 0) goto L50
            goto L98
        L50:
            monitor-exit(r1)
            r7.LJLIL = r8
            r7.LJLILLLLZI = r3
            r1 = 0
            r7.LJLJI = r1
            r7.LJLJJLL = r4
            java.lang.Object r2 = r11.invoke(r7)
            if (r2 != r6) goto L61
            return r6
        L61:
            r0 = r8
            goto L27
        L63:
            X.21C r7 = new X.21C
            r7.<init>(r8, r12)
            goto L12
        L69:
            X.0dg<X.0fo, X.0fn> r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> L8d
            X.0fn r0 = new X.0fn     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L8d
            r1.LIZLLL(r3, r0)     // Catch: java.lang.Throwable -> L8d
            goto L8b
        L74:
            if (r1 == 0) goto L81
            X.0dg<X.0fo, X.0fn> r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> L8d
            X.0fn r0 = new X.0fn     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8d
            r1.LIZLLL(r3, r0)     // Catch: java.lang.Throwable -> L8d
            goto L8b
        L81:
            X.0df<X.0fo, X.0fn> r1 = r0.LIZ     // Catch: java.lang.Throwable -> L8d
            X.0fn r0 = new X.0fn     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8d
            r1.LIZIZ(r3, r0)     // Catch: java.lang.Throwable -> L8d
        L8b:
            monitor-exit(r4)
            return r2
        L8d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L98:
            java.lang.Object r0 = r0.LIZ     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r1)
            return r0
        L9c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13420fq.LIZJ(X.0fu, X.0fj, X.2ED, X.2kd):java.lang.Object");
    }
}
