package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LPV implements C0C3 {
    public final C0C3 LJLIL;
    public final /* synthetic */ C54962Lhe LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        C0C3 c0c3 = this.LJLIL;
        if (c0c3 == null) {
            return;
        }
        o.LJI(c0c3);
        c0c3.onPageScrollStateChanged(i);
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        C0C3 c0c3 = this.LJLIL;
        if (c0c3 == null) {
            return;
        }
        o.LJI(c0c3);
        c0c3.onPageSelected(this.LJLILLLLZI.LJJIJIIJIL(i));
    }

    public LPV(C54962Lhe c54962Lhe, C0C3 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI = c54962Lhe;
        this.LJLIL = listener;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.LJLIL == null) {
            return;
        }
        int LJJIJIIJIL = this.LJLILLLLZI.LJJIJIIJIL(i);
        if (this.LJLILLLLZI.LLJJIJIL) {
            float f2 = LJJIJIIJIL - f;
            LJJIJIIJIL = (int) f2;
            f = f2 - LJJIJIIJIL;
        }
        C0C3 c0c3 = this.LJLIL;
        o.LJI(c0c3);
        c0c3.onPageScrolled(LJJIJIIJIL, f, i2);
    }
}
