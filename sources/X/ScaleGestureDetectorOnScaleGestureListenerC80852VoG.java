package X;

import android.content.Context;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* renamed from: X.VoG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC80852VoG implements ScaleGestureDetector.OnScaleGestureListener {
    public float LJLIL;
    public float LJLILLLLZI;
    public boolean LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final ScaleGestureDetector LJLJJLL;
    public final InterfaceC80853VoH LJLJL;
    public VelocityTracker LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public boolean LJLLI;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        float scaleFactor = detector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.LJLJL.LIZJ(scaleFactor, detector.getFocusX(), detector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        this.LJLLI = true;
        return true;
    }

    public ScaleGestureDetectorOnScaleGestureListenerC80852VoG(Context context, InterfaceC80853VoH scaleDragGestureListener) {
        o.LJIIIZ(scaleDragGestureListener, "scaleDragGestureListener");
        this.LJLL = -1;
        this.LJLJJLL = new ScaleGestureDetector(context, this);
        this.LJLJL = scaleDragGestureListener;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LJLJJL = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJLJJI = viewConfiguration.getScaledTouchSlop();
    }
}
