package Y;

import X.AbstractC80957Vpx;
import X.AbstractViewOnTouchListenerC82865Wfd;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.Rect;

/* loaded from: classes15.dex */
public class AUListenerS40S0110000_14 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final void onAnimationUpdate$0(AUListenerS40S0110000_14 aUListenerS40S0110000_14, ValueAnimator valueAnimator) {
        AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd = (AbstractViewOnTouchListenerC82865Wfd) aUListenerS40S0110000_14.l0;
        boolean z = aUListenerS40S0110000_14.z1;
        abstractViewOnTouchListenerC82865Wfd.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z) {
            abstractViewOnTouchListenerC82865Wfd.LJIJ(floatValue);
        } else {
            abstractViewOnTouchListenerC82865Wfd.LJIIZILJ(floatValue);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS40S0110000_14 aUListenerS40S0110000_14, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AbstractC80957Vpx abstractC80957Vpx = (AbstractC80957Vpx) aUListenerS40S0110000_14.l0;
        if (aUListenerS40S0110000_14.z1) {
            floatValue = 1.0f - floatValue;
        }
        if (abstractC80957Vpx.LJLJL == null || abstractC80957Vpx.LJLJLJ == null || abstractC80957Vpx.LJLL.isEmpty()) {
            return;
        }
        Rect evaluate = abstractC80957Vpx.LJLLI.evaluate(floatValue, abstractC80957Vpx.LJLJL, abstractC80957Vpx.LJLL);
        Rect evaluate2 = abstractC80957Vpx.LJLLILLLL.evaluate(floatValue, abstractC80957Vpx.LJLJLJ, abstractC80957Vpx.LJLL);
        float f = (1.0f - floatValue) * abstractC80957Vpx.LJLJLLL;
        if (evaluate.equals(abstractC80957Vpx.LJLL) && evaluate2.equals(abstractC80957Vpx.LJLL) && f == 0.0f) {
            abstractC80957Vpx.LJLJJI = false;
            abstractC80957Vpx.LJLJJL = false;
            abstractC80957Vpx.LJLJJLL = false;
            return;
        }
        abstractC80957Vpx.LJLIL.set(evaluate);
        if (f > 0.0f) {
            abstractC80957Vpx.LJLILLLLZI.rewind();
            abstractC80957Vpx.LJLILLLLZI.addRoundRect(abstractC80957Vpx.LJLIL, f, f, Path.Direction.CCW);
            abstractC80957Vpx.LJLJJL = true;
        } else {
            abstractC80957Vpx.LJLJJI = true;
        }
        abstractC80957Vpx.LJLJI.set(evaluate2);
        abstractC80957Vpx.LJLJJLL = true ^ abstractC80957Vpx.LJLJI.equals(abstractC80957Vpx.LJLIL);
        abstractC80957Vpx.invalidate();
    }

    public AUListenerS40S0110000_14(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
