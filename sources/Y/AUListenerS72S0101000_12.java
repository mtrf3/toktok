package Y;

import X.C264612c;
import X.S09;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AUListenerS72S0101000_12 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS72S0101000_12 aUListenerS72S0101000_12, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((PdpBodyWidget) aUListenerS72S0101000_12.l0)._$_findCachedViewById(R.id.aga).setTranslationY((-(1 - floatValue)) * aUListenerS72S0101000_12.i1);
        ((PdpBodyWidget) aUListenerS72S0101000_12.l0)._$_findCachedViewById(R.id.isf).setTranslationY(floatValue * aUListenerS72S0101000_12.i1);
    }

    public static final void onAnimationUpdate$1(AUListenerS72S0101000_12 aUListenerS72S0101000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        ((View) aUListenerS72S0101000_12.l0).setTranslationY(((-r0) * animatedFraction) + aUListenerS72S0101000_12.i1);
    }

    public static final void onAnimationUpdate$2(AUListenerS72S0101000_12 aUListenerS72S0101000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((S09) aUListenerS72S0101000_12.l0).setPivotX(0.0f);
        ((S09) aUListenerS72S0101000_12.l0).setPivotY(aUListenerS72S0101000_12.i1);
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = ((S09) aUListenerS72S0101000_12.l0).LIZ(R.id.a2b).getLayoutParams();
        layoutParams.width = intValue;
        layoutParams.height = intValue;
        ((S09) aUListenerS72S0101000_12.l0).LIZ(R.id.a2a).setLayoutParams(layoutParams);
    }

    public AUListenerS72S0101000_12(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
