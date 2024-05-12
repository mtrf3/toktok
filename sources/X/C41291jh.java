package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1jh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41291jh extends C1IE {
    public final C1IE LJIIL;
    public final InterfaceC88472Yns<Object, C76800UCe> LJIILIIL;
    public final InterfaceC88472Yns<Object, C76800UCe> LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;

    @Override // X.C1IE, X.C0OA
    public final void LIZJ() {
        C1IE c1ie;
        this.LIZJ = true;
        if (this.LJIILLIIL && (c1ie = this.LJIIL) != null) {
            c1ie.LIZJ();
        }
    }

    public final C1IE LJJIII() {
        C1IE c1ie = this.LJIIL;
        if (c1ie == null) {
            C41261je c41261je = C0OF.LJIIIIZZ.get();
            o.LJIIIIZZ(c41261je, "currentGlobalSnapshot.get()");
            return c41261je;
        }
        return c1ie;
    }

    @Override // X.C0OA
    public final int LIZLLL() {
        return LJJIII().LIZLLL();
    }

    @Override // X.C0OA
    public final C1IQ LJ() {
        return LJJIII().LJ();
    }

    @Override // X.C1IE, X.C0OA
    public final boolean LJI() {
        return LJJIII().LJI();
    }

    @Override // X.C1IE, X.C0OA
    public final void LJIIJJI() {
        LJJIII().LJIIJJI();
    }

    @Override // X.C1IE
    public final C0OC LJIJI() {
        return LJJIII().LJIJI();
    }

    @Override // X.C1IE
    public final java.util.Set<C0O9> LJIJJ() {
        return LJJIII().LJIJJ();
    }

    @Override // X.C1IE, X.C0OA
    public final void LJIIIZ(C0OA snapshot) {
        o.LJIIIZ(snapshot, "snapshot");
        C0OH.LIZ();
        throw null;
    }

    @Override // X.C1IE, X.C0OA
    public final void LJIIJ(C0OA snapshot) {
        o.LJIIIZ(snapshot, "snapshot");
        C0OH.LIZ();
        throw null;
    }

    @Override // X.C1IE, X.C0OA
    public final void LJIIL(C0O9 state) {
        o.LJIIIZ(state, "state");
        LJJIII().LJIIL(state);
    }

    @Override // X.C0OA
    public final void LJIILL(int i) {
        C0OH.LIZ();
        throw null;
    }

    @Override // X.C0OA
    public final void LJIILLIIL(C1IQ value) {
        o.LJIIIZ(value, "value");
        C0OH.LIZ();
        throw null;
    }

    @Override // X.C1IE, X.C0OA
    public final C0OA LJIIZILJ(InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns) {
        InterfaceC88472Yns<Object, C76800UCe> LJIIIZ = C0OF.LJIIIZ(interfaceC88472Yns, this.LJFF, true);
        if (!this.LJIILL) {
            return C0OF.LJFF(LJJIII().LJIIZILJ(null), LJIIIZ, true);
        }
        return LJJIII().LJIIZILJ(LJIIIZ);
    }

    @Override // X.C1IE
    public final void LJJI(java.util.Set<C0O9> set) {
        C0OH.LIZ();
        throw null;
    }

    @Override // X.C1IE
    public final C1IE LJJIFFI(InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2) {
        InterfaceC88472Yns<Object, C76800UCe> LJIIIZ = C0OF.LJIIIZ(interfaceC88472Yns, this.LJFF, true);
        InterfaceC88472Yns<Object, C76800UCe> LIZ = C0OF.LIZ(interfaceC88472Yns2, this.LJI);
        if (!this.LJIILL) {
            return new C41291jh(LJJIII().LJJIFFI(null, LIZ), LJIIIZ, LIZ, false, true);
        }
        return LJJIII().LJJIFFI(LJIIIZ, LIZ);
    }

    public C41291jh(C1IE c1ie, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2, boolean z, boolean z2) {
        super(0, C1IQ.LJLJJL, C0OF.LJIIIZ(interfaceC88472Yns, (c1ie == null || (r0 = c1ie.LJFF) == null) ? C0OF.LJIIIIZZ.get().LJFF : r0, z), C0OF.LIZ(interfaceC88472Yns2, (c1ie == null || (r0 = c1ie.LJI) == null) ? C0OF.LJIIIIZZ.get().LJI : r0));
        InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns3;
        InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns4;
        this.LJIIL = c1ie;
        this.LJIILIIL = interfaceC88472Yns;
        this.LJIILJJIL = interfaceC88472Yns2;
        this.LJIILL = z;
        this.LJIILLIIL = z2;
    }
}
