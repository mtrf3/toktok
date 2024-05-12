package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.LNf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54155LNf implements LOF, InterfaceC225058sP {
    public final InterfaceC225058sP LJLIL;
    public final LPU LJLILLLLZI;

    @Override // X.LOF
    public final Fragment LIZ() {
        PagerAdapter adapter = this.LJLILLLLZI.getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.ui.MainPagerAdapter");
        return ((C54075LKd) adapter).getCurrentFragment();
    }

    @Override // X.LOF
    public final int getCurrentItemCompat() {
        return this.LJLILLLLZI.getCurrentItemCompat();
    }

    @Override // X.InterfaceC225058sP
    public final InterfaceC55235Lm3 ul() {
        return this.LJLIL.ul();
    }

    @Override // X.InterfaceC225058sP
    public final void B(int i) {
        this.LJLIL.B(1);
    }

    @Override // X.LOF
    public final void LJJJJZ(boolean z) {
        this.LJLILLLLZI.LLJJJJ = z;
    }

    public C54155LNf(InterfaceC225058sP interfaceC225058sP, LPU lpu) {
        this.LJLIL = interfaceC225058sP;
        this.LJLILLLLZI = lpu;
    }

    @Override // X.LOF
    public final void setCurrentItem(int i, boolean z) {
        this.LJLILLLLZI.setCurrentItem(i, z);
    }
}
