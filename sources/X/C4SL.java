package X;

import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4SL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SL extends AbstractC102243zo {
    public final String LIZIZ;
    public final int[] LIZJ;
    public final int LIZLLL = 7;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 982));

    @Override // X.AbstractC102243zo
    public final void LIZ() {
        ((C115934gn) this.LJ.getValue()).LIZ();
    }

    @Override // X.AbstractC102243zo
    public final void LIZIZ() {
        C115934gn c115934gn = (C115934gn) this.LJ.getValue();
        c115934gn.LJLJJL = null;
        c115934gn.LJLJJI.clear();
        C63309Osz.LIZLLL().LJIILLIIL(c115934gn.LJLIL, c115934gn);
    }

    public final C115954gp LIZLLL() {
        C115954gp c115954gp = ((C115934gn) this.LJ.getValue()).LJLJJI;
        o.LJIIIIZZ(c115954gp, "sdkModel.innerList");
        return c115954gp;
    }

    public final void LIZJ(InterfaceC99673vf observer) {
        o.LJIIIZ(observer, "observer");
        C115934gn c115934gn = (C115934gn) this.LJ.getValue();
        c115934gn.LJLJJL = observer;
        C63309Osz.LIZLLL().LJIILJJIL(c115934gn.LJLIL, c115934gn);
    }

    public C4SL(String str, int[] iArr) {
        this.LIZIZ = str;
        this.LIZJ = iArr;
    }
}
