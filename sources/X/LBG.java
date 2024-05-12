package X;

import Y.AUListenerS97S0100000_9;
import android.animation.ValueAnimator;

/* loaded from: classes10.dex */
public final class LBG {
    public final ValueAnimator LIZ;
    public final ValueAnimator LIZIZ;
    public boolean LIZJ;
    public InterfaceC88472Yns<? super ValueAnimator, C76800UCe> LIZLLL;

    public LBG() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.LIZ = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.5f);
        this.LIZIZ = ofFloat2;
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 16));
        ofFloat.setDuration(0L);
        ofFloat2.addUpdateListener(new AUListenerS97S0100000_9(this, 17));
        ofFloat2.setDuration(0L);
    }
}
