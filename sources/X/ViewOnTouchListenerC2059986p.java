package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.86p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC2059986p implements View.OnTouchListener {
    public final float LJLIL = 0.5f;
    public final float LJLILLLLZI = 1.0f;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            view.setAlpha(this.LJLILLLLZI);
            return false;
        }
        view.setAlpha(this.LJLIL);
        return false;
    }
}
