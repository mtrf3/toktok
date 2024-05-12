package X;

import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MEO implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ MEP LJLIL;

    public MEO(MEP mep) {
        this.LJLIL = mep;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        MEP mep = this.LJLIL;
        mep.LIZ = detector.getScaleFactor() * mep.LIZ;
        this.LJLIL.LIZ = Math.round(r2.LIZ * 100) / 100.0f;
        MEP mep2 = this.LJLIL;
        mep2.LIZ = Math.max(mep2.LIZIZ, Math.min(mep2.LIZJ, mep2.LIZ));
        MEP mep3 = this.LJLIL;
        ViewGroup viewGroup = mep3.LJIIIZ;
        if (viewGroup != null) {
            viewGroup.setScaleX(mep3.LIZ);
            viewGroup.setScaleY(mep3.LIZ);
            viewGroup.setPivotX(detector.getFocusX());
            viewGroup.setPivotY(detector.getFocusY());
        }
        MEP mep4 = this.LJLIL;
        InterfaceC222998p5 interfaceC222998p5 = mep4.LJIIIIZZ;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.onScale(mep4.LIZ);
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        InterfaceC222998p5 interfaceC222998p5 = this.LJLIL.LJIIIIZZ;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.onScaleBegin();
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        InterfaceC222998p5 interfaceC222998p5 = this.LJLIL.LJIIIIZZ;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.onScaleEnd();
        }
    }
}
