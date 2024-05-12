package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.NZe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnTouchListenerC59562NZe implements View.OnTouchListener {
    public static final ViewOnTouchListenerC59562NZe LJLIL = new ViewOnTouchListenerC59562NZe();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            return true;
        }
        return false;
    }
}
