package Y;

import X.C25738A8g;
import X.C72190SUw;
import X.O6R;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AUListenerS1S0103000_4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
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

    public static final void onAnimationUpdate$0(AUListenerS1S0103000_4 aUListenerS1S0103000_4, ValueAnimator it) {
        Float f;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            TuxTextView tuxTextView = ((C72190SUw) aUListenerS1S0103000_4.l0).LJLJJLL;
            if (tuxTextView == null || (layoutParams = tuxTextView.getLayoutParams()) == null) {
                return;
            }
            int i = aUListenerS1S0103000_4.i1;
            int i2 = aUListenerS1S0103000_4.i2;
            if (i > i2) {
                layoutParams.width = O6R.LJJIIZ((i - i2) * floatValue) + i2;
            }
            layoutParams.height = O6R.LJJIIZ(aUListenerS1S0103000_4.i3 * floatValue);
            TuxTextView tuxTextView2 = ((C72190SUw) aUListenerS1S0103000_4.l0).LJLJJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.requestLayout();
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS1S0103000_4 aUListenerS1S0103000_4, ValueAnimator it) {
        Float f;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            TuxTextView tuxTextView = ((C25738A8g) aUListenerS1S0103000_4.l0).LJLJJLL;
            if (tuxTextView == null || (layoutParams = tuxTextView.getLayoutParams()) == null) {
                return;
            }
            int i = aUListenerS1S0103000_4.i1;
            int i2 = aUListenerS1S0103000_4.i2;
            if (i > i2) {
                layoutParams.width = O6R.LJJIIZ((i - i2) * floatValue) + i2;
            }
            layoutParams.height = O6R.LJJIIZ(aUListenerS1S0103000_4.i3 * floatValue);
            TuxTextView tuxTextView2 = ((C25738A8g) aUListenerS1S0103000_4.l0).LJLJJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.requestLayout();
            }
        }
    }

    public AUListenerS1S0103000_4(Object obj, int i, int i2, int i3, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
    }
}
