package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.HxR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45749HxR extends ViewPager {
    public AbstractC45750HxS<?> LJLIL;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        AbstractC45750HxS<?> abstractC45750HxS;
        super.setAdapter(pagerAdapter);
        if (pagerAdapter instanceof AbstractC45750HxS) {
            abstractC45750HxS = (AbstractC45750HxS) pagerAdapter;
        } else {
            abstractC45750HxS = null;
        }
        this.LJLIL = abstractC45750HxS;
    }

    public C45749HxR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.LJLIL == null) {
            super.onPageScrolled(i, f, i2);
            return;
        }
        if (getCurrentItem() == i) {
            int i3 = i + 1;
            if (0.1f < f && this.LJLIL.LJLILLLLZI.get(i3) != null) {
                this.LJLIL.getClass();
                this.LJLIL.LJJIII(i3, this);
                this.LJLIL.LJIIJJI(this);
            }
        } else if (getCurrentItem() > i && 0.1f < 1.0f - f && this.LJLIL.LJLILLLLZI.get(i) != null) {
            this.LJLIL.getClass();
            this.LJLIL.LJJIII(i, this);
            this.LJLIL.LJIIJJI(this);
        }
        super.onPageScrolled(i, f, i2);
    }
}
