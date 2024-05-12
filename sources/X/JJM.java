package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes9.dex */
public final class JJM implements View.OnTouchListener {
    public static final JJM LJLIL = new JJM();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            view.performClick();
            return false;
        }
        return false;
    }
}
