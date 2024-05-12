package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.UjH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnTouchListenerC77995UjH implements View.OnTouchListener {
    public static final ViewOnTouchListenerC77995UjH LJLIL = new ViewOnTouchListenerC77995UjH();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            return view.performClick();
        }
        return false;
    }
}
