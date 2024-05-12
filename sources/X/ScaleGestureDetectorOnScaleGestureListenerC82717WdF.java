package X;

import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.WdF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC82717WdF implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ ViewOnTouchListenerC82716WdE LJLIL;
    public final /* synthetic */ C82718WdG LJLILLLLZI;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        ViewOnTouchListenerC82716WdE viewOnTouchListenerC82716WdE = this.LJLIL;
        C82718WdG c82718WdG = this.LJLILLLLZI;
        float scaleFactor = detector.getScaleFactor() * viewOnTouchListenerC82716WdE.LJLLJ;
        viewOnTouchListenerC82716WdE.LJLLJ = scaleFactor;
        viewOnTouchListenerC82716WdE.LJLLJ = Math.max(ViewOnTouchListenerC82716WdE.LJZI, Math.min(scaleFactor, ViewOnTouchListenerC82716WdE.LJZL));
        FrameLayout overlayContainer = viewOnTouchListenerC82716WdE.getOverlayContainer();
        overlayContainer.setScaleX(viewOnTouchListenerC82716WdE.LJLLJ);
        overlayContainer.setScaleY(viewOnTouchListenerC82716WdE.LJLLJ);
        overlayContainer.setPivotX((detector.getFocusX() - overlayContainer.getTranslationX()) - overlayContainer.getLeft());
        overlayContainer.setPivotY((detector.getFocusY() - overlayContainer.getTranslationY()) - overlayContainer.getTop());
        c82718WdG.LIZJ.onScale(viewOnTouchListenerC82716WdE.LJLLJ);
        return true;
    }

    public ScaleGestureDetectorOnScaleGestureListenerC82717WdF(ViewOnTouchListenerC82716WdE viewOnTouchListenerC82716WdE, C82718WdG c82718WdG) {
        this.LJLIL = viewOnTouchListenerC82716WdE;
        this.LJLILLLLZI = c82718WdG;
    }
}
