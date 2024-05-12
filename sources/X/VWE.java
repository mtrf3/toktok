package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a1;

/* loaded from: classes15.dex */
public final class VWE extends VW3 {
    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VWE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
