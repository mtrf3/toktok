package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3aQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86503aQ implements InterfaceC80883Fk {
    public final InterfaceC80883Fk LIZ;
    public final int LIZIZ;
    public final MBA LIZJ;
    public final InterfaceC75532xp LIZLLL;

    @Override // X.InterfaceC80883Fk
    public final Object LIZIZ(InterfaceC67352kd<? super List<String>> interfaceC67352kd) {
        return this.LIZ.LIZIZ(interfaceC67352kd);
    }

    @Override // X.InterfaceC80883Fk
    public final Object LIZJ(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return this.LIZ.LIZJ(interfaceC67352kd);
    }

    @Override // X.InterfaceC80883Fk
    public final Object LIZLLL(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return this.LIZ.LIZLLL(interfaceC67352kd);
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJFF(int i, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        return this.LIZ.LJFF(i, interfaceC67352kd);
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJI(int i, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        return this.LIZ.LJI(i, interfaceC67352kd);
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIIJ(int i, List<String> list, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        return this.LIZ.LJIIJ(i, list, interfaceC67352kd);
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIIJJI(InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        return this.LIZ.LJIIJJI(interfaceC67352kd);
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIILIIL(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return this.LIZ.LJIILIIL(interfaceC67352kd);
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIILL(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return this.LIZ.LJIILL(interfaceC67352kd);
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIILLIIL(List<String> list, int i, int i2, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        return this.LIZ.LJIILLIIL(list, i, i2, interfaceC67352kd);
    }

    @Override // X.InterfaceC80883Fk
    public final Object LJIIZILJ(List<String> list, int i, int i2, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        return this.LIZ.LJIIZILJ(list, i, i2, interfaceC67352kd);
    }

    public C86503aQ(C80873Fj c80873Fj) {
        XIA rowCountDispatcher = C78613UtF.LIZJ;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(rowCountDispatcher, "rowCountDispatcher");
        o.LJIIIZ(onEventV3, "onEventV3");
        this.LIZ = c80873Fj;
        this.LIZIZ = 10000;
        this.LIZJ = rowCountDispatcher;
        this.LIZLLL = onEventV3;
        if (FMX.LIZJ("SIMPLE_USER_row_count")) {
            XKX.LIZLLL(C48841JEv.LIZ(rowCountDispatcher), null, null, new C3GA(this, null), 3);
        }
    }

    public static boolean LJIJJ(Integer num) {
        if (num == null) {
            return true;
        }
        if (num.intValue() <= 0) {
            return false;
        }
        if (num.intValue() == 1 || V0Q.Default.nextInt(0, num.intValue()) == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C86513aR
            if (r0 == 0) goto L4f
            r6 = r8
            X.3aR r6 = (X.C86513aR) r6
            int r2 = r6.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r6.LJLJJLL = r2
        L12:
            java.lang.Object r5 = r6.LJLJJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJLL
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L55
            X.0id r1 = r6.LJLJI
            java.lang.Object r4 = r6.LJLILLLLZI
            java.lang.String r4 = (java.lang.String) r4
            X.3aQ r3 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
        L28:
            long r1 = r1.LIZ()
            r0 = 0
            r3.LJIJI(r0, r1, r4)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L33:
            X.C141335gf.LIZJ(r5)
            X.0id r1 = X.C15140ic.LIZ()
            X.3Fk r0 = r7.LIZ
            r6.LJLIL = r7
            java.lang.String r4 = "clear"
            r6.LJLILLLLZI = r4
            r6.LJLJI = r1
            r6.LJLJJLL = r2
            java.lang.Object r0 = r0.LIZ(r6)
            if (r0 != r3) goto L4d
            return r3
        L4d:
            r3 = r7
            goto L28
        L4f:
            X.3aR r6 = new X.3aR
            r6.<init>(r7, r8)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86503aQ.LIZ(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC80883Fk
    public final List<IMUser> LJ(String str) {
        C15150id LIZ = C15140ic.LIZ();
        List<IMUser> LJ = this.LIZ.LJ(str);
        LJIJI(LJ.size(), LIZ.LIZ(), "query_sort_weight");
        return LJ;
    }

    @Override // X.InterfaceC80883Fk
    public final IMUser LJII(String secUid) {
        int i;
        o.LJIIIZ(secUid, "secUid");
        if (!LJIJJ(null)) {
            return this.LIZ.LJII(secUid);
        }
        C15150id LIZ = C15140ic.LIZ();
        IMUser LJII = this.LIZ.LJII(secUid);
        long LIZ2 = LIZ.LIZ();
        if (LJII != null) {
            i = 1;
        } else {
            i = 0;
        }
        LJIJI(i, LIZ2, "get_with_secuid");
        return LJII;
    }

    @Override // X.InterfaceC80883Fk
    public final IMUser LJIIL(String uid) {
        int i;
        o.LJIIIZ(uid, "uid");
        if (!LJIJJ(Integer.valueOf(this.LIZIZ))) {
            return this.LIZ.LJIIL(uid);
        }
        C15150id LIZ = C15140ic.LIZ();
        IMUser LJIIL = this.LIZ.LJIIL(uid);
        long LIZ2 = LIZ.LIZ();
        if (LJIIL != null) {
            i = 1;
        } else {
            i = 0;
        }
        LJIJI(i, LIZ2, "get_with_ui");
        return LJIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C86533aT
            if (r0 == 0) goto L7c
            r7 = r11
            X.3aT r7 = (X.C86533aT) r7
            int r2 = r7.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r7.LJLJL = r2
        L12:
            java.lang.Object r8 = r7.LJLJJL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJL
            r2 = 2
            r5 = 1
            if (r0 == 0) goto L43
            if (r0 == r5) goto L3f
            if (r0 != r2) goto L82
            X.0id r1 = r7.LJLJJI
            java.lang.Object r4 = r7.LJLJI
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r7.LJLILLLLZI
            java.lang.String r3 = (java.lang.String) r3
            X.3aQ r2 = r7.LJLIL
            X.C141335gf.LIZJ(r8)
        L2f:
            long r0 = r1.LIZ()
            if (r4 == 0) goto L39
            int r5 = r4.intValue()
        L39:
            r2.LJIJI(r5, r0, r3)
        L3c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3f:
            X.C141335gf.LIZJ(r8)
            goto L3c
        L43:
            X.C141335gf.LIZJ(r8)
            int r0 = r10.size()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r0)
            r0 = 0
            boolean r0 = LJIJJ(r0)
            if (r0 != 0) goto L61
            X.3Fk r0 = r9.LIZ
            r7.LJLJL = r5
            java.lang.Object r0 = r0.LJIIIIZZ(r10, r7)
            if (r0 != r6) goto L3c
            return r6
        L61:
            X.0id r1 = X.C15140ic.LIZ()
            X.3Fk r0 = r9.LIZ
            r7.LJLIL = r9
            java.lang.String r3 = "insert"
            r7.LJLILLLLZI = r3
            r7.LJLJI = r4
            r7.LJLJJI = r1
            r7.LJLJL = r2
            java.lang.Object r0 = r0.LJIIIIZZ(r10, r7)
            if (r0 != r6) goto L7a
            return r6
        L7a:
            r2 = r9
            goto L2f
        L7c:
            X.3aT r7 = new X.3aT
            r7.<init>(r9, r11)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86503aQ.LJIIIIZZ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(java.lang.String r8, X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C86523aS
            if (r0 == 0) goto L4f
            r6 = r9
            X.3aS r6 = (X.C86523aS) r6
            int r2 = r6.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r6.LJLJJLL = r2
        L12:
            java.lang.Object r5 = r6.LJLJJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJLL
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L55
            X.0id r1 = r6.LJLJI
            java.lang.Object r4 = r6.LJLILLLLZI
            java.lang.String r4 = (java.lang.String) r4
            X.3aQ r3 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
        L28:
            long r1 = r1.LIZ()
            r0 = 0
            r3.LJIJI(r0, r1, r4)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L33:
            X.C141335gf.LIZJ(r5)
            X.0id r1 = X.C15140ic.LIZ()
            X.3Fk r0 = r7.LIZ
            r6.LJLIL = r7
            java.lang.String r4 = "delete"
            r6.LJLILLLLZI = r4
            r6.LJLJI = r1
            r6.LJLJJLL = r2
            java.lang.Object r0 = r0.LJIILJJIL(r8, r6)
            if (r0 != r3) goto L4d
            return r3
        L4d:
            r3 = r7
            goto L28
        L4f:
            X.3aS r6 = new X.3aS
            r6.<init>(r7, r9)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86503aQ.LJIILJJIL(java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C86543aU
            if (r0 == 0) goto L7e
            r7 = r11
            X.3aU r7 = (X.C86543aU) r7
            int r2 = r7.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r7.LJLJL = r2
        L12:
            java.lang.Object r8 = r7.LJLJJL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJL
            r2 = 2
            r5 = 1
            if (r0 == 0) goto L43
            if (r0 == r5) goto L3f
            if (r0 != r2) goto L84
            X.0id r1 = r7.LJLJJI
            java.lang.Object r4 = r7.LJLJI
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r7.LJLILLLLZI
            java.lang.String r3 = (java.lang.String) r3
            X.3aQ r2 = r7.LJLIL
            X.C141335gf.LIZJ(r8)
        L2f:
            long r0 = r1.LIZ()
            if (r4 == 0) goto L39
            int r5 = r4.intValue()
        L39:
            r2.LJIJI(r5, r0, r3)
        L3c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3f:
            X.C141335gf.LIZJ(r8)
            goto L3c
        L43:
            X.C141335gf.LIZJ(r8)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r0 = r10.size()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r0)
            r0 = 0
            boolean r0 = LJIJJ(r0)
            if (r0 != 0) goto L63
            X.3Fk r0 = r9.LIZ
            r7.LJLJL = r5
            java.lang.Object r0 = r0.LJIJ(r10, r7)
            if (r0 != r6) goto L3c
            return r6
        L63:
            X.0id r1 = X.C15140ic.LIZ()
            X.3Fk r0 = r9.LIZ
            r7.LJLIL = r9
            java.lang.String r3 = "insert_mention"
            r7.LJLILLLLZI = r3
            r7.LJLJI = r4
            r7.LJLJJI = r1
            r7.LJLJL = r2
            java.lang.Object r0 = r0.LJIJ(r10, r7)
            if (r0 != r6) goto L7c
            return r6
        L7c:
            r2 = r9
            goto L2f
        L7e:
            X.3aU r7 = new X.3aU
            r7.<init>(r9, r11)
            goto L12
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86503aQ.LJIJ(java.util.List, X.2kd):java.lang.Object");
    }

    public final void LJIJI(int i, long j, String str) {
        String LJFF = i0.LJFF("SIMPLE_USER_", str);
        if ("get_with_ui".equals(str) && !FMX.LIZJ(LJFF)) {
            return;
        }
        if ("insert_mention".equals(str) && !FMX.LIZJ(LJFF)) {
            return;
        }
        if ("insert".equals(str) && !FMX.LIZJ(LJFF)) {
            return;
        }
        if ("delete".equals(str) && !FMX.LIZJ(LJFF)) {
            return;
        }
        if ("clear".equals(str) && !FMX.LIZJ(LJFF)) {
            return;
        }
        this.LIZLLL.LIZIZ(LJFF, C113554cx.LJJL(new OSZ("isRoom", "true"), new OSZ("duration", String.valueOf(j)), new OSZ("transaction_size", String.valueOf(i))));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // X.InterfaceC80883Fk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.util.List<java.lang.String> r12, int r13, int r14, java.lang.String r15, X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>> r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C86553aV
            if (r0 == 0) goto L58
            r10 = r3
            X.3aV r10 = (X.C86553aV) r10
            int r2 = r10.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r10.LJLJJLL = r2
        L14:
            java.lang.Object r5 = r10.LJLJJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJJLL
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L5e
            X.0id r0 = r10.LJLJI
            java.lang.Object r4 = r10.LJLILLLLZI
            java.lang.String r4 = (java.lang.String) r4
            X.3aQ r3 = r10.LJLIL
            X.C141335gf.LIZJ(r5)
        L2a:
            java.util.List r5 = (java.util.List) r5
            long r1 = r0.LIZ()
            int r0 = r5.size()
            r3.LJIJI(r0, r1, r4)
            return r5
        L38:
            X.C141335gf.LIZJ(r5)
            X.0id r0 = X.C15140ic.LIZ()
            X.3Fk r5 = r11.LIZ
            r10.LJLIL = r11
            java.lang.String r4 = "find_with_condition"
            r10.LJLILLLLZI = r4
            r10.LJLJI = r0
            r10.LJLJJLL = r1
            r7 = r13
            r6 = r12
            r8 = r14
            r9 = r15
            java.lang.Object r5 = r5.LJIIIZ(r6, r7, r8, r9, r10)
            if (r5 != r2) goto L56
            return r2
        L56:
            r3 = r11
            goto L2a
        L58:
            X.3aV r10 = new X.3aV
            r10.<init>(r11, r3)
            goto L14
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86503aQ.LJIIIZ(java.util.List, int, int, java.lang.String, X.2kd):java.lang.Object");
    }
}
