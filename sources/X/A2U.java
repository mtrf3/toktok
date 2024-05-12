package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes5.dex */
public final class A2U implements View.OnTouchListener {
    public static final A2U LJLIL = new A2U();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.requestFocusFromTouch();
        return false;
    }
}
