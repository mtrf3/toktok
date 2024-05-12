package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes15.dex */
public class VW7 extends VW3 {
    public boolean LJLJL;

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJL) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setPagingEnable(boolean z) {
        this.LJLJL = z;
    }

    public VW7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
