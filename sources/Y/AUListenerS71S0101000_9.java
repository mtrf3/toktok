package Y;

import X.C55108Lk0;
import X.C55121LkD;
import X.C76824UDc;
import X.LD8;
import android.animation.ValueAnimator;
import android.widget.ImageView;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AUListenerS71S0101000_9 implements ValueAnimator.AnimatorUpdateListener {
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
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                return;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                return;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public AUListenerS71S0101000_9(LD8 ld8, int i) {
        this.$t = i;
        this.l0 = ld8;
    }

    public static final void onAnimationUpdate$0(AUListenerS71S0101000_9 aUListenerS71S0101000_9, ValueAnimator valueAnimator) {
        int pow;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int viewPagerMarginTop = ((C55108Lk0) aUListenerS71S0101000_9.l0).getViewPagerMarginTop();
        C55108Lk0 c55108Lk0 = (C55108Lk0) aUListenerS71S0101000_9.l0;
        if (animatedFraction == 1.0f) {
            pow = -viewPagerMarginTop;
        } else {
            pow = (int) (((1.0d - Math.pow(animatedFraction, 3.0d)) * aUListenerS71S0101000_9.i1) - ((C55108Lk0) aUListenerS71S0101000_9.l0).getViewPagerMarginTop());
        }
        c55108Lk0.setViewPagerMarginTopByDelta(pow);
    }

    public static final void onAnimationUpdate$1(AUListenerS71S0101000_9 aUListenerS71S0101000_9, ValueAnimator valueAnimator) {
        int viewPagerMarginTop;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int viewPagerMarginTop2 = ((C55108Lk0) aUListenerS71S0101000_9.l0).getViewPagerMarginTop();
        C55108Lk0 c55108Lk0 = (C55108Lk0) aUListenerS71S0101000_9.l0;
        if (animatedFraction == 1.0f) {
            viewPagerMarginTop = -(viewPagerMarginTop2 + c55108Lk0.LJLLL);
        } else {
            double pow = 1.0d - Math.pow(animatedFraction, 3.0d);
            int i = aUListenerS71S0101000_9.i1;
            C55108Lk0 c55108Lk02 = (C55108Lk0) aUListenerS71S0101000_9.l0;
            viewPagerMarginTop = (int) ((pow * (i + c55108Lk02.LJLLL)) - (c55108Lk02.getViewPagerMarginTop() + ((C55108Lk0) aUListenerS71S0101000_9.l0).LJLLL));
        }
        c55108Lk0.setViewPagerMarginTopByDelta(viewPagerMarginTop);
    }

    public static final void onAnimationUpdate$2(AUListenerS71S0101000_9 aUListenerS71S0101000_9, ValueAnimator animation) {
        int pow;
        o.LJIIIZ(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        int viewPagerMarginTop = ((C55121LkD) aUListenerS71S0101000_9.l0).getViewPagerMarginTop();
        C55121LkD c55121LkD = (C55121LkD) aUListenerS71S0101000_9.l0;
        if (animatedFraction == 1.0f) {
            pow = -viewPagerMarginTop;
        } else {
            pow = (int) (((1 - Math.pow(animatedFraction, 3.0d)) * aUListenerS71S0101000_9.i1) - ((C55121LkD) aUListenerS71S0101000_9.l0).getViewPagerMarginTop());
        }
        c55121LkD.setViewPagerMarginTopByDelta(pow);
    }

    public static final void onAnimationUpdate$3(AUListenerS71S0101000_9 aUListenerS71S0101000_9, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ImageView imageView = ((C76824UDc) aUListenerS71S0101000_9.l0).LIZ;
        int i = aUListenerS71S0101000_9.i1;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        C76824UDc.LJI(((Float) animatedValue).floatValue(), i, imageView);
    }

    public static final void onAnimationUpdate$4(AUListenerS71S0101000_9 aUListenerS71S0101000_9, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ImageView imageView = ((C76824UDc) aUListenerS71S0101000_9.l0).LIZ;
        int i = aUListenerS71S0101000_9.i1;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        C76824UDc.LJI(((Float) animatedValue).floatValue(), i, imageView);
    }

    public static final void onAnimationUpdate$5(AUListenerS71S0101000_9 aUListenerS71S0101000_9, ValueAnimator animation) {
        int viewPagerMarginTop;
        o.LJIIIZ(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        int viewPagerMarginTop2 = ((C55121LkD) aUListenerS71S0101000_9.l0).getViewPagerMarginTop();
        C55121LkD c55121LkD = (C55121LkD) aUListenerS71S0101000_9.l0;
        if (animatedFraction == 1.0f) {
            viewPagerMarginTop = -(viewPagerMarginTop2 + c55121LkD.LJLLI);
        } else {
            double pow = 1 - Math.pow(animatedFraction, 3.0d);
            int i = aUListenerS71S0101000_9.i1;
            C55121LkD c55121LkD2 = (C55121LkD) aUListenerS71S0101000_9.l0;
            viewPagerMarginTop = (int) ((pow * (i + c55121LkD2.LJLLI)) - (c55121LkD2.getViewPagerMarginTop() + ((C55121LkD) aUListenerS71S0101000_9.l0).LJLLI));
        }
        c55121LkD.setViewPagerMarginTopByDelta(viewPagerMarginTop);
    }

    public static final void onAnimationUpdate$6(AUListenerS71S0101000_9 aUListenerS71S0101000_9, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        int i = aUListenerS71S0101000_9.i1;
        LD8 ld8 = (LD8) aUListenerS71S0101000_9.l0;
        if (i % ld8.LJLIL == 0) {
            Iterator<ValueAnimator.AnimatorUpdateListener> it = ld8.LJLJI.iterator();
            while (it.hasNext()) {
                it.next().onAnimationUpdate(animation);
            }
        }
        aUListenerS71S0101000_9.i1 = (aUListenerS71S0101000_9.i1 + 1) % ((LD8) aUListenerS71S0101000_9.l0).LJLIL;
    }

    public AUListenerS71S0101000_9(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
