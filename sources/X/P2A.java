package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class P2A {
    public final String LIZ;
    public C58073Mqj LIZIZ = new C58073Mqj();
    public C58073Mqj LIZJ = new C58073Mqj();
    public C58073Mqj LIZLLL = new C58073Mqj();
    public long LJ = -1;
    public long LJFF = -1;
    public Boolean LJI;

    public final void LIZ() {
        long j;
        if (this.LJ == -1) {
            if (o.LJ(this.LJI, Boolean.TRUE)) {
                long j2 = this.LIZIZ.LJLIL;
                long j3 = 0;
                if (j2 < 0) {
                    j2 = 0;
                }
                long j4 = this.LIZJ.LJLIL;
                if (j4 >= 0) {
                    j3 = j4;
                }
                j = Math.max(j2, j3) + this.LIZLLL.LJLIL;
            } else {
                j = this.LIZLLL.LJLIL;
            }
            this.LJ = j;
            String str = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("compute total: ");
            LIZ.append(this.LJ);
            C221018lt.LJFF(str, X1D.LIZIZ(LIZ));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("total: ");
        LIZ.append(this.LJ);
        LIZ.append(", isSync: ");
        LIZ.append(this.LJI);
        LIZ.append(" \n");
        sb.append(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("MAF: ");
        LIZ2.append(this.LIZLLL);
        LIZ2.append('\n');
        sb.append(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Contact: ");
        LIZ3.append(this.LIZIZ);
        LIZ3.append('\n');
        sb.append(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("Facebook: ");
        LIZ4.append(this.LIZJ);
        LIZ4.append('\n');
        sb.append(X1D.LIZIZ(LIZ4));
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public P2A(String str) {
        this.LIZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.P22 r9, X.InterfaceC67352kd r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.P2E
            if (r0 == 0) goto L6f
            r7 = r10
            X.P2E r7 = (X.P2E) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r1 = r7.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r5 = 1
            if (r0 == 0) goto L51
            if (r0 != r5) goto L75
            X.P2A r6 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            X.OSZ r1 = (X.OSZ) r1
            java.lang.Object r0 = r1.getFirst()
            X.3C5 r0 = (X.C3C5) r0
            java.lang.Object r5 = r0.m15unboximpl()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            X.Mqj r4 = r6.LIZIZ
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r5)
            if (r0 == 0) goto L4e
            X.Mqi r1 = X.EnumC58072Mqi.FAIL
        L42:
            r0 = 10
            X.Mqj r0 = X.C58073Mqj.L(r4, r2, r1, r0)
            r6.LIZIZ = r0
            X.C141335gf.LIZJ(r5)
            return r5
        L4e:
            X.Mqi r1 = X.EnumC58072Mqi.SUCCESS
            goto L42
        L51:
            X.C141335gf.LIZJ(r1)
            X.Mqj r4 = r8.LIZIZ
            X.Mqi r3 = X.EnumC58072Mqi.REQ
            r2 = 11
            r0 = 0
            X.Mqj r0 = X.C58073Mqj.L(r4, r0, r3, r2)
            r8.LIZIZ = r0
            r7.LJLIL = r8
            r7.LJLJJI = r5
            java.lang.Object r1 = r8.LIZLLL(r9, r7)
            if (r1 != r6) goto L6d
            return r6
        L6d:
            r6 = r8
            goto L22
        L6f:
            X.P2E r7 = new X.P2E
            r7.<init>(r8, r10)
            goto L12
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P2A.LIZIZ(X.P22, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.P24 r9, X.InterfaceC67352kd r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.P2F
            if (r0 == 0) goto L6f
            r7 = r10
            X.P2F r7 = (X.P2F) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r1 = r7.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r5 = 1
            if (r0 == 0) goto L51
            if (r0 != r5) goto L75
            X.P2A r6 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            X.OSZ r1 = (X.OSZ) r1
            java.lang.Object r0 = r1.getFirst()
            X.3C5 r0 = (X.C3C5) r0
            java.lang.Object r5 = r0.m15unboximpl()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            X.Mqj r4 = r6.LIZJ
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r5)
            if (r0 == 0) goto L4e
            X.Mqi r1 = X.EnumC58072Mqi.FAIL
        L42:
            r0 = 10
            X.Mqj r0 = X.C58073Mqj.L(r4, r2, r1, r0)
            r6.LIZJ = r0
            X.C141335gf.LIZJ(r5)
            return r5
        L4e:
            X.Mqi r1 = X.EnumC58072Mqi.SUCCESS
            goto L42
        L51:
            X.C141335gf.LIZJ(r1)
            X.Mqj r4 = r8.LIZJ
            X.Mqi r3 = X.EnumC58072Mqi.REQ
            r2 = 11
            r0 = 0
            X.Mqj r0 = X.C58073Mqj.L(r4, r0, r3, r2)
            r8.LIZJ = r0
            r7.LJLIL = r8
            r7.LJLJJI = r5
            java.lang.Object r1 = r8.LIZLLL(r9, r7)
            if (r1 != r6) goto L6d
            return r6
        L6d:
            r6 = r8
            goto L22
        L6f:
            X.P2F r7 = new X.P2F
            r7.<init>(r8, r10)
            goto L12
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P2A.LIZJ(X.P24, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LIZLLL(X.InterfaceC88472Yns<? super X.InterfaceC67352kd<? super T>, ? extends java.lang.Object> r7, X.InterfaceC67352kd<? super X.OSZ<? extends X.C3C5<? extends T>, java.lang.Long>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.P2G
            if (r0 == 0) goto L20
            r4 = r8
            X.P2G r4 = (X.P2G) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r5 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJI
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            long r1 = r4.LJLIL
            goto L40
        L20:
            X.P2G r4 = new X.P2G
            r4.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r5)
            long r1 = java.lang.System.currentTimeMillis()
            r4.LJLIL = r1     // Catch: java.lang.Throwable -> L4a
            r4.LJLJJI = r0     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r7.invoke(r4)     // Catch: java.lang.Throwable -> L4a
            if (r5 != r3) goto L43
            goto L49
        L40:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Throwable -> L47
        L43:
            X.C3C5.m7constructorimpl(r5)     // Catch: java.lang.Throwable -> L47
            goto L52
        L47:
            r0 = move-exception
            goto L4b
        L49:
            return r3
        L4a:
            r0 = move-exception
        L4b:
            X.3C4 r5 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r5)
        L52:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            X.3C5 r2 = X.C3C5.m6boximpl(r5)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            X.OSZ r0 = new X.OSZ
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P2A.LIZLLL(X.Yns, X.2kd):java.lang.Object");
    }
}
