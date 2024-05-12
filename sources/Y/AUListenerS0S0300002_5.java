package Y;

import X.C264612c;
import X.C2A7;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.usercard.MultiGuestUserCardCell;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AUListenerS0S0300002_5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f3;
    public float f4;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onAnimationUpdate$0(AUListenerS0S0300002_5 aUListenerS0S0300002_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (floatValue <= aUListenerS0S0300002_5.f3) {
            C2A7 LJIIJJI = ((MultiGuestUserCardCell) aUListenerS0S0300002_5.l0).LJIIJJI();
            float f = aUListenerS0S0300002_5.f3;
            LJIIJJI.setAlpha((f - floatValue) / (f - 1.0f));
        } else {
            ((MultiGuestUserCardCell) aUListenerS0S0300002_5.l0).LJIIJJI().setAlpha(1.0f);
        }
        if (((MultiGuestUserCardCell) aUListenerS0S0300002_5.l0).LJIIL()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aUListenerS0S0300002_5.l1;
            layoutParams.weight = floatValue;
            C2A7 c2a7 = ((MultiGuestUserCardCell) aUListenerS0S0300002_5.l0).LJLJL;
            if (c2a7 != null) {
                c2a7.setLayoutParams(layoutParams);
            } else {
                o.LJIJI("linkmicButton");
                throw null;
            }
        }
        ((LinearLayout.LayoutParams) aUListenerS0S0300002_5.l2).weight = (1.0f + aUListenerS0S0300002_5.f4) - floatValue;
        ((MultiGuestUserCardCell) aUListenerS0S0300002_5.l0).LJIIJJI().setLayoutParams((LinearLayout.LayoutParams) aUListenerS0S0300002_5.l2);
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0300002_5 aUListenerS0S0300002_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (floatValue <= aUListenerS0S0300002_5.f3) {
            C2A7 LJIIJJI = ((MultiGuestUserCardCell) aUListenerS0S0300002_5.l0).LJIIJJI();
            float f = aUListenerS0S0300002_5.f3;
            LJIIJJI.setAlpha(1 - ((f - floatValue) / (f - 1.0f)));
        } else {
            ((MultiGuestUserCardCell) aUListenerS0S0300002_5.l0).LJIIJJI().setAlpha(1.0f);
        }
        if (((MultiGuestUserCardCell) aUListenerS0S0300002_5.l0).LJIIL()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aUListenerS0S0300002_5.l1;
            layoutParams.weight = (aUListenerS0S0300002_5.f4 + 1.0f) - floatValue;
            C2A7 c2a7 = ((MultiGuestUserCardCell) aUListenerS0S0300002_5.l0).LJLJL;
            if (c2a7 != null) {
                c2a7.setLayoutParams(layoutParams);
            } else {
                o.LJIJI("linkmicButton");
                throw null;
            }
        }
        ((LinearLayout.LayoutParams) aUListenerS0S0300002_5.l2).weight = floatValue;
        ((MultiGuestUserCardCell) aUListenerS0S0300002_5.l0).LJIIJJI().setLayoutParams((LinearLayout.LayoutParams) aUListenerS0S0300002_5.l2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS0S0300002_5(float r2, float r3, android.widget.LinearLayout.LayoutParams r4, android.widget.LinearLayout.LayoutParams r5, com.bytedance.android.live.liveinteract.multiguestv3.usercard.MultiGuestUserCardCell r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            switch(r7) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.f3 = r2
            r0.l0 = r6
            r0.l1 = r4
            r0.f4 = r3
            r0.l2 = r5
        L10:
            r0.<init>()
            return
        L14:
            r0 = r1
            r0.f3 = r2
            r0.l0 = r6
            r0.l1 = r4
            r0.l2 = r5
            r0.f4 = r3
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS0S0300002_5.<init>(float, float, android.widget.LinearLayout$LayoutParams, android.widget.LinearLayout$LayoutParams, com.bytedance.android.live.liveinteract.multiguestv3.usercard.MultiGuestUserCardCell, int):void");
    }
}
