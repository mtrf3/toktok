package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.o;

/* renamed from: X.WGf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82001WGf extends GestureDetectorOnGestureListenerC82008WGm {
    public final /* synthetic */ C82000WGe LJLIL;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public C82001WGf(C82000WGe c82000WGe) {
        this.LJLIL = c82000WGe;
    }

    @Override // X.GestureDetectorOnGestureListenerC82008WGm, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (this.LJLIL.getChildCount() == 0) {
            return false;
        }
        this.LJLIL.getClass();
        return true;
    }

    @Override // X.GestureDetectorOnGestureListenerC82008WGm, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        InterfaceC82009WGn interfaceC82009WGn = this.LJLIL.LJLLL;
        if (interfaceC82009WGn != null) {
            interfaceC82009WGn.LJIIJ();
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InterfaceC82009WGn interfaceC82009WGn = this.LJLIL.LJLLL;
        if (interfaceC82009WGn != null) {
            interfaceC82009WGn.LIZIZ();
            return true;
        }
        return true;
    }

    @Override // X.GestureDetectorOnGestureListenerC82008WGm, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C82000WGe c82000WGe = this.LJLIL;
        float f3 = -f;
        float f4 = -f2;
        float f5 = c82000WGe.LJZ + f3;
        c82000WGe.LJZ = f5;
        float f6 = c82000WGe.LJZI + f4;
        c82000WGe.LJZI = f6;
        if (!c82000WGe.LJLZ && f6 > Math.abs(f5)) {
            c82000WGe.LJLZ = true;
            c82000WGe.getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (c82000WGe.LJLZ) {
            c82000WGe.LJLLLLLL += f4;
            Matrix matrix = new Matrix(c82000WGe.LL);
            matrix.postTranslate(f3, f4);
            RectF rectF = new RectF(0.0f, 0.0f, c82000WGe.getWidth(), c82000WGe.getHeight());
            float min = 1.0f - Math.min(1.0f, Math.abs(c82000WGe.LJLLLLLL) / (rectF.height() * 1.0f));
            c82000WGe.LJZL = min;
            InterfaceC82009WGn interfaceC82009WGn = c82000WGe.LJLLL;
            if (interfaceC82009WGn != null) {
                interfaceC82009WGn.LIZ(min);
            }
            RectF rectF2 = new RectF(0.0f, 0.0f, c82000WGe.getWidth(), c82000WGe.getHeight());
            float min2 = ((Math.min(1.0f, Math.abs(c82000WGe.LJLLLLLL) / (rectF2.height() * 1.0f)) * (-0.5f)) + 1.0f) / C81199Vtr.LIZ(c82000WGe.LL);
            matrix.postScale(min2, min2, motionEvent2.getX(), motionEvent2.getY());
            c82000WGe.setImageMatrix(matrix);
        }
        return true;
    }
}
