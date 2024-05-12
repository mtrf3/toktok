package X;

import android.view.ScaleGestureDetector;

/* renamed from: X.WEn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ScaleGestureDetectorOnScaleGestureListenerC81957WEn implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ C81964WEu LJLIL;

    public ScaleGestureDetectorOnScaleGestureListenerC81957WEn(C81964WEu c81964WEu) {
        this.LJLIL = c81964WEu;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        boolean z = false;
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        C81964WEu c81964WEu = this.LJLIL;
        float f = c81964WEu.LLFFF * scaleFactor;
        c81964WEu.LLFFF = f;
        if (f > 1.0f) {
            z = true;
        }
        c81964WEu.LL = z;
        c81964WEu.LJLJL.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        this.LJLIL.LJFF();
        C81964WEu c81964WEu2 = this.LJLIL;
        InterfaceC81962WEs interfaceC81962WEs = c81964WEu2.LLILII;
        if (interfaceC81962WEs != null) {
            ((C81953WEj) interfaceC81962WEs).LIZ(c81964WEu2.LLFFF);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        InterfaceC81962WEs interfaceC81962WEs = this.LJLIL.LLILII;
        if (interfaceC81962WEs != null) {
            interfaceC81962WEs.getClass();
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        InterfaceC81962WEs interfaceC81962WEs = this.LJLIL.LLILII;
        if (interfaceC81962WEs != null) {
            interfaceC81962WEs.getClass();
        }
    }
}
