package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.o;

/* renamed from: X.T4o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74054T4o implements C0C2 {
    public boolean LJLIL;
    public final /* synthetic */ C74053T4n LJLILLLLZI;

    public C74054T4o(C74053T4n c74053T4n) {
        this.LJLILLLLZI = c74053T4n;
    }

    @Override // X.C0C2
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        o.LJIIIZ(viewPager, "viewPager");
        if (this.LJLILLLLZI.getViewPager() == viewPager) {
            this.LJLILLLLZI.LJIIL(pagerAdapter2, this.LJLIL);
        }
    }
}
