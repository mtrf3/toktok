package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class ViewOnTouchListenerC100423ws implements View.OnTouchListener {
    public final void LIZ(View... viewArr) {
        if (viewArr.length <= 0) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setOnTouchListener(this);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                C101073xv.LIZ(view, false);
            }
        } else {
            C101073xv.LIZ(view, true);
        }
        return false;
    }
}
