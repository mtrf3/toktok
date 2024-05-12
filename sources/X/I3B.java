package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* loaded from: classes8.dex */
public final class I3B extends WXA {
    public final /* synthetic */ I3A LJLIL;

    public I3B(I3A i3a) {
        this.LJLIL = i3a;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJJIIZI(MotionEvent motionEvent) {
        this.LJLIL.LJLJLJ = false;
        return false;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJJIZ(float f) {
        this.LJLIL.LJLJLJ = false;
        return false;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJLI(C82537WaL c82537WaL) {
        I3A i3a = this.LJLIL;
        if (i3a.LJLJLLL && !i3a.LJJLI() && this.LJLIL.LJLJLJ && c82537WaL != null) {
            Float valueOf = Float.valueOf(c82537WaL.LJII());
            I3A i3a2 = this.LJLIL;
            if (valueOf.floatValue() - i3a2.LJLJL >= i3a2.LJJLIIIJJIZ()) {
                I3A i3a3 = this.LJLIL;
                valueOf.floatValue();
                if (i3a3.getShortVideoContext().LJIIIIZZ() > 0) {
                    return false;
                }
                i3a3.LJLJL = 0.0f;
                i3a3.LJJLIIIJILLIZJL().LJLIIIL();
                return true;
            }
        }
        return false;
    }

    @Override // X.WXB, X.WXG
    public final void LJLJJI(C82537WaL c82537WaL) {
        this.LJLIL.LJLJLJ = false;
    }

    @Override // X.WXB, X.WXG
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.LJLIL.LJLJLJ = false;
        return false;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
        I3A i3a = this.LJLIL;
        if (!i3a.LJLJLLL) {
            return false;
        }
        i3a.LJLJLJ = true;
        if (c82537WaL != null) {
            f2 = c82537WaL.LJII();
        }
        i3a.LJLJL = f2;
        return false;
    }
}
