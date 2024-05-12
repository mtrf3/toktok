package Y;

import X.C110614Vt;
import X.C264612c;
import X.C4EF;
import X.C79045V0n;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AUListenerS6S0102000_1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS6S0102000_1 aUListenerS6S0102000_1, ValueAnimator it) {
        Integer num;
        o.LJIIIZ(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        Context context = ((C4EF) aUListenerS6S0102000_1.l0).getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(aUListenerS6S0102000_1.i1, context);
        if (LJI != null) {
            int intValue = LJI.intValue();
            Context context2 = ((C4EF) aUListenerS6S0102000_1.l0).getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI2 = C79045V0n.LJI(aUListenerS6S0102000_1.i2, context2);
            if (LJI2 != null) {
                Object evaluate = ((C4EF) aUListenerS6S0102000_1.l0).LJLLLLLL.evaluate(animatedFraction, Integer.valueOf(intValue), Integer.valueOf(LJI2.intValue()));
                if (evaluate instanceof Integer) {
                    num = (Integer) evaluate;
                } else {
                    num = null;
                }
                View httContainer = ((C4EF) aUListenerS6S0102000_1.l0).getHttContainer();
                C4EF c4ef = (C4EF) aUListenerS6S0102000_1.l0;
                C110614Vt c110614Vt = c4ef.LJLLL;
                c110614Vt.LIZ = num;
                Context context3 = c4ef.getContext();
                o.LJIIIIZZ(context3, "context");
                httContainer.setBackground(c110614Vt.LIZ(context3));
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS6S0102000_1 aUListenerS6S0102000_1, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        TuxTextView tuxTextView = (TuxTextView) aUListenerS6S0102000_1.l0;
        int i = (int) (((aUListenerS6S0102000_1.i2 - r2) * floatValue) + aUListenerS6S0102000_1.i1);
        o.LJIIIZ(tuxTextView, "<this>");
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        layoutParams.width = i;
        tuxTextView.setLayoutParams(layoutParams);
    }

    public AUListenerS6S0102000_1(int i, int i2, Object obj, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
