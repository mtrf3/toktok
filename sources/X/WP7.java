package X;

import kotlin.jvm.internal.AqS164S0100000_14;

/* loaded from: classes15.dex */
public final class WP7 {
    public final C73893SzJ LIZ = new C73893SzJ();
    public final C73318Sq2 LIZIZ = new C73318Sq2();
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 417));
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 416));
    public WP8 LJ = WP8.HIDE;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS164S0100000_14(this, 418));
    public final InterfaceC65784Pro<WPL> LJI;
    public final InterfaceC65784Pro<InterfaceC81329Vvx> LJII;
    public final InterfaceC45540Hu4 LJIIIIZZ;
    public final InterfaceC65784Pro<C76800UCe> LJIIIZ;

    public final void LIZ(WP8 wp8) {
        InterfaceC81329Vvx interfaceC81329Vvx;
        InterfaceC81329Vvx interfaceC81329Vvx2;
        WP8 wp82 = this.LJ;
        if (wp82 == wp8) {
            return;
        }
        int ordinal = wp8.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (wp82 == WP8.FILTER_VIEW_SHOW) {
                        ((WPL) this.LIZJ.getValue()).hide();
                    }
                    if (wp82 == WP8.FILTER_BOX_SHOW && (interfaceC81329Vvx2 = (InterfaceC81329Vvx) this.LIZLLL.getValue()) != null) {
                        interfaceC81329Vvx2.hide();
                    }
                }
            } else {
                ((WPL) this.LIZJ.getValue()).show();
                if (wp82 == WP8.FILTER_BOX_SHOW && (interfaceC81329Vvx = (InterfaceC81329Vvx) this.LIZLLL.getValue()) != null) {
                    interfaceC81329Vvx.hide();
                }
            }
        } else {
            InterfaceC81329Vvx interfaceC81329Vvx3 = (InterfaceC81329Vvx) this.LIZLLL.getValue();
            if (interfaceC81329Vvx3 != null) {
                interfaceC81329Vvx3.show();
            }
            if (wp82 == WP8.FILTER_VIEW_SHOW) {
                ((WPL) this.LIZJ.getValue()).hide();
            }
        }
        this.LJ = wp8;
        WP8 wp83 = WP8.HIDE;
        if (wp82 == wp83) {
            InterfaceC45540Hu4 interfaceC45540Hu4 = this.LJIIIIZZ;
            if (interfaceC45540Hu4 != null) {
                interfaceC45540Hu4.registerActivityOnKeyDownListener((C5HC) this.LJFF.getValue());
            }
            this.LIZ.onNext(Boolean.TRUE);
            return;
        }
        if (wp8 != wp83) {
            return;
        }
        InterfaceC45540Hu4 interfaceC45540Hu42 = this.LJIIIIZZ;
        if (interfaceC45540Hu42 != null) {
            interfaceC45540Hu42.unRegisterActivityOnKeyDownListener((C5HC) this.LJFF.getValue());
        }
        this.LIZ.onNext(Boolean.FALSE);
    }

    public WP7(AqS164S0100000_14 aqS164S0100000_14, AqS164S0100000_14 aqS164S0100000_142, InterfaceC45540Hu4 interfaceC45540Hu4, AqS164S0100000_14 aqS164S0100000_143) {
        this.LJI = aqS164S0100000_14;
        this.LJII = aqS164S0100000_142;
        this.LJIIIIZZ = interfaceC45540Hu4;
        this.LJIIIZ = aqS164S0100000_143;
    }
}
