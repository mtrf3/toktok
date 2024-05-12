package X;

import Y.AUListenerS103S0100000_16;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.Yd2, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class RunnableC87800Yd2 implements Runnable {
    public final /* synthetic */ C87793Ycv LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ CharSequence LJLJI;

    public RunnableC87800Yd2(C87793Ycv c87793Ycv, int i, CharSequence charSequence) {
        this.LJLIL = c87793Ycv;
        this.LJLILLLLZI = i;
        this.LJLJI = charSequence;
    }

    public final void LIZ() {
        int scrollX;
        if (CCJ.LIZ(this.LJLIL.LJI.getContext())) {
            scrollX = this.LJLIL.LJI.getScrollX() - this.LJLILLLLZI;
        } else {
            scrollX = this.LJLIL.LJI.getScrollX() + this.LJLILLLLZI;
        }
        C87793Ycv c87793Ycv = this.LJLIL;
        c87793Ycv.LJIILLIIL = ValueAnimator.ofInt(c87793Ycv.LJI.getScrollX(), scrollX);
        ValueAnimator valueAnimator = this.LJLIL.LJIILLIIL;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator2 = this.LJLIL.LJIILLIIL;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(((this.LJLILLLLZI * 1.0f) / r1.LIZIZ.LIZLLL) * ((float) 1000));
        }
        C87793Ycv c87793Ycv2 = this.LJLIL;
        ValueAnimator valueAnimator3 = c87793Ycv2.LJIILLIIL;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS103S0100000_16(c87793Ycv2, 23));
        }
        C87793Ycv c87793Ycv3 = this.LJLIL;
        ValueAnimator valueAnimator4 = c87793Ycv3.LJIILLIIL;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new C87796Ycy(c87793Ycv3, this.LJLJI));
        }
        ValueAnimator valueAnimator5 = this.LJLIL.LJIILLIIL;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
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
}
