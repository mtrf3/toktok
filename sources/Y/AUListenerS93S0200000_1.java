package Y;

import X.C264612c;
import X.C34K;
import X.C72242sW;
import X.C76732zl;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AUListenerS93S0200000_1 implements ValueAnimator.AnimatorUpdateListener {
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
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS93S0200000_1 aUListenerS93S0200000_1, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View findViewById = ((View) aUListenerS93S0200000_1.l0).findViewById(R.id.ic5);
        if (findViewById == null) {
            return;
        }
        findViewById.setTranslationY(floatValue + ((int[]) aUListenerS93S0200000_1.l1)[1]);
    }

    public static final void onAnimationUpdate$1(AUListenerS93S0200000_1 aUListenerS93S0200000_1, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        View view = (View) aUListenerS93S0200000_1.l0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            view.setLayoutParams(layoutParams);
            View view2 = (View) aUListenerS93S0200000_1.l0;
            view2.setPadding(view2.getPaddingLeft(), (int) (it.getAnimatedFraction() * ((Number) ((BaseQuickChatRoomFragment) aUListenerS93S0200000_1.l1).LJLLJ.getValue()).intValue()), view2.getPaddingRight(), view2.getPaddingBottom());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationUpdate$2(AUListenerS93S0200000_1 aUListenerS93S0200000_1, ValueAnimator animation) {
        Integer num;
        o.LJIIIZ(animation, "animation");
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aUListenerS93S0200000_1.l0;
        if (layoutParams != null) {
            Object animatedValue = animation.getAnimatedValue();
            if (!(animatedValue instanceof Integer) || (num = (Integer) animatedValue) == null) {
                num = 0;
            }
            layoutParams.height = num.intValue();
        }
        ViewGroup viewGroup = (ViewGroup) aUListenerS93S0200000_1.l1;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setLayoutParams((ViewGroup.LayoutParams) aUListenerS93S0200000_1.l0);
    }

    public static final void onAnimationUpdate$3(AUListenerS93S0200000_1 aUListenerS93S0200000_1, ValueAnimator it) {
        Integer num;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int intValue = num.intValue();
            View view = (View) aUListenerS93S0200000_1.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS93S0200000_1.l1;
            marginLayoutParams.setMarginStart(intValue);
            view.setLayoutParams(marginLayoutParams);
            ((View) aUListenerS93S0200000_1.l0).requestLayout();
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS93S0200000_1 aUListenerS93S0200000_1, ValueAnimator it) {
        Integer num;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int intValue = num.intValue();
            View view = (View) aUListenerS93S0200000_1.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS93S0200000_1.l1;
            marginLayoutParams.topMargin = intValue;
            view.setLayoutParams(marginLayoutParams);
            ((View) aUListenerS93S0200000_1.l0).requestLayout();
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS93S0200000_1 aUListenerS93S0200000_1, ValueAnimator valueAnimator) {
        boolean z;
        boolean z2;
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        if (intValue >= 0) {
            if (intValue < 251) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ((TuxTextView) aUListenerS93S0200000_1.l0).setAlpha(intValue / LiveCoverMinSizeSetting.DEFAULT);
                return;
            }
            if (750 > intValue) {
                return;
            }
            if (intValue < 1001) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ((TuxTextView) aUListenerS93S0200000_1.l0).setAlpha(1.0f - ((intValue - 750) / LiveCoverMinSizeSetting.DEFAULT));
                return;
            }
            if (1001 > intValue) {
                return;
            }
            if (intValue < 1251) {
                if (!((C34K) aUListenerS93S0200000_1.l1).element) {
                    ((TuxTextView) aUListenerS93S0200000_1.l0).setText("1");
                    ((C34K) aUListenerS93S0200000_1.l1).element = true;
                }
                ((TuxTextView) aUListenerS93S0200000_1.l0).setAlpha((intValue - 1000) / LiveCoverMinSizeSetting.DEFAULT);
                return;
            }
            if (1750 > intValue || intValue >= 2001) {
                return;
            }
            ((TuxTextView) aUListenerS93S0200000_1.l0).setAlpha(1.0f - ((intValue - 1750) / LiveCoverMinSizeSetting.DEFAULT));
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS93S0200000_1 aUListenerS93S0200000_1, ValueAnimator it) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS93S0200000_1.l0;
        if (marginLayoutParams != null) {
            o.LJIIIIZZ(it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (!(animatedValue instanceof Integer)) {
                animatedValue = null;
            }
            marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
        }
        ((View) aUListenerS93S0200000_1.l1).setLayoutParams((ViewGroup.MarginLayoutParams) aUListenerS93S0200000_1.l0);
    }

    public static final void onAnimationUpdate$7(AUListenerS93S0200000_1 aUListenerS93S0200000_1, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (it.getAnimatedFraction() <= 0) {
            ((C72242sW) aUListenerS93S0200000_1.l0).element = System.nanoTime();
            ((C76732zl) aUListenerS93S0200000_1.l1).element = 1;
        } else {
            ((C76732zl) aUListenerS93S0200000_1.l1).element++;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS93S0200000_1(android.view.View r2, android.view.ViewGroup.MarginLayoutParams r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 3: goto Le;
                case 4: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS93S0200000_1.<init>(android.view.View, android.view.ViewGroup$MarginLayoutParams, int):void");
    }

    public AUListenerS93S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
