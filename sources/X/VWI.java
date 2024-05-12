package X;

import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes15.dex */
public class VWI implements C0C3 {
    public final C0C3 LJLIL;
    public final /* synthetic */ VWH LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLIL.onPageScrollStateChanged(i);
        VWH vwh = this.LJLILLLLZI;
        if (!vwh.LJLJI || i != 0 || vwh.LIZJ() || this.LJLILLLLZI.getCurrentItem() != 0 || this.LJLILLLLZI.getScrollX() <= 0) {
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

    public VWI(VWH vwh, C0C3 c0c3) {
        this.LJLILLLLZI = vwh;
        this.LJLIL = c0c3;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        PagerAdapter adapter;
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
