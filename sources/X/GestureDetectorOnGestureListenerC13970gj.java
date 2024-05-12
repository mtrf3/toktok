package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: X.0gj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC13970gj extends FrameLayout implements GestureDetector.OnGestureListener {
    public float LJLIL;
    public float LJLILLLLZI;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public GestureDetectorOnGestureListenerC13970gj(Context context) {
        super(context);
        new GestureDetector(context, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (Math.abs(motionEvent.getX() - this.LJLIL) > 20.0f || Math.abs(motionEvent.getY() - this.LJLILLLLZI) > 20.0f)) {
                    C13930gf.LIZLLL(true);
                    C19610pp.LIZ().removeCallbacks(C19610pp.LIZIZ);
                }
            } else {
                C13930gf.LIZLLL(false);
                Handler LIZ = C19610pp.LIZ();
                RunnableC19600po runnableC19600po = C19610pp.LIZIZ;
                LIZ.removeCallbacks(runnableC19600po);
                C19610pp.LIZ().postDelayed(runnableC19600po, 1000L);
            }
        } else {
            this.LJLIL = motionEvent.getX();
            this.LJLILLLLZI = motionEvent.getY();
        }
        return dispatchTouchEvent;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C13930gf.LIZLLL(false);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        C13930gf.LIZLLL(false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C13930gf.LIZIZ();
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C13930gf.LIZLLL(true);
        Handler LIZ = C19610pp.LIZ();
        RunnableC19600po runnableC19600po = C19610pp.LIZIZ;
        LIZ.removeCallbacks(runnableC19600po);
        C19610pp.LIZ().postDelayed(runnableC19600po, 1000L);
    }
}
