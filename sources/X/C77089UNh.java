package X;

import android.animation.ValueAnimator;

/* renamed from: X.UNh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77089UNh extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LJLIL;
    public final /* synthetic */ C81098VsE LJLILLLLZI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C81098VsE c81098VsE = this.LJLILLLLZI;
        float[] fArr = this.LJLIL;
        boolean LJII = c81098VsE.LJII(fArr[0], fArr[1]);
        float[] fArr2 = this.LJLIL;
        float f = fArr2[0] * 0.9f;
        fArr2[0] = f;
        float f2 = fArr2[1] * 0.9f;
        fArr2[1] = f2;
        if (LJII) {
            float f3 = 0.0f - f;
            float f4 = 0.0f - f2;
            if (((float) Math.sqrt((f4 * f4) + (f3 * f3))) >= 1.0f) {
                return;
            }
        }
        valueAnimator.cancel();
    }

    public C77089UNh(C81098VsE c81098VsE, float f, float f2) {
        this.LJLILLLLZI = c81098VsE;
        setFloatValues(0.0f, 1.0f);
        setDuration(1000000L);
        addUpdateListener(this);
        this.LJLIL = new float[]{f, f2};
    }
}
