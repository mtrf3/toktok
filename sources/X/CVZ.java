package X;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* loaded from: classes6.dex */
public final class CVZ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TextView LJLIL;

    public CVZ(TextView textView) {
        this.LJLIL = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.LJLIL.setScaleX(floatValue);
        this.LJLIL.setScaleY(floatValue);
    }
}
