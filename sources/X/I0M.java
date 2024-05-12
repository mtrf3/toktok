package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes8.dex */
public class I0M extends C81303VvX {
    public float LJLJLJ;

    @Override // X.C81303VvX, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LJLJLJ = motionEvent.getY();
            return false;
        }
        if (motionEvent.getAction() != 2 || C1I1.LIZIZ(motionEvent, this.LJLJLJ) <= ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
            return false;
        }
        return true;
    }

    public I0M(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
