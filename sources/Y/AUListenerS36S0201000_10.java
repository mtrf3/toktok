package Y;

import X.C264612c;
import X.C61779OMl;
import X.C61800ONg;
import X.OJV;
import X.OO3;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class AUListenerS36S0201000_10 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS36S0201000_10 aUListenerS36S0201000_10, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        if (intValue > 0) {
            ((View) aUListenerS36S0201000_10.l0).getLayoutParams().height = intValue;
            ((View) aUListenerS36S0201000_10.l0).requestLayout();
            if (C61779OMl.LJ(((C61800ONg) aUListenerS36S0201000_10.l1).LIZLLL)) {
                View view = ((C61800ONg) aUListenerS36S0201000_10.l1).LJIIL;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i = aUListenerS36S0201000_10.i2;
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i - intValue;
                    view.setLayoutParams(layoutParams);
                }
                OO3 oo3 = ((C61800ONg) aUListenerS36S0201000_10.l1).LJJI;
                if (oo3 != null) {
                    int i2 = aUListenerS36S0201000_10.i2 - intValue;
                    FrameLayout frameLayout = oo3.LJIL;
                    if (frameLayout == null) {
                        return;
                    }
                    frameLayout.setTranslationY(i2 - (oo3.LIZIZ + oo3.LIZJ));
                }
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS36S0201000_10 aUListenerS36S0201000_10, ValueAnimator valueAnimator) {
        View underView;
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        OJV ojv = (OJV) aUListenerS36S0201000_10.l0;
        float f = 0.0f;
        if (0.0f <= floatValue && floatValue <= 200.0f) {
            f = 1.0f - (floatValue / 200.0f);
        }
        ojv.setAlpha(f);
        if (100.0f <= floatValue && floatValue <= 300.0f && (underView = ((OJV) aUListenerS36S0201000_10.l0).getUnderView()) != null) {
            OJV ojv2 = (OJV) aUListenerS36S0201000_10.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS36S0201000_10.l1;
            int i = aUListenerS36S0201000_10.i2;
            float height = ojv2.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams2.topMargin = i - ((int) (height * ((floatValue - 100.0f) / 200.0f)));
            underView.setLayoutParams(marginLayoutParams2);
        }
    }

    public AUListenerS36S0201000_10(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
