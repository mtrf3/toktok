package X;

import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: X.Vtk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC81192Vtk implements Runnable {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final long LJLJI = System.currentTimeMillis();
    public final float LJLJJI;
    public final float LJLJJL;
    public final /* synthetic */ ViewOnTouchListenerC81187Vtf LJLJJLL;

    public final void LIZ() {
        VA9<V92> LJ = this.LJLJJLL.LJ();
        if (LJ == null) {
            return;
        }
        float interpolation = ((AccelerateDecelerateInterpolator) this.LJLJJLL.LJLJI).getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.LJLJI)) * 1.0f) / ((float) this.LJLJJLL.LJLJL)));
        float f = this.LJLJJI;
        this.LJLJJLL.LJI(C06420Na.LIZIZ(this.LJLJJL, f, interpolation, f) / this.LJLJJLL.LJFF(), this.LJLIL, this.LJLILLLLZI);
        if (interpolation < 1.0f) {
            this.LJLJJLL.getClass();
            LJ.postOnAnimation(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC81192Vtk(ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf, float f, float f2, float f3, float f4) {
        this.LJLJJLL = viewOnTouchListenerC81187Vtf;
        this.LJLIL = f3;
        this.LJLILLLLZI = f4;
        this.LJLJJI = f;
        this.LJLJJL = f2;
    }
}
