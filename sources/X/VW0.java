package X;

import androidx.viewpager.widget.PagerAdapter;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class VW0 implements C0C3 {
    public final C0C3 LJLIL;
    public final /* synthetic */ VW1 LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLIL.onPageScrollStateChanged(i);
        VW1 vw1 = this.LJLILLLLZI;
        if (!vw1.LJLJJLL || i != 0 || vw1.LIZJ() || this.LJLILLLLZI.getCurrentItem() != 0 || this.LJLILLLLZI.getScrollX() <= 0) {
            return;
        }
        this.LJLILLLLZI.setScrollX(0);
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        PagerAdapter adapter;
        adapter = super/*androidx.viewpager.widget.ViewPager*/.getAdapter();
        if (this.LJLILLLLZI.LIZJ() && adapter != null) {
            i = TB3.LIZ(adapter, i, -1);
        }
        this.LJLIL.onPageSelected(i);
    }

    public VW0(VW1 vw1, C0C3 c0c3) {
        this.LJLILLLLZI = vw1;
        this.LJLIL = c0c3;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        PagerAdapter adapter;
        if (Float.isNaN(f)) {
            HashMap hashMap = new HashMap();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append("");
            hashMap.put("position", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(0.0f);
            LIZ2.append("");
            hashMap.put("offset", X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(i2);
            LIZ3.append("");
            hashMap.put("offsetPixels", X1D.LIZIZ(LIZ3));
            C78983UzD.LJIILLIIL("RtlViewPager_pageScroll_crash", hashMap);
            f = 0.0f;
        }
        adapter = super/*androidx.viewpager.widget.ViewPager*/.getAdapter();
        if (this.LJLILLLLZI.LIZJ() && adapter != null) {
            if (i == adapter.getCount() - 1 && f == 0.0f) {
                i--;
                i2 = this.LJLILLLLZI.getWidth();
                f = 1.0f;
            }
            this.LJLIL.onPageScrolled((r1 - (i + 1)) - 1, 1.0f - f, this.LJLILLLLZI.getWidth() - i2);
            return;
        }
        this.LJLIL.onPageScrolled(i, f, i2);
    }
}
