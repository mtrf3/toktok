package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.VlH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80667VlH implements C0C2 {
    public boolean LJLIL;
    public final /* synthetic */ C80664VlE LJLILLLLZI;

    public C80667VlH(C80664VlE c80664VlE) {
        this.LJLILLLLZI = c80664VlE;
    }

    @Override // X.C0C2
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C80664VlE c80664VlE = this.LJLILLLLZI;
        if (c80664VlE.LLF == viewPager) {
            c80664VlE.LJIILJJIL(pagerAdapter2, this.LJLIL);
        }
    }
}
