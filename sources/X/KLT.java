package X;

import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes9.dex */
public class KLT implements Runnable {
    public final float LJLIL;
    public final float LJLILLLLZI = 0.0f;
    public final long LJLJI = System.currentTimeMillis();
    public final float LJLJJI;
    public final float LJLJJL;
    public final /* synthetic */ KLU LJLJJLL;

    public final void LIZ() {
        VA9<V92> LJFF = this.LJLJJLL.LJFF();
        if (LJFF == null) {
            return;
        }
        float interpolation = ((AccelerateDecelerateInterpolator) this.LJLJJLL.LJLJI).getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.LJLJI)) * 1.0f) / ((float) this.LJLJJLL.LJLJLJ)));
        float f = this.LJLJJI;
        float LIZIZ = C06420Na.LIZIZ(this.LJLJJL, f, interpolation, f) / this.LJLJJLL.LJI();
        KLU klu = this.LJLJJLL;
        float f2 = this.LJLIL;
        float f3 = this.LJLILLLLZI;
        if (klu.LJI() < klu.LJLJL || LIZIZ < 1.0f) {
            klu.LJLLL.postScale(LIZIZ, LIZIZ, f2, f3);
            klu.LIZIZ();
        }
        if (interpolation < 1.0f) {
            this.LJLJJLL.getClass();
            LJFF.postOnAnimation(this);
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

    public KLT(KLU klu, float f, float f2, float f3) {
        this.LJLJJLL = klu;
        this.LJLIL = f3;
        this.LJLJJI = f;
        this.LJLJJL = f2;
    }
}
