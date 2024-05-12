package X;

import android.hardware.Camera;
import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y5C extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ Y59 LJLIL;

    public Y5C(Y59 y59) {
        this.LJLIL = y59;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        Camera.Parameters parameters;
        o.LJIIIZ(detector, "detector");
        boolean z = false;
        if (Math.abs(detector.getCurrentSpan() - detector.getPreviousSpan()) <= C15380j0.LIZ(10.0f)) {
            return false;
        }
        Y59 y59 = this.LJLIL;
        if (detector.getScaleFactor() > 1.0f) {
            z = true;
        }
        Y58 cameraProxy = y59.getCameraProxy();
        Camera camera = cameraProxy.LIZJ;
        if (camera != null && (parameters = camera.getParameters()) != null && parameters.isZoomSupported()) {
            int maxZoom = parameters.getMaxZoom();
            int zoom = parameters.getZoom();
            if (z && zoom < maxZoom) {
                zoom++;
            } else if (zoom > 0) {
                zoom--;
            }
            parameters.setZoom(zoom);
            cameraProxy.LJ(parameters);
        }
        return true;
    }
}
