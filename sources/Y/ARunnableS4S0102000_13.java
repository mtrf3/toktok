package Y;

import X.C0NB;
import X.C15380j0;
import X.C34K;
import X.U46;
import X.X1D;
import android.animation.ValueAnimator;

/* loaded from: classes14.dex */
public class ARunnableS4S0102000_13 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        long LIZ = (this.i1 / C15380j0.LIZ(40.0f)) * 1000;
        C34K c34k = new C34K();
        ValueAnimator valueAnimator = ((U46) this.l0).LJLL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ((U46) this.l0).LJLL = ValueAnimator.ofInt(0, this.i1);
        U46 u46 = (U46) this.l0;
        ValueAnimator valueAnimator2 = u46.LJLL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS7S0202000_13(u46, this.i1, c34k, this.i2, 0));
        }
        ValueAnimator valueAnimator3 = ((U46) this.l0).LJLL;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(LIZ);
        }
        ValueAnimator valueAnimator4 = ((U46) this.l0).LJLL;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public final void LIZ$1() {
        long LIZ = (this.i1 / C15380j0.LIZ(40.0f)) * 1000;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("duration = ");
        LIZ2.append(LIZ);
        C0NB.LJIIIZ("BattleVictoryLapActivityLayout", X1D.LIZIZ(LIZ2));
        C34K c34k = new C34K();
        ValueAnimator valueAnimator = ((U46) this.l0).LJLL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ((U46) this.l0).LJLL = ValueAnimator.ofInt(0, this.i1);
        U46 u46 = (U46) this.l0;
        ValueAnimator valueAnimator2 = u46.LJLL;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS7S0202000_13(u46, this.i1, c34k, this.i2, 1));
        }
        ValueAnimator valueAnimator3 = ((U46) this.l0).LJLL;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(LIZ);
        }
        ValueAnimator valueAnimator4 = ((U46) this.l0).LJLL;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public static final void run$0(ARunnableS4S0102000_13 aRunnableS4S0102000_13) {
        boolean LIZ;
        try {
            aRunnableS4S0102000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS4S0102000_13 aRunnableS4S0102000_13) {
        boolean LIZ;
        try {
            aRunnableS4S0102000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS4S0102000_13(int i, U46 u46, int i2, int i3) {
        this.$t = i3;
        this.i1 = i;
        this.l0 = u46;
        this.i2 = i2;
    }
}
