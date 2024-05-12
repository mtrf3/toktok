package X;

import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vat, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80023Vat extends AbstractC80014Vak implements InterfaceC84737XNl, InterfaceC80037Vb7 {
    public InterfaceC80027Vax<V1L, C73363Sql> LJLILLLLZI = new V18();

    @Override // X.InterfaceC80037Vb7
    public final EnumC79963VZv LJIIIIZZ(EnumC79963VZv playMode) {
        o.LJIIJ(playMode, "playMode");
        return playMode;
    }

    @Override // X.InterfaceC80013Vaj
    public final void onDetach() {
        InterfaceC80021Var interfaceC80021Var;
        this.LJLILLLLZI = null;
        C80024Vau c80024Vau = this.LJLIL;
        if (c80024Vau != null && (interfaceC80021Var = c80024Vau.LJLJI) != null) {
            interfaceC80021Var.LJIILLIIL(this);
        }
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80047VbH
    public final void onCompletion() {
        EnumC79963VZv enumC79963VZv;
        InterfaceC80025Vav interfaceC80025Vav;
        InterfaceC80025Vav interfaceC80025Vav2;
        InterfaceC80025Vav interfaceC80025Vav3;
        InterfaceC80025Vav interfaceC80025Vav4;
        C80024Vau c80024Vau = this.LJLIL;
        V1L v1l = null;
        if (c80024Vau != null && (interfaceC80025Vav4 = c80024Vau.LJLJJLL) != null) {
            enumC79963VZv = interfaceC80025Vav4.R();
        } else {
            enumC79963VZv = null;
        }
        if (enumC79963VZv == EnumC79963VZv.SINGLE_LOOP) {
            C80024Vau c80024Vau2 = this.LJLIL;
            if (c80024Vau2 != null && (interfaceC80025Vav2 = c80024Vau2.LJLJJLL) != null && interfaceC80025Vav2.LJIJI()) {
                C80024Vau c80024Vau3 = this.LJLIL;
                if (c80024Vau3 != null && (interfaceC80025Vav3 = c80024Vau3.LJLJJLL) != null) {
                    v1l = interfaceC80025Vav3.LIZ();
                }
                LJIJJ(v1l, new C48651J7n("FROM_AUTO_SINGLE_LOOP"));
                return;
            }
            return;
        }
        C80024Vau c80024Vau4 = this.LJLIL;
        if (c80024Vau4 == null || (interfaceC80025Vav = c80024Vau4.LJLJJLL) == null || !interfaceC80025Vav.LJFF()) {
            return;
        }
        LJIIL(new C48651J7n("FROM_AUTO_PLAY_NEXT"));
    }

    @Override // X.InterfaceC80037Vb7
    public final InterfaceC79968Va0 LIZJ(InterfaceC79968Va0 interfaceC79968Va0) {
        InterfaceC80022Vas interfaceC80022Vas;
        C80024Vau c80024Vau = this.LJLIL;
        if (c80024Vau != null && (interfaceC80022Vas = c80024Vau.LJLJJL) != null) {
            interfaceC80022Vas.LJII(new C48651J7n("STOP_FROM_PLAYLIST_CHANGED"));
        }
        return interfaceC79968Va0;
    }

    @Override // X.InterfaceC84737XNl
    public final void LJIIL(C48651J7n c48651J7n) {
        V1L v1l;
        InterfaceC80025Vav interfaceC80025Vav;
        C80024Vau c80024Vau = this.LJLIL;
        if (c80024Vau != null && (interfaceC80025Vav = c80024Vau.LJLJJLL) != null) {
            v1l = interfaceC80025Vav.LIZJ();
        } else {
            v1l = null;
        }
        LJIJJ(v1l, c48651J7n);
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80038Vb8
    public final void LJIILIIL(V1L v1l) {
        InterfaceC80027Vax<V1L, C73363Sql> interfaceC80027Vax = this.LJLILLLLZI;
        if (interfaceC80027Vax != null) {
            interfaceC80027Vax.LIZ(v1l, new AqS180S0100000_14(this, 346));
        }
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80013Vaj
    public final void LJIILL(C80024Vau c80024Vau) {
        this.LJLIL = c80024Vau;
        InterfaceC80021Var interfaceC80021Var = c80024Vau.LJLJI;
        if (interfaceC80021Var != null) {
            interfaceC80021Var.LJIL(this);
        }
    }

    @Override // X.InterfaceC84737XNl
    public final void LJJ(C48651J7n c48651J7n) {
        V1L v1l;
        InterfaceC80025Vav interfaceC80025Vav;
        C80024Vau c80024Vau = this.LJLIL;
        if (c80024Vau != null && (interfaceC80025Vav = c80024Vau.LJLJJLL) != null) {
            v1l = interfaceC80025Vav.LJIIIIZZ();
        } else {
            v1l = null;
        }
        LJIJJ(v1l, c48651J7n);
    }

    @Override // X.InterfaceC80037Vb7
    public final V1L LJ(V1L v1l, C48651J7n c48651J7n) {
        InterfaceC80022Vas interfaceC80022Vas;
        C80024Vau c80024Vau = this.LJLIL;
        if (c80024Vau != null && (interfaceC80022Vas = c80024Vau.LJLJJL) != null) {
            if (c48651J7n == null) {
                c48651J7n = new C48651J7n("STOP_FROM_DATA_SOURCE_CHANGED");
            }
            interfaceC80022Vas.LJII(c48651J7n);
        }
        return v1l;
    }

    public final void LJIJJ(V1L v1l, C48651J7n c48651J7n) {
        InterfaceC80022Vas interfaceC80022Vas;
        InterfaceC80025Vav interfaceC80025Vav;
        C80024Vau c80024Vau = this.LJLIL;
        if (c80024Vau != null && (interfaceC80025Vav = c80024Vau.LJLJJLL) != null) {
            interfaceC80025Vav.LJIIJ(v1l, c48651J7n);
        }
        C80024Vau c80024Vau2 = this.LJLIL;
        if (c80024Vau2 != null && (interfaceC80022Vas = c80024Vau2.LJLJJL) != null) {
            interfaceC80022Vas.LJIIIZ(c48651J7n);
        }
    }
}
