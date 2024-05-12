package X;

import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vb2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80032Vb2 implements InterfaceC80025Vav, InterfaceC80044VbE, InterfaceC80021Var {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C80041VbB.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 483));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C80040VbA.LJLIL);

    public final C80034Vb4 LJ() {
        return (C80034Vb4) this.LJLILLLLZI.getValue();
    }

    public final C80033Vb3 LJI() {
        return (C80033Vb3) this.LJLJI.getValue();
    }

    public final void LJII() {
        ((C80046VbG) this.LJLIL.getValue()).LIZJ();
        LJI().LIZ();
        C80034Vb4 LJ = LJ();
        LJ.LIZ = null;
        LJ.LIZJ = null;
    }

    @Override // X.InterfaceC80025Vav
    public final V1L LIZ() {
        C80034Vb4 LJ = LJ();
        InterfaceC80039Vb9 interfaceC80039Vb9 = LJ.LIZJ;
        if (interfaceC80039Vb9 != null) {
            return interfaceC80039Vb9.LJII(LJ.LIZ);
        }
        return null;
    }

    @Override // X.InterfaceC80025Vav
    public final V1L LIZJ() {
        C80034Vb4 LJ = LJ();
        InterfaceC80039Vb9 interfaceC80039Vb9 = LJ.LIZJ;
        if (interfaceC80039Vb9 != null) {
            return interfaceC80039Vb9.LJ(LJ.LIZ);
        }
        return null;
    }

    @Override // X.InterfaceC80025Vav
    public final boolean LIZLLL() {
        C80034Vb4 LJ = LJ();
        InterfaceC80039Vb9 interfaceC80039Vb9 = LJ.LIZJ;
        if (interfaceC80039Vb9 != null && interfaceC80039Vb9.LJI(LJ.LIZ) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80025Vav
    public final boolean LJFF() {
        C80034Vb4 LJ = LJ();
        InterfaceC80039Vb9 interfaceC80039Vb9 = LJ.LIZJ;
        if (interfaceC80039Vb9 != null && interfaceC80039Vb9.LJ(LJ.LIZ) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80025Vav
    public final V1L LJIIIIZZ() {
        C80034Vb4 LJ = LJ();
        InterfaceC80039Vb9 interfaceC80039Vb9 = LJ.LIZJ;
        if (interfaceC80039Vb9 != null) {
            return interfaceC80039Vb9.LJI(LJ.LIZ);
        }
        return null;
    }

    @Override // X.InterfaceC80025Vav
    public final boolean LJIJI() {
        C80034Vb4 LJ = LJ();
        InterfaceC80039Vb9 interfaceC80039Vb9 = LJ.LIZJ;
        if (interfaceC80039Vb9 != null && interfaceC80039Vb9.LJII(LJ.LIZ) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80025Vav
    public final InterfaceC79968Va0 LJIJJLI() {
        return LJ().LIZ;
    }

    @Override // X.InterfaceC80025Vav
    public final EnumC79963VZv R() {
        return LJ().LIZIZ;
    }

    public final void LIZIZ(InterfaceC80038Vb8 listener) {
        o.LJIIJ(listener, "listener");
        ((C80046VbG) this.LJLIL.getValue()).LIZ(listener);
    }

    public final void LJIIIZ(EnumC79963VZv enumC79963VZv) {
        C80034Vb4 LJ = LJ();
        EnumC79963VZv playMode = LJI().LJIIIIZZ(enumC79963VZv);
        LJ.getClass();
        o.LJIIJ(playMode, "playMode");
        LJ.LIZIZ = playMode;
        LJ.LIZJ = C80035Vb5.LIZ(playMode);
        LJ.LIZLLL.LJIIZILJ(playMode);
    }

    public final void LJIIJJI(InterfaceC79968Va0 interfaceC79968Va0) {
        V1L v1l;
        List<V1L> LIZIZ;
        C80034Vb4 LJ = LJ();
        InterfaceC79968Va0 LIZJ = LJI().LIZJ(interfaceC79968Va0);
        LJ.LIZ = LIZJ;
        LJ.LIZLLL.LJIIJ(LIZJ);
        if (LIZJ != null && (LIZIZ = LIZJ.LIZIZ()) != null) {
            v1l = (V1L) ORZ.LJLLLLLL(LIZJ.getCurrentIndex(), LIZIZ);
        } else {
            v1l = null;
        }
        LJ.LIZ(v1l);
    }

    @Override // X.InterfaceC80044VbE
    public final void LJIILJJIL(InterfaceC80038Vb8 listener) {
        o.LJIIJ(listener, "listener");
        ((C80046VbG) this.LJLIL.getValue()).LJIILJJIL(listener);
    }

    @Override // X.InterfaceC80021Var
    public final void LJIILLIIL(InterfaceC80037Vb7 interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        LJI().LJIILLIIL(interceptor);
    }

    @Override // X.InterfaceC80021Var
    public final void LJIL(InterfaceC80037Vb7 interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        LJI().LJIL(interceptor);
    }

    @Override // X.InterfaceC80025Vav
    public final void LJIIJ(V1L v1l, C48651J7n c48651J7n) {
        LJ().LIZ(LJI().LJ(v1l, c48651J7n));
    }
}
