package X;

import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.o;

/* renamed from: X.WsM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC83654WsM implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ C83631Wrz LJLIL;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
    }

    public ScaleGestureDetectorOnScaleGestureListenerC83654WsM(C83631Wrz c83631Wrz) {
        this.LJLIL = c83631Wrz;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        return this.LJLIL.LJFF.LLJJLIIIJLLLLLLLZ(detector.getCurrentSpan() - detector.getPreviousSpan(), detector.getScaleFactor());
    }
}
