package X;

import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Wrw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class GestureDetectorOnDoubleTapListenerC83628Wrw implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ C83631Wrz LJLIL;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC83628Wrw(C83631Wrz c83631Wrz) {
        this.LJLIL = c83631Wrz;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C83631Wrz c83631Wrz = this.LJLIL;
        if (!c83631Wrz.LIZ) {
            return false;
        }
        c83631Wrz.LJ.p9(C83651WsJ.LIZIZ.LIZ(EnumC83653WsL.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW, null));
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent != null) {
            C83631Wrz c83631Wrz = this.LJLIL;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            InterfaceC83863Wvj interfaceC83863Wvj = c83631Wrz.LJFF;
            InterfaceC83624Wrs getViewWidth = c83631Wrz.LJ;
            o.LJIIIZ(getViewWidth, "$this$getViewWidth");
            int LIZJ = getViewWidth.getViewFunction().LIZJ();
            InterfaceC83624Wrs getViewHeight = c83631Wrz.LJ;
            o.LJIIIZ(getViewHeight, "$this$getViewHeight");
            int LIZIZ = getViewHeight.getViewFunction().LIZIZ();
            Resources resources = c83631Wrz.LIZLLL.getResources();
            o.LJIIIIZZ(resources, "context.resources");
            z = true;
            if (interfaceC83863Wvj.LJIILJJIL(LIZJ, resources.getDisplayMetrics().density, new float[]{x, y}, LIZIZ)) {
                c83631Wrz.LJ.LLLLLL((int) x, (int) y);
                if (c83631Wrz.LJ.getExposureCompensationEnable()) {
                    c83631Wrz.LJ.LLLLZLLIL(x, y);
                }
            }
        }
        return z;
    }
}
