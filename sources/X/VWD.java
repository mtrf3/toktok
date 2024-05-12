package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes15.dex */
public class VWD extends VWC {
    public boolean LJLJL;

    public VWD(Context context) {
        super(context);
        this.LJLJL = true;
    }

    @Override // X.VWC, X.VW3, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.VWC, X.VW3, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJL) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setSwipeEnabled(boolean z) {
        this.LJLJL = z;
    }

    public VWD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJL = true;
    }
}
