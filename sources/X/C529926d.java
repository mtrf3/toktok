package X;

import kotlin.jvm.internal.o;

/* renamed from: X.26d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C529926d implements InterfaceC44041o8 {
    public final InterfaceC44041o8 LJLIL;
    public final C24770y9 LJLILLLLZI = new C24770y9();

    public final void LIZLLL() {
        C24770y9 c24770y9 = this.LJLILLLLZI;
        synchronized (c24770y9.LIZ) {
            c24770y9.LIZLLL = false;
        }
    }

    @Override // X.MBD
    public final InterfaceC48698J9i getKey() {
        return InterfaceC44041o8.LJJLIL;
    }

    public C529926d(InterfaceC44041o8 interfaceC44041o8) {
        this.LJLIL = interfaceC44041o8;
    }

    @Override // X.MBD, X.MBA
    public final <E extends MBD> E get(InterfaceC48698J9i<E> key) {
        o.LJIIIZ(key, "key");
        return (E) MBC.LIZ(this, key);
    }

    @Override // X.MBA
    public final MBA minusKey(InterfaceC48698J9i<?> key) {
        o.LJIIIZ(key, "key");
        return MBC.LIZIZ(this, key);
    }

    @Override // X.MBA
    public final MBA plus(MBA context) {
        o.LJIIIZ(context, "context");
        return MBE.LIZ(this, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[PHI: r2
      0x0023: PHI (r2v3 java.lang.Object) = (r2v2 java.lang.Object), (r2v0 java.lang.Object) binds: [B:17:0x0079, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.InterfaceC44041o8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object LJIIJ(X.InterfaceC88472Yns<? super java.lang.Long, ? extends R> r8, X.InterfaceC67352kd<? super R> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C529826c
            if (r0 == 0) goto L7c
            r5 = r9
            X.26c r5 = (X.C529826c) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r2 = r5.LJLJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L24
            if (r0 != r4) goto L82
            X.C141335gf.LIZJ(r2)
        L23:
            return r2
        L24:
            X.Yns r8 = r5.LJLILLLLZI
            X.26d r0 = r5.LJLIL
            X.C141335gf.LIZJ(r2)
            goto L6c
        L2c:
            X.C141335gf.LIZJ(r2)
            X.0y9 r3 = r7.LJLILLLLZI
            r5.LJLIL = r7
            r5.LJLILLLLZI = r8
            r5.LJLJJL = r1
            boolean r0 = r3.LIZ()
            if (r0 == 0) goto L42
            X.UCe r0 = X.C76800UCe.LIZ
        L3f:
            if (r0 != r6) goto L6b
            return r6
        L42:
            X.XKS r2 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r5)
            r2.<init>(r1, r0)
            r2.LJIIL()
            java.lang.Object r1 = r3.LIZ
            monitor-enter(r1)
            java.util.List<X.2kd<X.UCe>> r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L8a
            r0.add(r2)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r1)
            kotlin.jvm.internal.IDqS172S0200000 r1 = new kotlin.jvm.internal.IDqS172S0200000
            r0 = 84
            r1.<init>(r3, r2, r0)
            r2.LJIILIIL(r1)
            java.lang.Object r0 = r2.LJIIJJI()
            if (r0 != r6) goto L68
            goto L3f
        L68:
            X.UCe r0 = X.C76800UCe.LIZ
            goto L3f
        L6b:
            r0 = r7
        L6c:
            X.1o8 r1 = r0.LJLIL
            r0 = 0
            r5.LJLIL = r0
            r5.LJLILLLLZI = r0
            r5.LJLJJL = r4
            java.lang.Object r2 = r1.LJIIJ(r8, r5)
            if (r2 != r6) goto L23
            return r6
        L7c:
            X.26c r5 = new X.26c
            r5.<init>(r7, r9)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C529926d.LJIIJ(X.Yns, X.2kd):java.lang.Object");
    }

    @Override // X.MBA
    public final <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(r, this);
    }
}
