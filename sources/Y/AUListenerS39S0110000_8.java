package Y;

import X.C48740JAy;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class AUListenerS39S0110000_8 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS39S0110000_8 aUListenerS39S0110000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        View view = ((C48740JAy) aUListenerS39S0110000_8.l0).LIZJ;
        if (view != null) {
            if (!aUListenerS39S0110000_8.z1) {
                animatedFraction = 1.0f - animatedFraction;
            }
            view.setAlpha(animatedFraction);
        }
        View view2 = ((C48740JAy) aUListenerS39S0110000_8.l0).LIZJ;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS39S0110000_8 aUListenerS39S0110000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        LinearLayout linearLayout = ((C48740JAy) aUListenerS39S0110000_8.l0).LIZLLL;
        if (linearLayout != null) {
            if (!aUListenerS39S0110000_8.z1) {
                animatedFraction = 1.0f - animatedFraction;
            }
            linearLayout.setAlpha(animatedFraction);
        }
        LinearLayout linearLayout2 = ((C48740JAy) aUListenerS39S0110000_8.l0).LIZLLL;
        if (linearLayout2 != null) {
            linearLayout2.requestLayout();
        }
    }

    public AUListenerS39S0110000_8(C48740JAy c48740JAy, boolean z, int i) {
        this.$t = i;
        this.l0 = c48740JAy;
        this.z1 = z;
    }
}
