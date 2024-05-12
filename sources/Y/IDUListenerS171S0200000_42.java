package Y;

import X.C94176acm;
import android.animation.ValueAnimator;
import android.view.View;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDUListenerS171S0200000_42 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onAnimationUpdate$0(IDUListenerS171S0200000_42 iDUListenerS171S0200000_42, ValueAnimator valueAnimator) {
        C94176acm c94176acm = ((EffectLayerEditorFragment) iDUListenerS171S0200000_42.l1).LJLJJI;
        if (c94176acm != null) {
            ValueAnimator valueAnimator2 = (ValueAnimator) iDUListenerS171S0200000_42.l0;
            o.LJIIIIZZ(valueAnimator2, "this");
            Object animatedValue = valueAnimator2.getAnimatedValue();
            if (animatedValue != null) {
                c94176acm.setTranslationX(-((Float) animatedValue).floatValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        o.LJIJI("rootLayout");
        throw null;
    }

    public static final void onAnimationUpdate$1(IDUListenerS171S0200000_42 iDUListenerS171S0200000_42, ValueAnimator valueAnimator) {
        View view = (View) ((IDCListenerS149S0200000_42) iDUListenerS171S0200000_42.l1).l1;
        ValueAnimator valueAnimator2 = (ValueAnimator) iDUListenerS171S0200000_42.l0;
        o.LJIIIIZZ(valueAnimator2, "this");
        Object animatedValue = valueAnimator2.getAnimatedValue();
        if (animatedValue != null) {
            view.setTranslationX(-((Float) animatedValue).floatValue());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }

    public static final void onAnimationUpdate$2(IDUListenerS171S0200000_42 iDUListenerS171S0200000_42, ValueAnimator valueAnimator) {
        View view = (View) iDUListenerS171S0200000_42.l1;
        ValueAnimator valueAnimator2 = (ValueAnimator) iDUListenerS171S0200000_42.l0;
        o.LJIIIIZZ(valueAnimator2, "this");
        Object animatedValue = valueAnimator2.getAnimatedValue();
        if (animatedValue != null) {
            view.setTranslationX(-((Float) animatedValue).floatValue());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
    }

    public IDUListenerS171S0200000_42(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
