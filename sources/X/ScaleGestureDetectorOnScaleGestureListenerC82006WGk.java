package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.o;

/* renamed from: X.WGk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC82006WGk implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ C82002WGg LJLIL;

    public ScaleGestureDetectorOnScaleGestureListenerC82006WGk(C82002WGg c82002WGg) {
        this.LJLIL = c82002WGg;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        MotionEvent motionEvent = this.LJLIL.LJFF;
        if (motionEvent != null) {
            o.LJI(motionEvent);
            if (motionEvent.getPointerCount() <= 1) {
                return false;
            }
        }
        o.LJI(this.LJLIL.LIZJ);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
    }
}
