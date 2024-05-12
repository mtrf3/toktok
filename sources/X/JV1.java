package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes9.dex */
public final class JV1 implements View.OnTouchListener {
    public static final JV1 LJLIL = new JV1();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && !C6ZT.LIZ(view)) {
            view.performClick();
            return false;
        }
        return false;
    }
}
