package Y;

import X.C264612c;
import X.C78069UkT;
import X.LB9;
import X.LDQ;
import X.LOU;
import X.LOW;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AUListenerS99S0200000_9 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS99S0200000_9 aUListenerS99S0200000_9, ValueAnimator animation) {
        Integer num;
        o.LJIIIZ(animation, "animation");
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aUListenerS99S0200000_9.l0;
        if (layoutParams != null) {
            Object animatedValue = animation.getAnimatedValue();
            if (!(animatedValue instanceof Integer) || (num = (Integer) animatedValue) == null) {
                num = 0;
            }
            layoutParams.height = num.intValue();
        }
        ViewGroup viewGroup = (ViewGroup) aUListenerS99S0200000_9.l1;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setLayoutParams((ViewGroup.LayoutParams) aUListenerS99S0200000_9.l0);
    }

    public static final void onAnimationUpdate$1(AUListenerS99S0200000_9 aUListenerS99S0200000_9, ValueAnimator anim) {
        o.LJIIIZ(anim, "anim");
        LDQ ldq = (LDQ) aUListenerS99S0200000_9.l0;
        View view = (View) aUListenerS99S0200000_9.l1;
        Object animatedValue = anim.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ldq.getClass();
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$2(AUListenerS99S0200000_9 aUListenerS99S0200000_9, ValueAnimator anim) {
        o.LJIIIZ(anim, "anim");
        LDQ ldq = (LDQ) aUListenerS99S0200000_9.l0;
        View view = (View) aUListenerS99S0200000_9.l1;
        Object animatedValue = anim.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ldq.LJ(((Integer) animatedValue).intValue(), view, true);
    }

    public static final void onAnimationUpdate$3(AUListenerS99S0200000_9 aUListenerS99S0200000_9, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        LOW low = (LOW) aUListenerS99S0200000_9.l0;
        TextView textView = (TextView) aUListenerS99S0200000_9.l1;
        Float valueOf = Float.valueOf(floatValue);
        low.getClass();
        LOW.LJ(textView, valueOf, true);
    }

    public static final void onAnimationUpdate$4(AUListenerS99S0200000_9 aUListenerS99S0200000_9, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = ((ValueAnimator) aUListenerS99S0200000_9.l0).getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ViewGroup viewGroup = ((C78069UkT) aUListenerS99S0200000_9.l1).LJFF;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setAlpha(floatValue);
    }

    public static final void onAnimationUpdate$5(AUListenerS99S0200000_9 aUListenerS99S0200000_9, ValueAnimator anim) {
        o.LJIIIZ(anim, "anim");
        LOU lou = (LOU) aUListenerS99S0200000_9.l0;
        TuxIconView tuxIconView = (TuxIconView) aUListenerS99S0200000_9.l1;
        int animatedFraction = (int) (anim.getAnimatedFraction() * LB9.LIZLLL);
        lou.getClass();
        tuxIconView.setIconWidth(animatedFraction);
        ((TuxIconView) aUListenerS99S0200000_9.l1).setAlpha(anim.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$6(AUListenerS99S0200000_9 aUListenerS99S0200000_9, ValueAnimator anim) {
        o.LJIIIZ(anim, "anim");
        float animatedFraction = anim.getAnimatedFraction();
        float alpha = ((TuxIconView) aUListenerS99S0200000_9.l0).getAlpha() - animatedFraction;
        TuxIconView tuxIconView = (TuxIconView) aUListenerS99S0200000_9.l0;
        if (alpha < 0.0f) {
            alpha = 0.0f;
        }
        tuxIconView.setAlpha(alpha);
        LOU lou = (LOU) aUListenerS99S0200000_9.l1;
        lou.getClass();
        ((TuxIconView) aUListenerS99S0200000_9.l0).setIconWidth((int) ((1 - animatedFraction) * LB9.LIZLLL));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS99S0200000_9(com.bytedance.tux.icon.TuxIconView r2, X.LOU r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 5: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS99S0200000_9.<init>(com.bytedance.tux.icon.TuxIconView, X.LOU, int):void");
    }

    public AUListenerS99S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
