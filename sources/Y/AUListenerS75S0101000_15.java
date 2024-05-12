package Y;

import X.C264612c;
import X.YBU;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AUListenerS75S0101000_15 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
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

    public static final void onAnimationUpdate$0(AUListenerS75S0101000_15 aUListenerS75S0101000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((View) aUListenerS75S0101000_15.l0).setTranslationY((1 - it.getAnimatedFraction()) * aUListenerS75S0101000_15.i1);
    }

    public static final void onAnimationUpdate$1(AUListenerS75S0101000_15 aUListenerS75S0101000_15, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        int i = aUListenerS75S0101000_15.i1;
        if (i == 1) {
            YBU ybu = (YBU) aUListenerS75S0101000_15.l0;
            ybu.LLIIII = true;
            ybu.getTextLeftPaint().setTextSize(((YBU) aUListenerS75S0101000_15.l0).LJZ * floatValue);
            YBU ybu2 = (YBU) aUListenerS75S0101000_15.l0;
            ybu2.setLeftBitmap(YBU.LIZ(ybu2.getLeftBitmap(), ((YBU) aUListenerS75S0101000_15.l0).getBitmapWidth() * floatValue, ((YBU) aUListenerS75S0101000_15.l0).getBitmapHeight() * floatValue));
        } else if (i == 2) {
            YBU ybu3 = (YBU) aUListenerS75S0101000_15.l0;
            ybu3.LLIIII = true;
            ybu3.getTextRightPaint().setTextSize(((YBU) aUListenerS75S0101000_15.l0).LJZ * floatValue);
            YBU ybu4 = (YBU) aUListenerS75S0101000_15.l0;
            ybu4.setRightBitmap(YBU.LIZ(ybu4.getRightBitmap(), ((YBU) aUListenerS75S0101000_15.l0).getBitmapWidth() * floatValue, ((YBU) aUListenerS75S0101000_15.l0).getBitmapHeight() * floatValue));
        }
        ((YBU) aUListenerS75S0101000_15.l0).postInvalidate();
    }

    public AUListenerS75S0101000_15(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
