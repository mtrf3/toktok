package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Vtl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class GestureDetectorOnDoubleTapListenerC81193Vtl implements GestureDetector.OnDoubleTapListener {
    public final ViewOnTouchListenerC81187Vtf LJLIL;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC81193Vtl(ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf) {
        this.LJLIL = viewOnTouchListenerC81187Vtf;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLIL;
        if (viewOnTouchListenerC81187Vtf == null) {
            return false;
        }
        try {
            float LJFF = viewOnTouchListenerC81187Vtf.LJFF();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf2 = this.LJLIL;
            float f = viewOnTouchListenerC81187Vtf2.LJLJJL;
            if (LJFF < f) {
                viewOnTouchListenerC81187Vtf2.LJII(f, x, y, true);
            } else {
                if (LJFF >= f) {
                    float f2 = viewOnTouchListenerC81187Vtf2.LJLJJLL;
                    if (LJFF < f2) {
                        viewOnTouchListenerC81187Vtf2.LJII(f2, x, y, true);
                    }
                }
                viewOnTouchListenerC81187Vtf2.LJII(viewOnTouchListenerC81187Vtf2.LJLJJI, x, y, true);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLIL;
        if (viewOnTouchListenerC81187Vtf == null || viewOnTouchListenerC81187Vtf.LJ() == null) {
            return false;
        }
        this.LJLIL.getClass();
        InterfaceC71052Rua interfaceC71052Rua = this.LJLIL.LJZ;
        if (interfaceC71052Rua == null) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        interfaceC71052Rua.LIZ();
        return true;
    }
}
