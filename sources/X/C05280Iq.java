package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.0Iq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05280Iq extends ScrollView {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C38413F5t.LIZ("dispatchScrollViewTouchEvent")) {
            C35532Dx2.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C05280Iq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (C14030gp.LIZ) {
            i2 = View.MeasureSpec.makeMeasureSpec(C15380j0.LIZ(148.0f), LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
    }
}
