package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.Vl8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80658Vl8 implements C0C2 {
    public boolean LJLIL;
    public final /* synthetic */ C80655Vl5 LJLILLLLZI;

    public C80658Vl8(C80655Vl5 c80655Vl5) {
        this.LJLILLLLZI = c80655Vl5;
    }

    @Override // X.C0C2
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C80655Vl5 c80655Vl5 = this.LJLILLLLZI;
        if (c80655Vl5.LLFZ == viewPager) {
            c80655Vl5.LJIIL(pagerAdapter2, this.LJLIL);
        }
    }
}
