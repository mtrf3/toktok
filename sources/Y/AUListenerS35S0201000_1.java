package Y;

import X.C119894nB;
import X.C264612c;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AUListenerS35S0201000_1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS35S0201000_1 aUListenerS35S0201000_1, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aUListenerS35S0201000_1.l0;
        layoutParams.topMargin = aUListenerS35S0201000_1.i2 + intValue;
        ((View) aUListenerS35S0201000_1.l1).setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS35S0201000_1 aUListenerS35S0201000_1, ValueAnimator valueAnimator) {
        View underView;
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        C119894nB c119894nB = (C119894nB) aUListenerS35S0201000_1.l0;
        float f = 0.0f;
        if (0.0f <= floatValue && floatValue <= 200.0f) {
            f = 1.0f - (floatValue / 200.0f);
        }
        c119894nB.setAlpha(f);
        if (100.0f <= floatValue && floatValue <= 300.0f && (underView = ((C119894nB) aUListenerS35S0201000_1.l0).getUnderView()) != null) {
            C119894nB c119894nB2 = (C119894nB) aUListenerS35S0201000_1.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS35S0201000_1.l1;
            int i = aUListenerS35S0201000_1.i2;
            float height = c119894nB2.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams2.topMargin = i - ((int) (height * ((floatValue - 100.0f) / 200.0f)));
            underView.setLayoutParams(marginLayoutParams2);
        }
    }

    public AUListenerS35S0201000_1(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
