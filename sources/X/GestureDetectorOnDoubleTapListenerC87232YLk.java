package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.YLk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class GestureDetectorOnDoubleTapListenerC87232YLk implements GestureDetector.OnDoubleTapListener {
    public final float LJLIL;
    public final /* synthetic */ C87231YLj LJLILLLLZI;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC87232YLk(C87231YLj c87231YLj) {
        this.LJLILLLLZI = c87231YLj;
        this.LJLIL = ViewConfiguration.get(c87231YLj.LIZ).getScaledDoubleTapSlop() * ViewConfiguration.get(c87231YLj.LIZ).getScaledDoubleTapSlop();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 1) {
            return false;
        }
        int measuredWidth = this.LJLILLLLZI.LIZIZ.getMeasuredWidth();
        int measuredHeight = this.LJLILLLLZI.LIZIZ.getMeasuredHeight();
        int i = measuredWidth / 10;
        int i2 = measuredHeight / 10;
        float x = motionEvent.getX() - this.LJLILLLLZI.LJIIJJI;
        float y = motionEvent.getY() - this.LJLILLLLZI.LJIIL;
        if ((y * y) + (x * x) >= this.LJLIL) {
            return false;
        }
        float f = i;
        if (motionEvent.getX() < f || measuredWidth - motionEvent.getX() < f) {
            return false;
        }
        float f2 = i2;
        if (motionEvent.getY() < f2 || measuredHeight - motionEvent.getY() < f2) {
            return false;
        }
        return this.LJLILLLLZI.LIZJ.LJJJ(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent != null) {
            return this.LJLILLLLZI.LIZJ.onSingleTapConfirmed(motionEvent);
        }
        return false;
    }
}
