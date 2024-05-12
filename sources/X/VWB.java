package X;

import Y.IDiS275S0100000_14;
import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VWB extends VW3 {
    public C55297Ln3 LJLJL;

    @Override // X.VW3, androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        this.LJLJL = (C55297Ln3) pagerAdapter;
        super.setAdapter(pagerAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VWB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        addOnPageChangeListener(new IDiS275S0100000_14(this, 9));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void onPageScrolled(int i, float f, int i2) {
        if (getCurrentItem() == i) {
            int i3 = i + 1;
            if (f >= 0.1f) {
                C55297Ln3 c55297Ln3 = this.LJLJL;
                o.LJI(c55297Ln3);
                if (c55297Ln3.LJJIIJ(i3)) {
                    o.LJI(this.LJLJL);
                    C55297Ln3 c55297Ln32 = this.LJLJL;
                    o.LJI(c55297Ln32);
                    c55297Ln32.LJJIIJZLJL(i3, this);
                    C55297Ln3 c55297Ln33 = this.LJLJL;
                    o.LJI(c55297Ln33);
                    c55297Ln33.LJIIJJI(this);
                }
            }
        } else if (getCurrentItem() > i && 1 - f >= 0.1f) {
            C55297Ln3 c55297Ln34 = this.LJLJL;
            o.LJI(c55297Ln34);
            if (c55297Ln34.LJJIIJ(i)) {
                o.LJI(this.LJLJL);
                C55297Ln3 c55297Ln35 = this.LJLJL;
                o.LJI(c55297Ln35);
                c55297Ln35.LJJIIJZLJL(i, this);
                C55297Ln3 c55297Ln36 = this.LJLJL;
                o.LJI(c55297Ln36);
                c55297Ln36.LJIIJJI(this);
            }
        }
        super.onPageScrolled(i, f, i2);
    }
}
