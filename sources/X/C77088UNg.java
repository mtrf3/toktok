package X;

import android.animation.ValueAnimator;

/* renamed from: X.UNg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77088UNg extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public final float[] LJLIL;
    public final /* synthetic */ C81091Vs7 LJLILLLLZI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C81091Vs7 c81091Vs7 = this.LJLILLLLZI;
        float[] fArr = this.LJLIL;
        boolean LJIIJJI = c81091Vs7.LJIIJJI(fArr[0], fArr[1]);
        float[] fArr2 = this.LJLIL;
        float f = fArr2[0] * 0.9f;
        fArr2[0] = f;
        float f2 = fArr2[1] * 0.9f;
        fArr2[1] = f2;
        if (LJIIJJI) {
            float f3 = 0.0f - f;
            float f4 = 0.0f - f2;
            if (((float) Math.sqrt((f4 * f4) + (f3 * f3))) >= 1.0f) {
                return;
            }
        }
        valueAnimator.cancel();
    }

    public C77088UNg(C81091Vs7 c81091Vs7, float f, float f2) {
        this.LJLILLLLZI = c81091Vs7;
        setFloatValues(0.0f, 1.0f);
        setDuration(1000000L);
        addUpdateListener(this);
        this.LJLIL = new float[]{f, f2};
    }
}
