package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.0kN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16230kN {
    public final C16220kM LIZ;

    public final boolean LIZ(MotionEvent motionEvent) {
        return this.LIZ.LIZ.onTouchEvent(motionEvent);
    }

    public final void LIZIZ(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.LIZ.LIZ.setOnDoubleTapListener(onDoubleTapListener);
    }

    public C16230kN(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.LIZ = new C16220kM(context, onGestureListener);
    }
}
