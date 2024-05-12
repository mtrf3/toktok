package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Scroller;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* renamed from: X.VxQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class GestureDetectorOnGestureListenerC81420VxQ implements GestureDetector.OnGestureListener {
    public final /* synthetic */ ViewOnTouchListenerC81419VxP LJLIL;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public GestureDetectorOnGestureListenerC81420VxQ(ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP) {
        this.LJLIL = viewOnTouchListenerC81419VxP;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLIL;
        if (!viewOnTouchListenerC81419VxP.equals(viewOnTouchListenerC81419VxP.LJZ)) {
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LJLIL;
            if (!viewOnTouchListenerC81419VxP2.LJLJL.equals(viewOnTouchListenerC81419VxP2.LJZ)) {
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP3 = this.LJLIL;
                if (!viewOnTouchListenerC81419VxP3.LJLLI.LIZ(viewOnTouchListenerC81419VxP3.LJZ)) {
                    return false;
                }
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP4 = this.LJLIL;
                if (!viewOnTouchListenerC81419VxP4.LJLJJI) {
                    return false;
                }
                InterfaceC81421VxR interfaceC81421VxR = viewOnTouchListenerC81419VxP4.LJLLILLLL;
                if (interfaceC81421VxR != null) {
                    interfaceC81421VxR.LIZJ();
                }
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP5 = this.LJLIL;
                viewOnTouchListenerC81419VxP5.LJII(viewOnTouchListenerC81419VxP5.LJLLJ, 1, true);
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLIL;
        if (viewOnTouchListenerC81419VxP.LJLJI && !viewOnTouchListenerC81419VxP.LJFF() && f2 < 20.0f) {
            Scroller scroller = this.LJLIL.LJLJJLL;
            scroller.fling(scroller.getFinalX(), this.LJLIL.LJLJJLL.getFinalY(), (int) f2, 0, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, (int) f, 0, this.LJLIL.getHeight());
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLIL;
        if (!viewOnTouchListenerC81419VxP.LJLJI || viewOnTouchListenerC81419VxP.LJFF()) {
            return false;
        }
        if (f2 < 20.0f) {
            f2 = 20.0f;
        }
        this.LJLIL.LJLJL.scrollBy((int) ((f * 20.0f) / f2), 0);
        this.LJLIL.LJI();
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LJLIL;
        viewOnTouchListenerC81419VxP2.LLIIII = 2;
        viewOnTouchListenerC81419VxP2.invalidate();
        return true;
    }
}
