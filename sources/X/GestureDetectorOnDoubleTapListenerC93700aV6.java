package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* renamed from: X.aV6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class GestureDetectorOnDoubleTapListenerC93700aV6 implements GestureDetector.OnDoubleTapListener {
    public final float LJLIL;
    public final /* synthetic */ C93703aV9 LJLILLLLZI;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC93700aV6(C93703aV9 c93703aV9) {
        this.LJLILLLLZI = c93703aV9;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(c93703aV9.LJIIJJI);
        o.LJIIIIZZ(viewConfiguration, "ViewConfiguration.get(mContext)");
        float scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        o.LJIIIIZZ(ViewConfiguration.get(c93703aV9.LJIIJJI), "ViewConfiguration.get(mContext)");
        this.LJLIL = scaledDoubleTapSlop * r0.getScaledDoubleTapSlop();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 1) {
            return false;
        }
        float x = motionEvent.getX() - this.LJLILLLLZI.LJIIIIZZ;
        float y = motionEvent.getY();
        C93703aV9 c93703aV9 = this.LJLILLLLZI;
        float f = y - c93703aV9.LJIIIZ;
        if ((x * x) + (f * f) >= this.LJLIL) {
            return false;
        }
        return c93703aV9.LJIILIIL.LJJJ(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent != null) {
            return this.LJLILLLLZI.LJIILIIL.onSingleTapConfirmed(motionEvent);
        }
        return false;
    }
}
