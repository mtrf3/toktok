package X;

import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.3aM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86463aM implements InterfaceC86173Zt {
    public final InterfaceC86173Zt LIZ;
    public final InterfaceC75532xp LIZIZ;

    @Override // X.InterfaceC86173Zt
    public final Object LIZLLL(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return this.LIZ.LIZLLL(interfaceC67352kd);
    }

    public C86463aM(C86563aW c86563aW) {
        C85323Wm onEventV3 = C772831o.LIZ();
        XIA backgroundDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(onEventV3, "onEventV3");
        o.LJIIIZ(backgroundDispatcher, "backgroundDispatcher");
        this.LIZ = c86563aW;
        this.LIZIZ = onEventV3;
        XKX.LIZLLL(C48841JEv.LIZ(backgroundDispatcher), null, null, new C86163Zs(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC86173Zt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C86483aO
            if (r0 == 0) goto L54
            r6 = r8
            X.3aO r6 = (X.C86483aO) r6
            int r2 = r6.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r6.LJLJL = r2
        L12:
            java.lang.Object r1 = r6.LJLJJL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJL
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 != r2) goto L5a
            int r5 = r6.LJLJJI
            X.0id r4 = r6.LJLJI
            java.lang.Object r3 = r6.LJLILLLLZI
            java.lang.String r3 = (java.lang.String) r3
            X.3aM r2 = r6.LJLIL
            X.C141335gf.LIZJ(r1)
        L2a:
            long r0 = r4.LIZ()
            r2.LIZIZ(r5, r0, r3)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L34:
            X.C141335gf.LIZJ(r1)
            X.0id r4 = X.C15140ic.LIZ()
            X.3Zt r1 = r7.LIZ
            r6.LJLIL = r7
            java.lang.String r3 = "clear"
            r6.LJLILLLLZI = r3
            r6.LJLJI = r4
            r0 = -1
            r6.LJLJJI = r0
            r6.LJLJL = r2
            java.lang.Object r0 = r1.LIZ(r6)
            if (r0 != r5) goto L51
            return r5
        L51:
            r5 = -1
            r2 = r7
            goto L2a
        L54:
            X.3aO r6 = new X.3aO
            r6.<init>(r7, r8)
            goto L12
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86463aM.LIZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC86173Zt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC67352kd<? super java.util.Map<java.lang.String, java.lang.Integer>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C86493aP
            if (r0 == 0) goto L52
            r6 = r8
            X.3aP r6 = (X.C86493aP) r6
            int r2 = r6.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r6.LJLJJLL = r2
        L12:
            java.lang.Object r5 = r6.LJLJJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJLL
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L58
            X.0id r1 = r6.LJLJI
            java.lang.Object r4 = r6.LJLILLLLZI
            java.lang.String r4 = (java.lang.String) r4
            X.3aM r3 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
        L28:
            java.util.Map r5 = (java.util.Map) r5
            long r1 = r1.LIZ()
            int r0 = r5.size()
            r3.LIZIZ(r0, r1, r4)
            return r5
        L36:
            X.C141335gf.LIZJ(r5)
            X.0id r1 = X.C15140ic.LIZ()
            X.3Zt r0 = r7.LIZ
            r6.LJLIL = r7
            java.lang.String r4 = "find_sort"
            r6.LJLILLLLZI = r4
            r6.LJLJI = r1
            r6.LJLJJLL = r2
            java.lang.Object r5 = r0.LJFF(r6)
            if (r5 != r3) goto L50
            return r3
        L50:
            r3 = r7
            goto L28
        L52:
            X.3aP r6 = new X.3aP
            r6.<init>(r7, r8)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86463aM.LJFF(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC86173Zt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C85873Yp r9, X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C86473aN
            if (r0 == 0) goto L5a
            r7 = r10
            X.3aN r7 = (X.C86473aN) r7
            int r2 = r7.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r7.LJLJL = r2
        L12:
            java.lang.Object r6 = r7.LJLJJL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJL
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L60
            int r2 = r7.LJLJJI
            X.0id r1 = r7.LJLJI
            java.lang.Object r4 = r7.LJLILLLLZI
            java.lang.String r4 = (java.lang.String) r4
            X.3aM r3 = r7.LJLIL
            X.C141335gf.LIZJ(r6)
        L2a:
            long r0 = r1.LIZ()
            r3.LIZIZ(r2, r0, r4)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L34:
            X.C141335gf.LIZJ(r6)
            java.util.List r0 = r9.getSecUserIds()
            int r2 = r0.size()
            X.0id r1 = X.C15140ic.LIZ()
            X.3Zt r0 = r8.LIZ
            r7.LJLIL = r8
            java.lang.String r4 = "insert"
            r7.LJLILLLLZI = r4
            r7.LJLJI = r1
            r7.LJLJJI = r2
            r7.LJLJL = r3
            java.lang.Object r0 = r0.LJ(r9, r7)
            if (r0 != r5) goto L58
            return r5
        L58:
            r3 = r8
            goto L2a
        L5a:
            X.3aN r7 = new X.3aN
            r7.<init>(r8, r10)
            goto L12
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86463aM.LJ(X.3Yp, X.2kd):java.lang.Object");
    }

    public final void LIZIZ(int i, long j, String str) {
        String LJFF = i0.LJFF("FRIENDS_RELATION_", str);
        if ("find_sort".equals(str) && !FMX.LIZJ(LJFF)) {
            return;
        }
        this.LIZIZ.LIZIZ(LJFF, C113554cx.LJJL(new OSZ("isRoom", "true"), new OSZ("duration", String.valueOf(j)), new OSZ("transaction_size", String.valueOf(i))));
    }
}
