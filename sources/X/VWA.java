package X;

import Y.IDiS275S0100000_14;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class VWA extends VW3 {
    public AbstractC51499KJb LJLJL;

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (VWG.LIZ) {
            return true;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // X.VW3, androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (!(pagerAdapter instanceof AbstractC51499KJb)) {
            return;
        }
        this.LJLJL = (AbstractC51499KJb) pagerAdapter;
        super.setAdapter(pagerAdapter);
    }

    public VWA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addOnPageChangeListener(new IDiS275S0100000_14(this, 0));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void onPageScrolled(int i, float f, int i2) {
        if (getCurrentItem() == i) {
            int i3 = i + 1;
            if (f >= 0.1f && this.LJLJL.LJJIIJ(i3)) {
                this.LJLJL.getClass();
                this.LJLJL.LJJIIJZLJL(i3, this);
                this.LJLJL.LJIIJJI(this);
            }
        } else if (getCurrentItem() > i && 1.0f - f >= 0.1f && this.LJLJL.LJJIIJ(i)) {
            this.LJLJL.getClass();
            this.LJLJL.LJJIIJZLJL(i, this);
            this.LJLJL.LJIIJJI(this);
        }
        if (!Float.isNaN(f)) {
            super.onPageScrolled(i, f, i2);
            return;
        }
        super.onPageScrolled(i, 0.0f, i2);
        HashMap hashMap = new HashMap();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append("");
        hashMap.put("position", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(f);
        LIZ2.append("");
        hashMap.put("offset", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(i2);
        LIZ3.append("");
        hashMap.put("offsetPixels", X1D.LIZIZ(LIZ3));
        C78983UzD.LJIILLIIL("search_pageScroll_crash", hashMap);
    }
}
