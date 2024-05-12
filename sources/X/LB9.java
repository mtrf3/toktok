package X;

import Y.AUListenerS97S0100000_9;
import Y.IDAListenerS40S0200000_9;
import Y.IDAListenerS77S0100000_9;
import android.animation.ValueAnimator;
import com.bytedance.tux.icon.TuxIconView;

/* loaded from: classes10.dex */
public final class LB9 {
    public static final int LIZLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
    public final LOS LIZ;
    public ValueAnimator LIZIZ;
    public ValueAnimator LIZJ;

    public LB9(LOS los) {
        this.LIZ = los;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LIZIZ = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(110L);
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.LIZJ = ofFloat2;
        if (ofFloat2 == null) {
            return;
        }
        ofFloat2.setDuration(110L);
    }

    public final void LIZ(TuxIconView tuxIconView, boolean z) {
        ValueAnimator valueAnimator;
        if (z) {
            ValueAnimator valueAnimator2 = this.LIZIZ;
            if (valueAnimator2 != null && !valueAnimator2.isRunning()) {
                if (tuxIconView != null && tuxIconView.getVisibility() == 0) {
                    return;
                }
                ValueAnimator valueAnimator3 = this.LIZIZ;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator4 = this.LIZIZ;
                if (valueAnimator4 != null) {
                    C16880lQ.LJLJL(valueAnimator4);
                }
                ValueAnimator valueAnimator5 = this.LIZIZ;
                if (valueAnimator5 != null) {
                    valueAnimator5.addUpdateListener(new AUListenerS97S0100000_9(tuxIconView, 75));
                }
                ValueAnimator valueAnimator6 = this.LIZIZ;
                if (valueAnimator6 != null) {
                    valueAnimator6.addListener(new IDAListenerS40S0200000_9(tuxIconView, this, 3));
                }
                ValueAnimator valueAnimator7 = this.LIZIZ;
                if (valueAnimator7 == null) {
                    return;
                }
                valueAnimator7.start();
                return;
            }
            return;
        }
        if (tuxIconView == null || (valueAnimator = this.LIZJ) == null || valueAnimator.isRunning() || tuxIconView.getVisibility() != 0) {
            return;
        }
        ValueAnimator valueAnimator8 = this.LIZJ;
        if (valueAnimator8 != null) {
            valueAnimator8.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator9 = this.LIZJ;
        if (valueAnimator9 != null) {
            C16880lQ.LJLJL(valueAnimator9);
        }
        ValueAnimator valueAnimator10 = this.LIZJ;
        if (valueAnimator10 != null) {
            valueAnimator10.addUpdateListener(new AUListenerS97S0100000_9(tuxIconView, 74));
        }
        ValueAnimator valueAnimator11 = this.LIZJ;
        if (valueAnimator11 != null) {
            valueAnimator11.addListener(new IDAListenerS77S0100000_9(tuxIconView, 37));
        }
        ValueAnimator valueAnimator12 = this.LIZJ;
        if (valueAnimator12 == null) {
            return;
        }
        valueAnimator12.start();
    }
}
