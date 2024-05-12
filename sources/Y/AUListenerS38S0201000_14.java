package Y;

import X.C82946Wgw;
import X.C82948Wgy;
import X.C82949Wgz;
import X.C83050Wic;
import X.C83093WjJ;
import X.C83101WjR;
import X.C83209WlB;
import X.InterfaceC82947Wgx;
import X.TKH;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AUListenerS38S0201000_14 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS38S0201000_14 aUListenerS38S0201000_14, ValueAnimator valueAnimator) {
        ((C82946Wgw) aUListenerS38S0201000_14.l1).LJLIL.LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
        ((C82946Wgw) aUListenerS38S0201000_14.l1).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
        ((InterfaceC82947Wgx) aUListenerS38S0201000_14.l0).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
    }

    public static final void onAnimationUpdate$1(AUListenerS38S0201000_14 aUListenerS38S0201000_14, ValueAnimator valueAnimator) {
        ((C83209WlB) aUListenerS38S0201000_14.l1).LJLIL.LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
        ((C83209WlB) aUListenerS38S0201000_14.l1).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
        ((InterfaceC82947Wgx) aUListenerS38S0201000_14.l0).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
    }

    public static final void onAnimationUpdate$2(AUListenerS38S0201000_14 aUListenerS38S0201000_14, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        TKH tkh = ((C83050Wic) aUListenerS38S0201000_14.l0).LJLIL;
        if (tkh != null) {
            tkh.LJIIIIZZ(animatedFraction, 0, aUListenerS38S0201000_14.i2);
        }
        ((C83050Wic) aUListenerS38S0201000_14.l0).LJIIIIZZ(animatedFraction, 0, aUListenerS38S0201000_14.i2);
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) aUListenerS38S0201000_14.l1;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LJIIIIZZ(animatedFraction, 0, aUListenerS38S0201000_14.i2);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS38S0201000_14 aUListenerS38S0201000_14, ValueAnimator valueAnimator) {
        ((C82949Wgz) aUListenerS38S0201000_14.l1).LJLIL.LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
        ((C82949Wgz) aUListenerS38S0201000_14.l1).LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
        ((InterfaceC82947Wgx) aUListenerS38S0201000_14.l0).LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
    }

    public static final void onAnimationUpdate$4(AUListenerS38S0201000_14 aUListenerS38S0201000_14, ValueAnimator valueAnimator) {
        ((C82949Wgz) aUListenerS38S0201000_14.l1).LJLIL.LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
        ((C82949Wgz) aUListenerS38S0201000_14.l1).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
        ((InterfaceC82947Wgx) aUListenerS38S0201000_14.l0).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
    }

    public static final void onAnimationUpdate$5(AUListenerS38S0201000_14 aUListenerS38S0201000_14, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        int i = aUListenerS38S0201000_14.i2;
        TKH tkh = ((C83093WjJ) aUListenerS38S0201000_14.l0).LJLIL;
        if (tkh != null) {
            tkh.LJIIIIZZ(animatedFraction, 0, i);
        }
        ((C83093WjJ) aUListenerS38S0201000_14.l0).LJLJI.setTranslationY(i * animatedFraction);
        ((C83093WjJ) aUListenerS38S0201000_14.l0).LJLJI.setAlpha(1 - animatedFraction);
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) aUListenerS38S0201000_14.l1;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LJIIIIZZ(animatedFraction, 0, i);
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS38S0201000_14 aUListenerS38S0201000_14, ValueAnimator valueAnimator) {
        ((C82948Wgy) aUListenerS38S0201000_14.l1).LJLIL.LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
        ((C82948Wgy) aUListenerS38S0201000_14.l1).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
        ((InterfaceC82947Wgx) aUListenerS38S0201000_14.l0).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS38S0201000_14.i2);
    }

    public static final void onAnimationUpdate$7(AUListenerS38S0201000_14 aUListenerS38S0201000_14, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        int i = aUListenerS38S0201000_14.i2;
        TKH tkh = ((C83101WjR) aUListenerS38S0201000_14.l0).LJLIL;
        if (tkh != null) {
            tkh.LJIIIIZZ(animatedFraction, 0, i);
        }
        ((C83101WjR) aUListenerS38S0201000_14.l0).LJLJJI.setTranslationY(i * animatedFraction);
        ((C83101WjR) aUListenerS38S0201000_14.l0).LJLJJI.setAlpha(1 - animatedFraction);
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) aUListenerS38S0201000_14.l1;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LJIIIIZZ(animatedFraction, 0, i);
        }
    }

    public AUListenerS38S0201000_14(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i2 = i;
        this.l0 = obj2;
    }
}
