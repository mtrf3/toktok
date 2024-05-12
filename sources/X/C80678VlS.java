package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.VlS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80678VlS implements C0C2 {
    public boolean LJLIL;
    public final /* synthetic */ C80675VlP LJLILLLLZI;

    public C80678VlS(C80675VlP c80675VlP) {
        this.LJLILLLLZI = c80675VlP;
    }

    @Override // X.C0C2
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C80675VlP c80675VlP = this.LJLILLLLZI;
        if (c80675VlP.LLFZ == viewPager) {
            c80675VlP.LJIILL(pagerAdapter2, this.LJLIL);
        }
    }
}
