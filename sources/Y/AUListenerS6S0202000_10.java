package Y;

import X.AbstractC59359NRj;
import X.C264612c;
import X.C59363NRn;
import X.C61779OMl;
import X.C61800ONg;
import X.OO3;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class AUListenerS6S0202000_10 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public int i3;
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

    public static final void onAnimationUpdate$0(AUListenerS6S0202000_10 aUListenerS6S0202000_10, ValueAnimator it) {
        Integer num;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int i = aUListenerS6S0202000_10.i2;
            AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aUListenerS6S0202000_10.l0;
            AbstractC59359NRj abstractC59359NRj2 = (AbstractC59359NRj) aUListenerS6S0202000_10.l1;
            int i2 = aUListenerS6S0202000_10.i3;
            int intValue = num.intValue();
            if (intValue <= i) {
                abstractC59359NRj.getClass();
                C59363NRn.LIZ(abstractC59359NRj, intValue - i);
            } else {
                abstractC59359NRj.getClass();
                C59363NRn.LIZ(abstractC59359NRj, 0);
                abstractC59359NRj2.getClass();
                C59363NRn.LIZIZ(abstractC59359NRj2, (intValue - i) + i2);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS6S0202000_10 aUListenerS6S0202000_10, ValueAnimator it) {
        Integer num;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int i = aUListenerS6S0202000_10.i2;
            AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aUListenerS6S0202000_10.l0;
            int i2 = aUListenerS6S0202000_10.i3;
            AbstractC59359NRj abstractC59359NRj2 = (AbstractC59359NRj) aUListenerS6S0202000_10.l1;
            int intValue = num.intValue();
            if (intValue <= i) {
                abstractC59359NRj.getClass();
                C59363NRn.LIZIZ(abstractC59359NRj, (i + i2) - intValue);
            } else {
                abstractC59359NRj.getClass();
                C59363NRn.LIZIZ(abstractC59359NRj, i2);
                abstractC59359NRj2.getClass();
                C59363NRn.LIZ(abstractC59359NRj2, i - intValue);
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS6S0202000_10 aUListenerS6S0202000_10, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        if (intValue > 0) {
            ((View) aUListenerS6S0202000_10.l0).getLayoutParams().height = intValue;
            ((View) aUListenerS6S0202000_10.l0).requestLayout();
            if (C61779OMl.LJ(((C61800ONg) aUListenerS6S0202000_10.l1).LIZLLL)) {
                View view = ((C61800ONg) aUListenerS6S0202000_10.l1).LJIIL;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i = aUListenerS6S0202000_10.i2;
                    int i2 = aUListenerS6S0202000_10.i3;
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (i - i2) - intValue;
                    view.setLayoutParams(layoutParams);
                }
                OO3 oo3 = ((C61800ONg) aUListenerS6S0202000_10.l1).LJJI;
                if (oo3 != null) {
                    int i3 = (aUListenerS6S0202000_10.i2 - aUListenerS6S0202000_10.i3) - intValue;
                    FrameLayout frameLayout = oo3.LJIL;
                    if (frameLayout == null) {
                        return;
                    }
                    frameLayout.setTranslationY(i3 - (oo3.LIZIZ + oo3.LIZJ));
                }
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS6S0202000_10(int r2, int r3, X.AbstractC59359NRj r4, X.AbstractC59359NRj r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.i2 = r2
            r0.l0 = r4
            r0.i3 = r3
            r0.l1 = r5
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.i2 = r2
            r0.l0 = r4
            r0.l1 = r5
            r0.i3 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS6S0202000_10.<init>(int, int, X.NRj, X.NRj, int):void");
    }

    public AUListenerS6S0202000_10(View view, C61800ONg c61800ONg, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = view;
        this.l1 = c61800ONg;
        this.i2 = i;
        this.i3 = i2;
    }
}
