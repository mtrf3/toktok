package X;

import Y.ALAdapterS6S0100000_8;
import Y.AUListenerS96S0100000_8;
import android.animation.ValueAnimator;

/* renamed from: X.KBv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51311KBv {
    public ValueAnimator LIZ;
    public ValueAnimator LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LIZIZ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LIZIZ.end();
        }
        ValueAnimator valueAnimator2 = this.LIZ;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.LIZ.end();
        }
    }

    public final void LIZIZ() {
        long j;
        LIZ();
        if (this.LIZLLL == 0) {
            return;
        }
        if (this.LIZIZ == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LIZIZ = valueAnimator;
            valueAnimator.setFloatValues(0.0f, 1.0f);
            ValueAnimator valueAnimator2 = this.LIZIZ;
            int i = this.LIZJ;
            if (i == 0) {
                j = 200;
            } else {
                j = i;
            }
            valueAnimator2.setDuration(j);
            this.LIZIZ.setInterpolator(new InterpolatorC216808f6(0.32f, 0.94f, 0.6f, 1.0f));
            C51313KBx c51313KBx = (C51313KBx) this;
            this.LIZIZ.addUpdateListener(new AUListenerS96S0100000_8(c51313KBx, 5));
            this.LIZIZ.addListener(new ALAdapterS6S0100000_8(c51313KBx, 8));
        }
        this.LIZIZ.start();
    }
}
