package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SJB extends GestureDetector.SimpleOnGestureListener {
    public final SJ4 LJLIL;
    public GestureDetector.SimpleOnGestureListener LJLILLLLZI;

    public SJB(SJ4 defaultGestureHandler) {
        o.LJIIIZ(defaultGestureHandler, "defaultGestureHandler");
        this.LJLIL = defaultGestureHandler;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e) {
        o.LJIIIZ(e, "e");
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LJLILLLLZI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onDoubleTap(e);
        }
        return this.LJLIL.onDoubleTap(e);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e) {
        o.LJIIIZ(e, "e");
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LJLILLLLZI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onDoubleTapEvent(e);
        }
        this.LJLIL.onDoubleTapEvent(e);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        o.LJIIIZ(e, "e");
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LJLILLLLZI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onDown(e);
        }
        return this.LJLIL.onDown(e);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LJLILLLLZI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onLongPress(e);
        }
        this.LJLIL.onLongPress(e);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LJLILLLLZI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onShowPress(e);
        }
        this.LJLIL.onShowPress(e);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LJLILLLLZI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onSingleTapConfirmed(e);
        }
        return this.LJLIL.onSingleTapConfirmed(e);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        o.LJIIIZ(e, "e");
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LJLILLLLZI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onSingleTapUp(e);
        }
        return this.LJLIL.onSingleTapUp(e);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LJLILLLLZI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onFling(e1, e2, f, f2);
        }
        return this.LJLIL.onFling(e1, e2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.LJLILLLLZI;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onScroll(e1, e2, f, f2);
        }
        return this.LJLIL.onScroll(e1, e2, f, f2);
    }
}
