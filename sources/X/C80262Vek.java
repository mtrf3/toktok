package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.Vek, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80262Vek implements C0C2 {
    public boolean LJLIL;
    public final /* synthetic */ C80261Vej LJLILLLLZI;

    public C80262Vek(C80261Vej c80261Vej) {
        this.LJLILLLLZI = c80261Vej;
    }

    @Override // X.C0C2
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C80261Vej c80261Vej = this.LJLILLLLZI;
        if (c80261Vej.viewPager == viewPager) {
            c80261Vej.setPagerAdapter(pagerAdapter2, this.LJLIL);
        }
    }
}
