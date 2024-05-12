package X;

import androidx.viewpager.widget.PagerAdapter;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* renamed from: X.VVx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79861VVx implements C0C3 {
    public final C0C3 LJLIL;
    public final C79860VVw LJLILLLLZI;
    public final PagerAdapter LJLJI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLIL.onPageScrollStateChanged(i);
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        PagerAdapter pagerAdapter = this.LJLJI;
        if (this.LJLILLLLZI.LJLJL && pagerAdapter != null) {
            i = TB3.LIZ(pagerAdapter, i, -1);
        }
        this.LJLIL.onPageSelected(i);
    }

    public C79861VVx(C0C3 mListener, C79860VVw mViewPager, PagerAdapter pagerAdapter) {
        o.LJIIJ(mListener, "mListener");
        o.LJIIJ(mViewPager, "mViewPager");
        this.LJLIL = mListener;
        this.LJLILLLLZI = mViewPager;
        this.LJLJI = pagerAdapter;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        int width = this.LJLILLLLZI.getWidth();
        PagerAdapter pagerAdapter = this.LJLJI;
        if (this.LJLILLLLZI.LJLJL && pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            float f2 = width;
            int LJIILJJIL = ((int) ((1 - pagerAdapter.LJIILJJIL(i)) * f2)) + i2;
            while (i < count && LJIILJJIL > 0) {
                i++;
                LJIILJJIL -= (int) (pagerAdapter.LJIILJJIL(i) * f2);
            }
            i = (count - i) - 1;
            i2 = -LJIILJJIL;
            f = i2 / (pagerAdapter.LJIILJJIL(i) * f2);
        }
        try {
            this.LJLIL.onPageScrolled(i, f, i2);
        } catch (NullPointerException e) {
            LLog.LIZLLL(4, "ReversingOnPageChangeListener", e.toString());
        }
    }
}
