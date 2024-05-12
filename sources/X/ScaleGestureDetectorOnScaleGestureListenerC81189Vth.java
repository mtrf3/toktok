package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* renamed from: X.Vth, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC81189Vth implements ScaleGestureDetector.OnScaleGestureListener {
    public final int LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final ScaleGestureDetector LJLJJI;
    public final InterfaceC81198Vtq LJLJJL;
    public VelocityTracker LJLJJLL;
    public boolean LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public int LJLL;
    public int LJLLI;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        float scaleFactor = detector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        InterfaceC81198Vtq interfaceC81198Vtq = this.LJLJJL;
        if (interfaceC81198Vtq != null) {
            ((ViewOnTouchListenerC81187Vtf) interfaceC81198Vtq).LJI(scaleFactor, detector.getFocusX(), detector.getFocusY());
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf;
        VA9<V92> LJ;
        o.LJIIIZ(detector, "detector");
        InterfaceC81198Vtq interfaceC81198Vtq = this.LJLJJL;
        if (interfaceC81198Vtq == null || (LJ = (viewOnTouchListenerC81187Vtf = (ViewOnTouchListenerC81187Vtf) interfaceC81198Vtq).LJ()) == null || viewOnTouchListenerC81187Vtf.LJFF() >= viewOnTouchListenerC81187Vtf.LJLJJI) {
            return;
        }
        viewOnTouchListenerC81187Vtf.LIZIZ();
        RectF LIZLLL = viewOnTouchListenerC81187Vtf.LIZLLL(viewOnTouchListenerC81187Vtf.LJLLJ);
        if (LIZLLL == null) {
            return;
        }
        LJ.post(new RunnableC81192Vtk(viewOnTouchListenerC81187Vtf, viewOnTouchListenerC81187Vtf.LJFF(), viewOnTouchListenerC81187Vtf.LJLJJI, LIZLLL.centerX(), LIZLLL.centerY()));
    }

    public ScaleGestureDetectorOnScaleGestureListenerC81189Vth(Context context, InterfaceC81198Vtq interfaceC81198Vtq) {
        o.LJIIIZ(context, "context");
        this.LJLIL = -1;
        this.LJLJJL = interfaceC81198Vtq;
        this.LJLL = -1;
        this.LJLJJI = new ScaleGestureDetector(context, this);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LJLJI = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LJLILLLLZI = viewConfiguration.getScaledTouchSlop();
    }
}
