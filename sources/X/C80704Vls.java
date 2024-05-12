package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.Vls, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80704Vls implements C0C2 {
    public boolean LJLIL;
    public final /* synthetic */ C80695Vlj LJLILLLLZI;

    public C80704Vls(C80695Vlj c80695Vlj) {
        this.LJLILLLLZI = c80695Vlj;
    }

    @Override // X.C0C2
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C80695Vlj c80695Vlj = this.LJLILLLLZI;
        if (c80695Vlj.LLF == viewPager) {
            c80695Vlj.LJIJ(pagerAdapter2, this.LJLIL);
        }
    }
}
