package X;

import android.animation.ValueAnimator;

/* renamed from: X.VdN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80177VdN implements ValueAnimator.AnimatorUpdateListener {
    public final byte LJLIL;
    public final /* synthetic */ C80171VdH LJLILLLLZI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.LJLIL;
        if (b == 0) {
            this.LJLILLLLZI.LLF = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (1 == b) {
            C80171VdH c80171VdH = this.LJLILLLLZI;
            if (c80171VdH.LJLJLJ) {
                valueAnimator.cancel();
                return;
            }
            c80171VdH.LJLLJ = ((Integer) valueAnimator.getAnimatedValue()).intValue() / 2;
        } else if (2 == b) {
            this.LJLILLLLZI.LJLLLLLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (3 == b) {
            this.LJLILLLLZI.LJZI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (4 == b) {
            this.LJLILLLLZI.LJZL = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
        this.LJLILLLLZI.invalidate();
    }

    public C80177VdN(C80171VdH c80171VdH, byte b) {
        this.LJLILLLLZI = c80171VdH;
        this.LJLIL = b;
    }
}
