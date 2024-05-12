package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.K4m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC51120K4m implements View.OnTouchListener {
    public static final ViewOnTouchListenerC51120K4m LJLIL = new ViewOnTouchListenerC51120K4m();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.performClick();
            return true;
        }
        return true;
    }
}
