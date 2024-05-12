package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes6.dex */
public final class BE1 implements View.OnTouchListener {
    public static final BE1 LJLIL = new BE1();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 2) {
            return true;
        }
        return false;
    }
}
