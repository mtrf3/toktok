package Y;

import X.B8U;
import X.C264612c;
import X.C2A7;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.multihost.usercard.CoHostUserCardCell;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AUListenerS0S0200001_5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f2;
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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS0S0200001_5 aUListenerS0S0200001_5, ValueAnimator valueAnimator) {
        float abs = Math.abs(((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue() / aUListenerS0S0200001_5.f2);
        LivePlayFragment livePlayFragment = (LivePlayFragment) aUListenerS0S0200001_5.l0;
        if (livePlayFragment != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            livePlayFragment.qn(((Float) animatedValue).floatValue(), abs);
        }
        LivePlayFragment livePlayFragment2 = (LivePlayFragment) aUListenerS0S0200001_5.l1;
        if (livePlayFragment2 != null) {
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            livePlayFragment2.qn(((Float) animatedValue2).floatValue(), abs);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0200001_5 aUListenerS0S0200001_5, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        Float LJ = B8U.LJ((LivePlayFragment) aUListenerS0S0200001_5.l0);
        if (LJ != null) {
            float f = aUListenerS0S0200001_5.f2;
            LivePlayFragment livePlayFragment = (LivePlayFragment) aUListenerS0S0200001_5.l0;
            LivePlayFragment livePlayFragment2 = (LivePlayFragment) aUListenerS0S0200001_5.l1;
            float floatValue = LJ.floatValue();
            Object animatedValue = animation.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float abs = Math.abs((((Float) animatedValue).floatValue() - floatValue) / f);
            if (livePlayFragment != null) {
                Object animatedValue2 = animation.getAnimatedValue();
                o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                livePlayFragment.qn(((Float) animatedValue2).floatValue(), 1 - abs);
            }
            if (livePlayFragment2 != null) {
                Object animatedValue3 = animation.getAnimatedValue();
                o.LJII(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                livePlayFragment2.qn(((Float) animatedValue3).floatValue(), 1 - abs);
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS0S0200001_5 aUListenerS0S0200001_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (floatValue <= aUListenerS0S0200001_5.f2) {
            C2A7 LJIIJJI = ((CoHostUserCardCell) aUListenerS0S0200001_5.l0).LJIIJJI();
            float f = aUListenerS0S0200001_5.f2;
            LJIIJJI.setAlpha((f - floatValue) / (f - 1.0f));
        } else {
            ((CoHostUserCardCell) aUListenerS0S0200001_5.l0).LJIIJJI().setAlpha(1.0f);
        }
        ((LinearLayout.LayoutParams) aUListenerS0S0200001_5.l1).weight = 5.7f - floatValue;
        ((CoHostUserCardCell) aUListenerS0S0200001_5.l0).LJIIJJI().setLayoutParams((LinearLayout.LayoutParams) aUListenerS0S0200001_5.l1);
    }

    public static final void onAnimationUpdate$3(AUListenerS0S0200001_5 aUListenerS0S0200001_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (floatValue <= aUListenerS0S0200001_5.f2) {
            C2A7 LJIIJJI = ((CoHostUserCardCell) aUListenerS0S0200001_5.l0).LJIIJJI();
            float f = aUListenerS0S0200001_5.f2;
            LJIIJJI.setAlpha(1 - ((f - floatValue) / (f - 1.0f)));
        } else {
            ((CoHostUserCardCell) aUListenerS0S0200001_5.l0).LJIIJJI().setAlpha(1.0f);
        }
        ((LinearLayout.LayoutParams) aUListenerS0S0200001_5.l1).weight = floatValue;
        ((CoHostUserCardCell) aUListenerS0S0200001_5.l0).LJIIJJI().setLayoutParams((LinearLayout.LayoutParams) aUListenerS0S0200001_5.l1);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS0S0200001_5(float r2, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r3, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.f2 = r2
            r0.l1 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.f2 = r2
            r0.l0 = r3
            r0.l1 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS0S0200001_5.<init>(float, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment, int):void");
    }

    public AUListenerS0S0200001_5(float f, CoHostUserCardCell coHostUserCardCell, LinearLayout.LayoutParams layoutParams, int i) {
        this.$t = i;
        this.f2 = f;
        this.l0 = coHostUserCardCell;
        this.l1 = layoutParams;
    }
}
