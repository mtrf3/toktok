package Y;

import X.C152175y9;
import X.C80838Vo2;
import X.C82946Wgw;
import X.C82948Wgy;
import X.C83050Wic;
import X.C83093WjJ;
import X.C83101WjR;
import X.C83209WlB;
import X.C90193gN;
import X.InterfaceC82947Wgx;
import X.TKH;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AUListenerS74S0101000_14 implements ValueAnimator.AnimatorUpdateListener {
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

    public AUListenerS74S0101000_14(C80838Vo2 c80838Vo2, int i) {
        this.$t = i;
        this.l0 = c80838Vo2;
    }

    public static final void onAnimationUpdate$0(AUListenerS74S0101000_14 aUListenerS74S0101000_14, ValueAnimator valueAnimator) {
        ((C82946Wgw) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l1).LJLIL.LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_14.i1);
        ((C82946Wgw) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l1).LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_14.i1);
        ((InterfaceC82947Wgx) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l0).LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_14.i1);
    }

    public static final void onAnimationUpdate$1(AUListenerS74S0101000_14 aUListenerS74S0101000_14, ValueAnimator valueAnimator) {
        switch (aUListenerS74S0101000_14.i1) {
            case 0:
                ((I18nSettingNewVersionFragment) aUListenerS74S0101000_14.l0).lambda$setupHighlightAnimation$3(valueAnimator);
                return;
            default:
                View view = (View) aUListenerS74S0101000_14.l0;
                view.getClass();
                view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS74S0101000_14 aUListenerS74S0101000_14, ValueAnimator valueAnimator) {
        ((C83209WlB) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l1).LJLIL.LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_14.i1);
        ((C83209WlB) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l1).LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_14.i1);
        ((InterfaceC82947Wgx) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l0).LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_14.i1);
    }

    public static final void onAnimationUpdate$3(AUListenerS74S0101000_14 aUListenerS74S0101000_14, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        TKH tkh = ((C83050Wic) ((ARunnableS25S0300000_14) aUListenerS74S0101000_14.l0).l0).LJLIL;
        if (tkh != null) {
            tkh.LIZ(animatedFraction, 0, aUListenerS74S0101000_14.i1);
        }
        ((C83050Wic) ((ARunnableS25S0300000_14) aUListenerS74S0101000_14.l0).l0).LIZ(animatedFraction, 0, aUListenerS74S0101000_14.i1);
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) ((ARunnableS25S0300000_14) aUListenerS74S0101000_14.l0).l2;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LIZ(animatedFraction, 0, aUListenerS74S0101000_14.i1);
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS74S0101000_14 aUListenerS74S0101000_14, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        int i = aUListenerS74S0101000_14.i1;
        TKH tkh = ((C83093WjJ) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l0).LJLIL;
        if (tkh != null) {
            tkh.LIZ(animatedFraction, 0, i);
        }
        ((C83093WjJ) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l0).LJLJI.setTranslationY(((-i) * animatedFraction) + i);
        ((C83093WjJ) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l0).LJLJI.setAlpha(animatedFraction);
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l1;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LIZ(animatedFraction, 0, i);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS74S0101000_14 aUListenerS74S0101000_14, ValueAnimator valueAnimator) {
        ((C82948Wgy) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l1).LJLIL.LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_14.i1);
        ((C82948Wgy) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l1).LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_14.i1);
        ((InterfaceC82947Wgx) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l0).LIZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_14.i1);
    }

    public static final void onAnimationUpdate$6(AUListenerS74S0101000_14 aUListenerS74S0101000_14, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        int i = aUListenerS74S0101000_14.i1;
        TKH tkh = ((C83101WjR) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l0).LJLIL;
        if (tkh != null) {
            tkh.LIZ(animatedFraction, 0, i);
        }
        ((C83101WjR) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l0).LJLJJI.setTranslationY(((-i) * animatedFraction) + i);
        ((C83101WjR) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l0).LJLJJI.setAlpha(animatedFraction);
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) ((ARunnableS33S0200000_14) aUListenerS74S0101000_14.l0).l1;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LIZ(animatedFraction, 0, i);
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS74S0101000_14 aUListenerS74S0101000_14, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        PagerAdapter adapter = ((C80838Vo2) aUListenerS74S0101000_14.l0).LIZ.getAdapter();
        if (adapter != null && adapter.getCount() > 0) {
            Object animatedValue = animation.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            int i = intValue - aUListenerS74S0101000_14.i1;
            aUListenerS74S0101000_14.i1 = intValue;
            C152175y9 c152175y9 = ((C80838Vo2) aUListenerS74S0101000_14.l0).LIZ;
            if (c152175y9.LLILL) {
                if (C90193gN.LIZIZ(c152175y9.getContext())) {
                    ((C80838Vo2) aUListenerS74S0101000_14.l0).LIZ.LJIILIIL(i);
                } else {
                    ((C80838Vo2) aUListenerS74S0101000_14.l0).LIZ.LJIILIIL(-i);
                }
            }
        }
    }

    public AUListenerS74S0101000_14(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
