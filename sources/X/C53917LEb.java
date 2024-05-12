package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.LEb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53917LEb implements InterfaceC53931LEp {
    public static final C53917LEb LIZ = new C53917LEb();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C53921LEf.LJLIL);

    @Override // X.InterfaceC53931LEp
    public final boolean LIZLLL() {
        if (C35686DzW.LIZ("ITabletDiff.optRefferalCard")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC53931LEp
    public final boolean LJFF() {
        if (C35686DzW.LIZ("ITabletDiff.enableDetailActivityOrientationBehind")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC53931LEp
    public final boolean LJIILL() {
        if (C35686DzW.LIZ("ITabletDiff.needBlockLandscapeVideoOptimize")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC53931LEp
    public final InterfaceC206908Ac LIZ() {
        return LEY.LJLIL;
    }

    @Override // X.InterfaceC53931LEp
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC53931LEp
    public final C4C9 LIZJ() {
        return C53435Ky7.LIZ;
    }

    @Override // X.InterfaceC53931LEp
    public final InterfaceC40182Fpq LJ() {
        return C53922LEg.LJLIL;
    }

    @Override // X.InterfaceC53931LEp
    public final InterfaceC86380XvE LJI() {
        return new InterfaceC86380XvE() { // from class: X.7qO
            @Override // X.InterfaceC86380XvE
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC86380XvE
            public final void LIZIZ(View view) {
                C018905p c018905p;
                C53948LFg LIZJ = C53946LFe.LIZJ(view.getContext(), null);
                int LIZ2 = C47135Ieh.LIZ(24, Math.min(LIZJ.LIZIZ, LIZJ.LIZJ));
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                    c018905p.horizontalBias = 0.0f;
                    if (LIZ2 > 0) {
                        ((ViewGroup.MarginLayoutParams) c018905p).width = Math.min(O6R.LJJIIZ(C32151Nz.LJIIZILJ(517)), LIZ2);
                        view.setLayoutParams(c018905p);
                    }
                }
            }

            @Override // X.InterfaceC86380XvE
            public final void LIZJ(View view) {
                C018905p c018905p;
                C53948LFg LIZJ = C53946LFe.LIZJ(view.getContext(), null);
                int LIZ2 = C47135Ieh.LIZ(24, Math.min(LIZJ.LIZIZ, LIZJ.LIZJ));
                if (LIZ2 > 0) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                        c018905p.endToEnd = -1;
                        c018905p.startToStart = 0;
                        c018905p.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                        c018905p.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                        ((ViewGroup.MarginLayoutParams) c018905p).width = Math.min(O6R.LJJIIZ(C32151Nz.LJIIZILJ(517)), LIZ2);
                        view.setLayoutParams(c018905p);
                    }
                }
            }
        };
    }

    @Override // X.InterfaceC53931LEp
    public final InterfaceC48757JBp LJII() {
        return LEK.LJLIL;
    }

    @Override // X.InterfaceC53931LEp
    public final InterfaceC98133tB LJIIIIZZ() {
        return C53933LEr.LIZ;
    }

    @Override // X.InterfaceC53931LEp
    public final InterfaceC110474Vf LJIIIZ() {
        return C53919LEd.LJLIL;
    }

    @Override // X.InterfaceC53931LEp
    public final IFK LJIIJ() {
        return C52847Kod.LIZ;
    }

    @Override // X.InterfaceC53931LEp
    public final LFJ LJIIL() {
        return C53919LEd.LJLIL;
    }

    @Override // X.InterfaceC53931LEp
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC53931LEp
    public final C70D LJIILJJIL() {
        return LEX.LIZ;
    }

    @Override // X.InterfaceC53931LEp
    public final InterfaceC53923LEh LJIILLIIL() {
        return C53916LEa.LJLIL;
    }

    @Override // X.InterfaceC53931LEp
    public final void LJIIZILJ() {
    }

    @Override // X.InterfaceC53931LEp
    public final FLT LJIJ() {
        return C53920LEe.LIZ;
    }

    @Override // X.InterfaceC53931LEp
    public final InterfaceC209468Jy block() {
        return LEM.LIZ;
    }

    @Override // X.InterfaceC53931LEp
    public final InterfaceC53944LFc LJIIJJI(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (C35686DzW.LIZ("ITabletDiff.webView")) {
            return C53918LEc.LJLIL;
        }
        if (LF2.LIZIZ(activity)) {
            return new LFW(activity);
        }
        return C53918LEc.LJLIL;
    }
}
