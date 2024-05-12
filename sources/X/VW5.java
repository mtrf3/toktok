package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes15.dex */
public class VW5 extends VW3 {
    public boolean LJLJL;

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LJLJL && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LJLJL && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.VW3, androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    public void setNoScroll(boolean z) {
        this.LJLJL = z;
    }

    public VW5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJL = true;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    @Override // X.VW3, androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(i, z);
    }
}
