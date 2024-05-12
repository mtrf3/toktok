package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.Vld, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80689Vld implements C0C2 {
    public boolean LJLIL;
    public final /* synthetic */ C80684VlY LJLILLLLZI;

    public C80689Vld(C80684VlY c80684VlY) {
        this.LJLILLLLZI = c80684VlY;
    }

    @Override // X.C0C2
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C80684VlY c80684VlY = this.LJLILLLLZI;
        if (c80684VlY.LLFZ == viewPager) {
            c80684VlY.LJIILJJIL(pagerAdapter2, this.LJLIL);
        }
    }
}
