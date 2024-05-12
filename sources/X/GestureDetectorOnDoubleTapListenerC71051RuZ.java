package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.RuZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class GestureDetectorOnDoubleTapListenerC71051RuZ implements GestureDetector.OnDoubleTapListener {
    public final C81188Vtg LJLIL;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC71051RuZ(C81188Vtg c81188Vtg) {
        this.LJLIL = c81188Vtg;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f;
        float minimumScale;
        C81188Vtg c81188Vtg = this.LJLIL;
        if (c81188Vtg == null) {
            return false;
        }
        try {
            float scale = c81188Vtg.getScale();
            float f2 = 0.0f;
            if (motionEvent != null) {
                f = motionEvent.getX();
                f2 = motionEvent.getY();
            } else {
                f = 0.0f;
            }
            if (scale < this.LJLIL.getMaximumScale()) {
                minimumScale = scale + 2.0f;
                if (minimumScale > this.LJLIL.getMaximumScale()) {
                    minimumScale = this.LJLIL.getMaximumScale();
                }
            } else {
                minimumScale = this.LJLIL.getMinimumScale();
            }
            ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLIL.LJLJLJ;
            if (viewOnTouchListenerC81187Vtf != null) {
                viewOnTouchListenerC81187Vtf.LJII(minimumScale, f, f2, true);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C81188Vtg c81188Vtg = this.LJLIL;
        if (c81188Vtg == null || c81188Vtg.getOnViewTapListener() == null) {
            return false;
        }
        InterfaceC71052Rua onViewTapListener = this.LJLIL.getOnViewTapListener();
        if (onViewTapListener != null) {
            if (motionEvent != null) {
                motionEvent.getX();
                motionEvent.getY();
            }
            onViewTapListener.LIZ();
            return true;
        }
        return true;
    }
}
