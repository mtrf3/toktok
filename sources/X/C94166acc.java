package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.acc, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C94166acc implements C0C2 {
    public boolean LJLIL;
    public final /* synthetic */ C93635aU3 LJLILLLLZI;

    public C94166acc(C93635aU3 c93635aU3) {
        this.LJLILLLLZI = c93635aU3;
    }

    @Override // X.C0C2
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C93635aU3 c93635aU3 = this.LJLILLLLZI;
        if (c93635aU3.LLF == viewPager) {
            c93635aU3.LJIILJJIL(pagerAdapter2, this.LJLIL);
        }
    }
}
