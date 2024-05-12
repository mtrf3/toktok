package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes13.dex */
public final class SQI implements View.OnTouchListener {
    public static final SQI LJLIL = new SQI();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
