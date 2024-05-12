package X;

import Y.ALAdapterS11S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;

/* renamed from: X.VdJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80173VdJ implements Runnable {
    public final /* synthetic */ float LJLIL = 1.0f;
    public final /* synthetic */ int LJLILLLLZI = 300;
    public final /* synthetic */ boolean LJLJI = false;
    public final /* synthetic */ C80164VdA LJLJJI;

    public final void LIZ() {
        C80164VdA c80164VdA = this.LJLJJI;
        if (c80164VdA.LLJLILLLLZIIL != EnumC80174VdK.Refreshing) {
            return;
        }
        ValueAnimator valueAnimator = c80164VdA.LLLFFI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJLJJI.LJLL = r2.getMeasuredWidth() / 2.0f;
        this.LJLJJI.LLJL.LIZJ(EnumC80174VdK.PullDownToRefresh);
        C80164VdA c80164VdA2 = this.LJLJJI;
        c80164VdA2.LLLFFI = ValueAnimator.ofInt(c80164VdA2.LJLILLLLZI, (int) (c80164VdA2.LLJILJILJ * this.LJLIL));
        this.LJLJJI.LLLFFI.setDuration(this.LJLILLLLZI);
        this.LJLJJI.LLLFFI.setInterpolator(new InterpolatorC80153Vcz(0));
        this.LJLJJI.LLLFFI.addUpdateListener(new AUListenerS101S0100000_14(this, 64));
        this.LJLJJI.LLLFFI.addListener(new ALAdapterS11S0100000_14(this, 61));
        this.LJLJJI.LLLFFI.start();
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

    public RunnableC80173VdJ(C80164VdA c80164VdA) {
        this.LJLJJI = c80164VdA;
    }
}
