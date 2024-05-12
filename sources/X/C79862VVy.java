package X;

import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.VVy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79862VVy extends ViewPager {
    public boolean LJLIL;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new ARunnableS50S0100000_14(this, 17));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LJLIL) {
            return false;
        }
        if (getCurrentItem() == 0 && getChildCount() == 0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL) {
            if (getCurrentItem() == 0 && getChildCount() == 0) {
                return false;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return false;
    }

    public void setScrollable(boolean z) {
        this.LJLIL = z;
    }

    public C79862VVy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = true;
        setLayerType(2, null);
    }
}
