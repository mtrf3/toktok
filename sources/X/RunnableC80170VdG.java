package X;

import android.view.animation.AnimationUtils;

/* renamed from: X.VdG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC80170VdG implements Runnable {
    public int LJLIL;
    public final int LJLILLLLZI;
    public long LJLJI = AnimationUtils.currentAnimationTimeMillis();
    public float LJLJJI;
    public float LJLJJL;
    public final /* synthetic */ C80164VdA LJLJJLL;

    public final void LIZ() {
        C80164VdA c80164VdA = this.LJLJJLL;
        if (c80164VdA.LLLFF == this && !c80164VdA.LLJLIL.isFinishing) {
            if (Math.abs(c80164VdA.LJLILLLLZI) >= Math.abs(this.LJLILLLLZI)) {
                if (this.LJLILLLLZI != 0) {
                    double d = this.LJLJJL;
                    this.LJLIL = this.LJLIL + 1;
                    this.LJLJJL = (float) (Math.pow(0.44999998807907104d, r0 * 2) * d);
                } else {
                    double d2 = this.LJLJJL;
                    this.LJLIL = this.LJLIL + 1;
                    this.LJLJJL = (float) (Math.pow(0.8500000238418579d, r0 * 2) * d2);
                }
            } else {
                double d3 = this.LJLJJL;
                this.LJLIL = this.LJLIL + 1;
                this.LJLJJL = (float) (Math.pow(0.949999988079071d, r0 * 2) * d3);
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = this.LJLJJL * ((((float) (currentAnimationTimeMillis - this.LJLJI)) * 1.0f) / 1000.0f);
            if (Math.abs(f) >= 1.0f) {
                this.LJLJI = currentAnimationTimeMillis;
                float f2 = this.LJLJJI + f;
                this.LJLJJI = f2;
                this.LJLJJLL.LJIIL(f2);
                this.LJLJJLL.LLJJLIIIJLLLLLLLZ.postDelayed(this, 10);
                return;
            }
            C80164VdA c80164VdA2 = this.LJLJJLL;
            EnumC80174VdK enumC80174VdK = c80164VdA2.LLJLILLLLZIIL;
            if (enumC80174VdK.isDragging) {
                if (enumC80174VdK.isHeader) {
                    c80164VdA2.LLJL.LIZJ(EnumC80174VdK.PullDownCanceled);
                } else if (enumC80174VdK.isFooter) {
                    c80164VdA2.LLJL.LIZJ(EnumC80174VdK.PullUpCanceled);
                }
            }
            C80164VdA c80164VdA3 = this.LJLJJLL;
            c80164VdA3.LLLFF = null;
            if (Math.abs(c80164VdA3.LJLILLLLZI) < Math.abs(this.LJLILLLLZI)) {
                return;
            }
            int min = Math.min(Math.max((int) (Math.abs(this.LJLJJLL.LJLILLLLZI - this.LJLILLLLZI) / InterpolatorC80153Vcz.LIZIZ), 30), 100) * 10;
            C80164VdA c80164VdA4 = this.LJLJJLL;
            c80164VdA4.LJI(this.LJLILLLLZI, 0, min, c80164VdA4.LLFFF);
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

    public RunnableC80170VdG(C80164VdA c80164VdA, float f, int i) {
        this.LJLJJLL = c80164VdA;
        this.LJLJJL = f;
        this.LJLILLLLZI = i;
        c80164VdA.LLJJLIIIJLLLLLLLZ.postDelayed(this, 10);
        if (f > 0.0f) {
            c80164VdA.LLJL.LIZJ(EnumC80174VdK.PullDownToRefresh);
        } else {
            c80164VdA.LLJL.LIZJ(EnumC80174VdK.PullUpToLoad);
        }
    }
}
