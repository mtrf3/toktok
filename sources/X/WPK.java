package X;

import Y.ARunnableS50S0100000_14;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WPK implements C6V2 {
    public float LIZ;
    public boolean LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final WPJ LJI;
    public final View LJII;

    @Override // X.C6V2
    public final boolean LJJIZ(float f) {
        return false;
    }

    @Override // X.C6V2
    public final boolean LJJJ(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return false;
    }

    @Override // X.C6V2
    public final boolean LJJJI() {
        return false;
    }

    @Override // X.C6V2
    public final boolean LJJJIL() {
        return false;
    }

    @Override // X.C6V2
    public final boolean LJLI(C82537WaL detector) {
        o.LJIIIZ(detector, "detector");
        return false;
    }

    @Override // X.C6V2
    public final boolean LJLJI(float f) {
        return false;
    }

    @Override // X.C6V2
    public final void LJLJJI(C82537WaL detector) {
        o.LJIIIZ(detector, "detector");
    }

    @Override // X.C6V2
    public final boolean LLLLLLLZIL(C82536WaK detector) {
        o.LJIIIZ(detector, "detector");
        return false;
    }

    @Override // X.C6V2
    public final boolean LLLLLLZ(float f) {
        return false;
    }

    @Override // X.C6V2
    public final boolean onDown(MotionEvent event) {
        o.LJIIIZ(event, "event");
        return false;
    }

    @Override // X.C6V2
    public final boolean onScale(ScaleGestureDetector scaleFactor) {
        o.LJIIIZ(scaleFactor, "scaleFactor");
        return false;
    }

    @Override // X.C6V2
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        return false;
    }

    @Override // X.C6V2
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return false;
    }

    @Override // X.C6V2
    public final boolean onSingleTapUp(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return false;
    }

    @Override // X.C6V2
    public final void LJIIIIZZ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (!this.LJ) {
            this.LIZLLL = false;
        } else {
            this.LIZLLL = true;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.LJ = false;
        }
    }

    @Override // X.C6V2
    public final boolean LJJIIZI(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (this.LJFF) {
            this.LJII.postDelayed(new ARunnableS50S0100000_14(this, 223), 100L);
            return false;
        }
        return false;
    }

    public WPK(WPJ mGestureAdapter, View mView) {
        o.LJIIIZ(mGestureAdapter, "mGestureAdapter");
        o.LJIIIZ(mView, "mView");
        this.LJI = mGestureAdapter;
        this.LJII = mView;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(C83739Wtj.LIZ());
        o.LJIIIIZZ(viewConfiguration, "ViewConfiguration.get(AS.applicationContext)");
        this.LIZJ = viewConfiguration.getScaledPagingTouchSlop();
    }

    @Override // X.C6V2
    public final boolean LJJLIL(C82537WaL detector, float f, float f2) {
        o.LJIIIZ(detector, "detector");
        this.LJ = true;
        return false;
    }

    @Override // X.C6V2
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        boolean z = false;
        this.LJFF = false;
        if (this.LIZLLL) {
            this.LIZLLL = false;
            if (!this.LIZIZ) {
                if (C47959Irz.LIZ(e2, e1.getX()) > C1I1.LIZIZ(e2, e1.getY())) {
                    z = this.LJI.LIZIZ(f, this.LIZ);
                }
                this.LIZ = 0.0f;
            }
        }
        return z;
    }

    @Override // X.C6V2
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        boolean z;
        Integer num;
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        int LIZ = (int) C47959Irz.LIZ(e2, e1.getX());
        int LIZIZ = (int) C1I1.LIZIZ(e2, e1.getY());
        int i = this.LIZJ;
        if (LIZ > i && LIZ > LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = z;
        if (LIZ <= i || LIZ <= LIZIZ || this.LIZIZ) {
            return false;
        }
        float width = this.LIZ + (f / this.LJII.getWidth());
        this.LIZ = width;
        float min = Math.min(width, 1.0f);
        this.LIZ = min;
        float max = Math.max(min, -1.0f);
        this.LIZ = max;
        WPJ wpj = this.LJI;
        if (!wpj.LJ) {
            return false;
        }
        if (wpj.LJFF != -1) {
            List list = (List) wpj.LJIIJ.LJJJJIZL().LJ().getValue();
            Integer num2 = null;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            List list2 = (List) wpj.LJIIJ.LJJJJIZL().LIZJ().getValue();
            if (list2 != null) {
                num2 = Integer.valueOf(list2.size());
            }
            if (!o.LJ(num, num2)) {
                C82232WPc.LIZ(wpj.LJIIJ, true, 2);
            }
        }
        wpj.LIZ(max);
        return true;
    }
}
