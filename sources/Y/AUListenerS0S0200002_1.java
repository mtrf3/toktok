package Y;

import X.C264612c;
import X.C34K;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* loaded from: classes2.dex */
public class AUListenerS0S0200002_1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f2;
    public float f3;
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

    public static final void onAnimationUpdate$0(AUListenerS0S0200002_1 aUListenerS0S0200002_1, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (aUListenerS0S0200002_1.f2 > aUListenerS0S0200002_1.f3) {
            if (floatValue < 0.2d) {
                ((ImageView) aUListenerS0S0200002_1.l0).setAlpha(0.2f);
                ((ImageView) aUListenerS0S0200002_1.l0).setBackground((Drawable) aUListenerS0S0200002_1.l1);
                return;
            } else {
                ((ImageView) aUListenerS0S0200002_1.l0).setAlpha(floatValue);
                return;
            }
        }
        ((ImageView) aUListenerS0S0200002_1.l0).setAlpha(floatValue);
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0200002_1 aUListenerS0S0200002_1, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        if (600 <= intValue) {
            if (intValue < 1091) {
                ((TuxTextView) aUListenerS0S0200002_1.l0).setText("3");
                ((C34K) aUListenerS0S0200002_1.l1).element = true;
                ((TuxTextView) aUListenerS0S0200002_1.l0).setAlpha((intValue - 600) / aUListenerS0S0200002_1.f2);
                return;
            }
            if (intValue < 1581) {
                ((C34K) aUListenerS0S0200002_1.l1).element = false;
                ((TuxTextView) aUListenerS0S0200002_1.l0).setAlpha(aUListenerS0S0200002_1.f3 - ((intValue - 1090) / aUListenerS0S0200002_1.f2));
                return;
            }
            if (1980 > intValue) {
                return;
            }
            if (intValue < 2471) {
                if (!((C34K) aUListenerS0S0200002_1.l1).element) {
                    ((TuxTextView) aUListenerS0S0200002_1.l0).setText("2");
                    ((C34K) aUListenerS0S0200002_1.l1).element = true;
                }
                ((TuxTextView) aUListenerS0S0200002_1.l0).setAlpha((intValue - 1980) / aUListenerS0S0200002_1.f2);
                return;
            }
            if (intValue < 2961) {
                ((C34K) aUListenerS0S0200002_1.l1).element = false;
                ((TuxTextView) aUListenerS0S0200002_1.l0).setAlpha(aUListenerS0S0200002_1.f3 - ((intValue - 2470) / aUListenerS0S0200002_1.f2));
                return;
            }
            if (3360 > intValue) {
                return;
            }
            if (intValue < 3851) {
                if (!((C34K) aUListenerS0S0200002_1.l1).element) {
                    ((TuxTextView) aUListenerS0S0200002_1.l0).setText("1");
                    ((C34K) aUListenerS0S0200002_1.l1).element = true;
                }
                ((TuxTextView) aUListenerS0S0200002_1.l0).setAlpha((intValue - 3360) / aUListenerS0S0200002_1.f2);
                return;
            }
            if (intValue >= 4341) {
                return;
            }
            ((TuxTextView) aUListenerS0S0200002_1.l0).setAlpha(aUListenerS0S0200002_1.f3 - ((intValue - 3850) / aUListenerS0S0200002_1.f2));
        }
    }

    public AUListenerS0S0200002_1(float f, TuxIconView tuxIconView, Drawable drawable, int i) {
        this.$t = i;
        this.f2 = 1.0f;
        this.f3 = f;
        this.l0 = tuxIconView;
        this.l1 = drawable;
    }

    public AUListenerS0S0200002_1(TuxTextView tuxTextView, C34K c34k, float f, float f2, int i) {
        this.$t = i;
        this.l0 = tuxTextView;
        this.l1 = c34k;
        this.f2 = f;
        this.f3 = f2;
    }
}
