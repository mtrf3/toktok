package X;

import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.KTb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC51759KTb implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ KTY LJLIL;

    public ScaleGestureDetectorOnScaleGestureListenerC51759KTb(KTY kty) {
        this.LJLIL = kty;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        KTY kty = this.LJLIL;
        float scaleFactor = detector.getScaleFactor() * kty.LJLZ;
        kty.LJLZ = scaleFactor;
        float max = Math.max(kty.LJLIL, Math.min(scaleFactor, kty.LJLILLLLZI));
        kty.LJLZ = max;
        FrameLayout frameLayout = kty.LJLLI;
        if (frameLayout != null) {
            frameLayout.setScaleX(max);
            frameLayout.setScaleY(kty.LJLZ);
            frameLayout.setPivotX((detector.getFocusX() - frameLayout.getTranslationX()) - frameLayout.getLeft());
            frameLayout.setPivotY((detector.getFocusY() - frameLayout.getTranslationY()) - frameLayout.getTop());
        }
        InterfaceC222998p5 interfaceC222998p5 = kty.LJLLILLLL;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.onScale(kty.LJLZ);
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        InterfaceC222998p5 interfaceC222998p5 = this.LJLIL.LJLLILLLL;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.onScaleBegin();
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        InterfaceC222998p5 interfaceC222998p5 = this.LJLIL.LJLLILLLL;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.onScaleEnd();
        }
    }
}
