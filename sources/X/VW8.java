package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes15.dex */
public class VW8 extends VW3 {
    public void setScrollable(boolean z) {
    }

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJI && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public VW8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
