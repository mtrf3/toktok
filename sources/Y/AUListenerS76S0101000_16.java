package Y;

import X.AbstractC87817YdJ;
import X.C87819YdL;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public class AUListenerS76S0101000_16 implements ValueAnimator.AnimatorUpdateListener {
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
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS76S0101000_16 aUListenerS76S0101000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup viewGroup = ((C87819YdL) aUListenerS76S0101000_16.l0).LJIILL;
        if (viewGroup != null) {
            AbstractC87817YdJ.LJIIIIZZ(viewGroup, aUListenerS76S0101000_16.i1);
            TextView textView = ((C87819YdL) aUListenerS76S0101000_16.l0).LJIJI;
            if (textView != null) {
                Object animatedValue = it.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                textView.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            o.LJIJI("numText2");
            throw null;
        }
        o.LJIJI("numContainer");
        throw null;
    }

    public static final void onAnimationUpdate$1(AUListenerS76S0101000_16 aUListenerS76S0101000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup viewGroup = ((C87819YdL) aUListenerS76S0101000_16.l0).LJIILL;
        if (viewGroup != null) {
            AbstractC87817YdJ.LJIIIIZZ(viewGroup, aUListenerS76S0101000_16.i1);
            ImageView imageView = ((C87819YdL) aUListenerS76S0101000_16.l0).LJIJJLI;
            if (imageView != null) {
                Object animatedValue = it.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                imageView.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            o.LJIJI("numArrow");
            throw null;
        }
        o.LJIJI("numContainer");
        throw null;
    }

    public static final void onAnimationUpdate$2(AUListenerS76S0101000_16 aUListenerS76S0101000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup viewGroup = ((C87819YdL) aUListenerS76S0101000_16.l0).LJIILL;
        if (viewGroup != null) {
            AbstractC87817YdJ.LJIIIIZZ(viewGroup, aUListenerS76S0101000_16.i1);
            TextView textView = ((C87819YdL) aUListenerS76S0101000_16.l0).LJIJI;
            if (textView != null) {
                Object animatedValue = it.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                textView.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            o.LJIJI("numText2");
            throw null;
        }
        o.LJIJI("numContainer");
        throw null;
    }

    public static final void onAnimationUpdate$3(AUListenerS76S0101000_16 aUListenerS76S0101000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup viewGroup = ((C87819YdL) aUListenerS76S0101000_16.l0).LJIILL;
        if (viewGroup != null) {
            AbstractC87817YdJ.LJIIIIZZ(viewGroup, aUListenerS76S0101000_16.i1);
            TextView textView = ((C87819YdL) aUListenerS76S0101000_16.l0).LJIJI;
            if (textView != null) {
                Object animatedValue = it.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                textView.setScaleX(((Float) animatedValue).floatValue());
                TextView textView2 = ((C87819YdL) aUListenerS76S0101000_16.l0).LJIJI;
                if (textView2 != null) {
                    Object animatedValue2 = it.getAnimatedValue();
                    o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                    textView2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                o.LJIJI("numText2");
                throw null;
            }
            o.LJIJI("numText2");
            throw null;
        }
        o.LJIJI("numContainer");
        throw null;
    }

    public AUListenerS76S0101000_16(C87819YdL c87819YdL, int i, int i2) {
        this.$t = i2;
        this.l0 = c87819YdL;
        this.i1 = i;
    }
}
