package X;

import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes15.dex */
public class VWK implements C0C3 {
    public final C0C3 LJLIL;
    public final /* synthetic */ VWJ LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLIL.onPageScrollStateChanged(i);
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

    public VWK(VWJ vwj, C0C3 c0c3) {
        this.LJLILLLLZI = vwj;
        this.LJLIL = c0c3;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        PagerAdapter adapter;
        int width = this.LJLILLLLZI.getWidth();
        adapter = super/*androidx.viewpager.widget.ViewPager*/.getAdapter();
        if (this.LJLILLLLZI.LIZJ() && adapter != null) {
            int count = adapter.getCount();
            float f2 = width;
            int LJIILJJIL = ((int) ((1.0f - adapter.LJIILJJIL(i)) * f2)) + i2;
            while (i < count && LJIILJJIL > 0) {
                i++;
                LJIILJJIL -= (int) (adapter.LJIILJJIL(i) * f2);
            }
            i = (count - i) - 1;
            i2 = -LJIILJJIL;
            f = i2 / (adapter.LJIILJJIL(i) * f2);
        }
        this.LJLIL.onPageScrolled(i, f, i2);
    }
}
