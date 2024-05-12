package X;

import android.os.SystemClock;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3RZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RZ<R> extends C3RG<R> {
    public static final /* synthetic */ int LJII = 0;
    public C83943Re<R> LIZIZ;
    public InterfaceC88472Yns<? super InterfaceC67352kd<? super Boolean>, ? extends Object> LIZJ;
    public InterfaceC88471Ynr<? super C3RY<R>, ? super InterfaceC67352kd<? super Boolean>, ? extends Object> LIZLLL;
    public InterfaceC88471Ynr<? super List<R>, ? super InterfaceC67352kd<? super List<R>>, ? extends Object> LJ;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C83993Rj.LJLIL);
    public volatile boolean LJI;

    @Override // X.C3RG
    public final boolean LIZ() {
        C83943Re<R> c83943Re = this.LIZIZ;
        if (c83943Re != null && c83943Re.LIZIZ() != null) {
            return true;
        }
        return false;
    }

    public final boolean LJFF() {
        C83943Re<R> c83943Re;
        List LLJILJILJ;
        if (this.LJI || (c83943Re = this.LIZIZ) == null || (LLJILJILJ = ORZ.LLJILJILJ((Collection) c83943Re.LIZ.getValue())) == null || LLJILJILJ.isEmpty() || this.LIZ == null) {
            return false;
        }
        return true;
    }

    public final void LJI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("combindloader load start, ts: ");
        LIZ.append(SystemClock.elapsedRealtime());
        C34B.LJI("LOAD_CONTACT_PROCESS", X1D.LIZIZ(LIZ));
        if (LJFF()) {
            LJII(false);
        }
    }

    public final void LJIIIZ() {
        if (LJFF()) {
            LJII(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC67352kd<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C83933Rd
            if (r0 == 0) goto L3f
            r4 = r6
            X.3Rd r4 = (X.C83933Rd) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L45
            X.C141335gf.LIZJ(r3)
        L20:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L2d
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L2d:
            r1 = 0
            goto L28
        L2f:
            X.C141335gf.LIZJ(r3)
            X.Yns<? super X.2kd<? super java.lang.Boolean>, ? extends java.lang.Object> r0 = r5.LIZJ
            if (r0 == 0) goto L28
            r4.LJLJI = r1
            java.lang.Object r3 = r0.invoke(r4)
            if (r3 != r2) goto L20
            return r2
        L3f:
            X.3Rd r4 = new X.3Rd
            r4.<init>(r5, r6)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RZ.LJ(X.2kd):java.lang.Object");
    }

    public final void LJII(boolean z) {
        StringBuilder LJI = JBR.LJI("loadInternal load more: ", z, ", ts: ");
        LJI.append(SystemClock.elapsedRealtime());
        C34B.LJI("LOAD_CONTACT_PROCESS", X1D.LIZIZ(LJI));
        this.LJI = true;
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3RI(this, z, null), 3);
        ((C73318Sq2) this.LJFF.getValue()).LIZLLL();
        ((C73318Sq2) this.LJFF.getValue()).LIZ((C73318Sq2) this.LJFF.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<R> r6, X.InterfaceC67352kd<? super java.util.List<R>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C83923Rc
            if (r0 == 0) goto L38
            r4 = r7
            X.3Rc r4 = (X.C83923Rc) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L3e
            java.lang.Object r6 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L22:
            if (r3 != 0) goto L25
        L24:
            r3 = r6
        L25:
            return r3
        L26:
            X.C141335gf.LIZJ(r3)
            X.Ynr<? super java.util.List<R>, ? super X.2kd<? super java.util.List<R>>, ? extends java.lang.Object> r0 = r5.LJ
            if (r0 == 0) goto L24
            r4.LJLIL = r6
            r4.LJLJJI = r1
            java.lang.Object r3 = r0.invoke(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L38:
            X.3Rc r4 = new X.3Rc
            r4.<init>(r5, r7)
            goto L12
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RZ.LIZJ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C3RY<R> r7, X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C83913Rb
            if (r0 == 0) goto L3f
            r5 = r8
            X.3Rb r5 = (X.C83913Rb) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r4 = r5.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L45
            X.C141335gf.LIZJ(r4)
        L21:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L2a
            r2 = 1
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L2f:
            X.C141335gf.LIZJ(r4)
            X.Ynr<? super X.3RY<R>, ? super X.2kd<? super java.lang.Boolean>, ? extends java.lang.Object> r0 = r6.LIZLLL
            if (r0 == 0) goto L2a
            r5.LJLJI = r1
            java.lang.Object r4 = r0.invoke(r7, r5)
            if (r4 != r3) goto L21
            return r3
        L3f:
            X.3Rb r5 = new X.3Rb
            r5.<init>(r6, r8)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RZ.LIZLLL(X.3RY, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0174, code lost:
    
        if (((java.lang.Boolean) r1).booleanValue() == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.3RZ, java.lang.Object, X.4cf] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x015c -> B:18:0x016c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object LJIIIIZZ(X.C3RZ<R> r13, boolean r14, X.InterfaceC67352kd<? super java.util.List<R>> r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3RZ.LJIIIIZZ(X.3RZ, boolean, X.2kd):java.lang.Object");
    }
}
