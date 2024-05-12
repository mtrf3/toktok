package Y;

import X.C03970Dp;
import X.C04020Du;
import X.C04740Go;
import X.C05960Lg;
import X.C0B6;
import X.C0KV;
import X.C12U;
import X.C141335gf;
import X.C15380j0;
import X.C1H0;
import X.C264612c;
import X.C278217i;
import X.C29701Eo;
import X.C2A7;
import X.C2H2;
import X.C30011Ft;
import X.C30031Fv;
import X.C30061Fy;
import X.C32151Nz;
import X.C37811e5;
import X.C3C5;
import X.C45101pq;
import X.C47061t0;
import X.C515620q;
import X.C55792Gx;
import X.C76800UCe;
import X.C87277YNd;
import X.InterfaceC005200i;
import X.InterfaceC88472Yns;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.WeakReference;
import java.util.Random;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDUListenerS263S0100000 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
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
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                return;
            case 9:
                onAnimationUpdate$9(this, valueAnimator);
                return;
            case 10:
                onAnimationUpdate$10(this, valueAnimator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                return;
            case 12:
                onAnimationUpdate$12(this, valueAnimator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                return;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                return;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationUpdate$16(this, valueAnimator);
                return;
            case 17:
                onAnimationUpdate$17(this, valueAnimator);
                return;
            case 18:
                onAnimationUpdate$18(this, valueAnimator);
                return;
            case 19:
                onAnimationUpdate$19(this, valueAnimator);
                return;
            case 20:
                onAnimationUpdate$20(this, valueAnimator);
                return;
            case 21:
                onAnimationUpdate$21(this, valueAnimator);
                return;
            case 22:
                onAnimationUpdate$22(this, valueAnimator);
                return;
            case 23:
                onAnimationUpdate$23(this, valueAnimator);
                return;
            case 24:
                onAnimationUpdate$24(this, valueAnimator);
                return;
            case 25:
                onAnimationUpdate$25(this, valueAnimator);
                return;
            case 26:
                onAnimationUpdate$26(this, valueAnimator);
                return;
            case 27:
                onAnimationUpdate$27(this, valueAnimator);
                return;
            case 28:
                onAnimationUpdate$28(this, valueAnimator);
                return;
            case 29:
                onAnimationUpdate$29(this, valueAnimator);
                return;
            case 30:
                onAnimationUpdate$30(this, valueAnimator);
                return;
            case 31:
                onAnimationUpdate$31(this, valueAnimator);
                return;
            case 32:
                onAnimationUpdate$32(this, valueAnimator);
                return;
            case 33:
                onAnimationUpdate$33(this, valueAnimator);
                return;
            case 34:
                onAnimationUpdate$34(this, valueAnimator);
                return;
            case 35:
                onAnimationUpdate$35(this, valueAnimator);
                return;
            case 36:
                onAnimationUpdate$36(this, valueAnimator);
                return;
            case 37:
                onAnimationUpdate$37(this, valueAnimator);
                return;
            case 38:
                onAnimationUpdate$38(this, valueAnimator);
                return;
            case 39:
                onAnimationUpdate$39(this, valueAnimator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onAnimationUpdate$40(this, valueAnimator);
                return;
            case 41:
                onAnimationUpdate$41(this, valueAnimator);
                return;
            case 42:
                onAnimationUpdate$42(this, valueAnimator);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onAnimationUpdate$43(this, valueAnimator);
                return;
            case 44:
                onAnimationUpdate$44(this, valueAnimator);
                return;
            case 45:
                onAnimationUpdate$45(this, valueAnimator);
                return;
            case 46:
                onAnimationUpdate$46(this, valueAnimator);
                return;
            case 47:
                onAnimationUpdate$47(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public IDUListenerS263S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("x")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("y")).intValue();
        ((C278217i) iDUListenerS263S0100000.l0).LIZ.LLLLZLLIL(intValue, intValue2);
        InterfaceC005200i interfaceC005200i = ((C278217i) iDUListenerS263S0100000.l0).LIZIZ.LJIILIIL;
        if (interfaceC005200i != null) {
            interfaceC005200i.LJ(intValue, intValue2);
        }
    }

    public static final void onAnimationUpdate$1(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((C278217i) iDUListenerS263S0100000.l0).LIZ.LJJ(intValue);
        C278217i c278217i = (C278217i) iDUListenerS263S0100000.l0;
        InterfaceC005200i interfaceC005200i = c278217i.LIZIZ.LJIILIIL;
        if (interfaceC005200i != null) {
            interfaceC005200i.LJ(intValue, c278217i.LIZ.LJLJJLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onAnimationUpdate$10(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        InterfaceC88472Yns<Float, C76800UCe> onScrollListener = ((C30061Fy) iDUListenerS263S0100000.l0).getOnScrollListener();
        if (onScrollListener != 0) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            onScrollListener.invoke(animatedValue);
        }
    }

    public static final void onAnimationUpdate$11(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        ((C0KV) iDUListenerS263S0100000.l0).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    public static final void onAnimationUpdate$12(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        float f;
        Float f2;
        o.LJIIIZ(it, "it");
        C47061t0 coverView = ((C1H0) iDUListenerS263S0100000.l0).getCoverView();
        if (coverView == null) {
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        coverView.setRotation(f);
    }

    public static final void onAnimationUpdate$13(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        int i;
        Integer num;
        o.LJIIIZ(it, "it");
        ViewGroup.LayoutParams layoutParams = ((C05960Lg) iDUListenerS263S0100000.l0).getLayoutParams();
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        layoutParams.width = i;
        ((C05960Lg) iDUListenerS263S0100000.l0).requestLayout();
    }

    public static final void onAnimationUpdate$14(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        int i;
        Integer num;
        o.LJIIIZ(it, "it");
        ViewGroup.LayoutParams layoutParams = ((C05960Lg) iDUListenerS263S0100000.l0).getLayoutParams();
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        layoutParams.width = i;
        ((C05960Lg) iDUListenerS263S0100000.l0).requestLayout();
    }

    public static final void onAnimationUpdate$15(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.translationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$16(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$17(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.translationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$18(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$19(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$2(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        ((C0B6) iDUListenerS263S0100000.l0).LJLLJ = valueAnimator.getAnimatedFraction();
    }

    public static final void onAnimationUpdate$20(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$21(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$22(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$23(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        constraintProperty.margin(4, ((Integer) animatedValue).intValue());
        constraintProperty.apply();
    }

    public static final void onAnimationUpdate$24(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$25(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ConstraintProperty LIZIZ = ((C515620q) iDUListenerS263S0100000.l0).LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.alpha(floatValue);
        }
    }

    public static final void onAnimationUpdate$26(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ConstraintProperty LIZIZ = ((C515620q) iDUListenerS263S0100000.l0).LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.alpha(floatValue);
        }
    }

    public static final void onAnimationUpdate$27(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.translationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$28(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.translationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$29(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        ConstraintProperty constraintProperty = (ConstraintProperty) iDUListenerS263S0100000.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.alpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$3(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        WeakReference<C29701Eo> weakReference;
        C04740Go c04740Go = (C04740Go) iDUListenerS263S0100000.l0;
        if (c04740Go.LJLLL != null) {
            if (C04020Du.LIZ) {
                if (C04020Du.LIZJ == null) {
                    C04020Du.LIZJ = new Random();
                }
                if (C04020Du.LIZJ.nextFloat() < 0.01d && (weakReference = c04740Go.LLFF) != null) {
                    weakReference.get();
                }
            }
            if (C03970Dp.LIZ && ((C04740Go) iDUListenerS263S0100000.l0).LIZLLL()) {
                C04740Go c04740Go2 = (C04740Go) iDUListenerS263S0100000.l0;
                c04740Go2.LJZI.LIZ(c04740Go2.LJLJI);
                return;
            }
            C04740Go c04740Go3 = (C04740Go) iDUListenerS263S0100000.l0;
            if (c04740Go3.LLF) {
                synchronized (c04740Go3.LLD) {
                    C04740Go c04740Go4 = (C04740Go) iDUListenerS263S0100000.l0;
                    c04740Go4.LJLLL.LJIIZILJ(c04740Go4.LJLJI.LIZIZ());
                }
                return;
            }
            c04740Go3.LJLLL.LJIIZILJ(c04740Go3.LJLJI.LIZIZ());
        }
    }

    public static final void onAnimationUpdate$30(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        InterfaceC88472Yns<Float, C76800UCe> onScrollListener = ((C30061Fy) iDUListenerS263S0100000.l0).getOnScrollListener();
        if (onScrollListener != null) {
            onScrollListener.invoke(Float.valueOf(((C30061Fy) iDUListenerS263S0100000.l0).getTranslationX()));
        }
    }

    public static final void onAnimationUpdate$31(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        InterfaceC88472Yns<Float, C76800UCe> onScrollListener = ((C30061Fy) iDUListenerS263S0100000.l0).getOnScrollListener();
        if (onScrollListener != null) {
            onScrollListener.invoke(Float.valueOf(((C30061Fy) iDUListenerS263S0100000.l0).getTranslationX()));
        }
    }

    public static final void onAnimationUpdate$32(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        ((C2A7) iDUListenerS263S0100000.l0).invalidate();
    }

    public static final void onAnimationUpdate$33(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        if (((C12U) iDUListenerS263S0100000.l0).LJIILJJIL() == null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            C12U c12u = (C12U) iDUListenerS263S0100000.l0;
            C45101pq c45101pq = c12u.LJ.LIZ;
            int LJIIJJI = C87277YNd.LJIIJJI(c12u.LJIIL.getSmallHeight());
            WindowManager.LayoutParams layoutParams = c45101pq.LJLJI;
            layoutParams.width = intValue;
            layoutParams.height = LJIIJJI;
            c45101pq.LLLLZLLLI();
        }
    }

    public static final void onAnimationUpdate$34(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        ((C12U) iDUListenerS263S0100000.l0).LJIIL.setAlpha(((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static final void onAnimationUpdate$35(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C12U) iDUListenerS263S0100000.l0).LJIIJ.setScaleX(floatValue);
        ((C12U) iDUListenerS263S0100000.l0).LJIIJ.setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$36(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        ((C12U) iDUListenerS263S0100000.l0).LJIIJJI.setAlpha(((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static final void onAnimationUpdate$37(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C12U) iDUListenerS263S0100000.l0).LJIIJ.setScaleX(floatValue);
        ((C12U) iDUListenerS263S0100000.l0).LJIIJ.setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$38(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        Object LIZ;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        C55792Gx c55792Gx = (C55792Gx) iDUListenerS263S0100000.l0;
        try {
            View view = c55792Gx.LJLJJI;
            if (view != null) {
                view.setAlpha((c55792Gx.LLIIIJ * valueAnimator.getAnimatedFraction()) + c55792Gx.LLIIIILZ);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C55792Gx c55792Gx2 = (C55792Gx) iDUListenerS263S0100000.l0;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            c55792Gx2.LLLZI(m10exceptionOrNullimpl);
        }
    }

    public static final void onAnimationUpdate$39(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        ((C12U) iDUListenerS263S0100000.l0).LJIIJJI.setAlpha(((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static final void onAnimationUpdate$4(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        float LJIIZILJ;
        int height;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        C30011Ft c30011Ft = (C30011Ft) iDUListenerS263S0100000.l0;
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ConstraintLayout contentView = c30011Ft.getContentView();
            if (contentView != null) {
                contentView.setScaleX(floatValue);
            }
            ConstraintLayout contentView2 = c30011Ft.getContentView();
            if (contentView2 != null) {
                contentView2.setScaleY(floatValue);
            }
            ConstraintLayout contentView3 = c30011Ft.getContentView();
            float f = 0.0f;
            if (contentView3 != null) {
                if (c30011Ft.LJLJL) {
                    LJIIZILJ = 0.0f;
                } else {
                    LJIIZILJ = C32151Nz.LJIIZILJ(215);
                }
                contentView3.setPivotX(LJIIZILJ);
            }
            ConstraintLayout contentView4 = c30011Ft.getContentView();
            if (contentView4 != null) {
                if (!c30011Ft.LJLJLJ) {
                    ConstraintLayout contentView5 = c30011Ft.getContentView();
                    if (contentView5 != null) {
                        height = contentView5.getMeasuredHeight();
                    } else {
                        height = c30011Ft.getHeight();
                    }
                    f = height;
                }
                contentView4.setPivotY(f);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void onAnimationUpdate$40(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        if (((C12U) iDUListenerS263S0100000.l0).LJIILJJIL() == null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            C12U c12u = (C12U) iDUListenerS263S0100000.l0;
            C45101pq c45101pq = c12u.LJ.LIZ;
            int LJIIJJI = C87277YNd.LJIIJJI(c12u.LJIIL.getSmallHeight());
            WindowManager.LayoutParams layoutParams = c45101pq.LJLJI;
            layoutParams.width = intValue;
            layoutParams.height = LJIIJJI;
            c45101pq.LLLLZLLLI();
        }
    }

    public static final void onAnimationUpdate$41(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        Object LIZ;
        float f;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        C55792Gx c55792Gx = (C55792Gx) iDUListenerS263S0100000.l0;
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = c55792Gx.LJLJJI;
            if (view != null) {
                view.setScaleX(floatValue);
            }
            View view2 = c55792Gx.LJLJJI;
            if (view2 != null) {
                view2.setScaleY(floatValue);
            }
            View view3 = c55792Gx.LJLJJI;
            float f2 = 0.0f;
            if (view3 != null) {
                if (c55792Gx.LJLLLLLL) {
                    f = 0.0f;
                } else {
                    f = c55792Gx.LJLL;
                }
                view3.setPivotX(f);
            }
            View view4 = c55792Gx.LJLJJI;
            if (view4 != null) {
                if (!c55792Gx.LJLZ) {
                    f2 = view4.getMeasuredHeight();
                }
                view4.setPivotY(f2);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C55792Gx c55792Gx2 = (C55792Gx) iDUListenerS263S0100000.l0;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            c55792Gx2.LLLZI(m10exceptionOrNullimpl);
        }
    }

    public static final void onAnimationUpdate$42(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        ((C12U) iDUListenerS263S0100000.l0).LJIIL.setAlpha(((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static final void onAnimationUpdate$43(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        C45101pq c45101pq = ((C278217i) iDUListenerS263S0100000.l0).LIZ;
        if (c45101pq != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            c45101pq.LJJ(((Integer) animatedValue).intValue());
        }
    }

    public static final void onAnimationUpdate$44(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        Object LIZ;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        C37811e5 c37811e5 = (C37811e5) iDUListenerS263S0100000.l0;
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c37811e5.setAlpha(((Float) animatedValue).floatValue());
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C37811e5 c37811e52 = (C37811e5) iDUListenerS263S0100000.l0;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            c37811e52.LJJLJLI(m10exceptionOrNullimpl);
        }
    }

    public static final void onAnimationUpdate$45(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        Object LIZ;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        C37811e5 c37811e5 = (C37811e5) iDUListenerS263S0100000.l0;
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            c37811e5.setScaleX(floatValue);
            c37811e5.setScaleY(floatValue);
            c37811e5.setPivotX(c37811e5.getWidth() / 2);
            c37811e5.setPivotY(0.0f);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C37811e5 c37811e52 = (C37811e5) iDUListenerS263S0100000.l0;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            c37811e52.LJJLJLI(m10exceptionOrNullimpl);
        }
    }

    public static final void onAnimationUpdate$46(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        ((C2H2) iDUListenerS263S0100000.l0).LJJ(((Integer) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Int")).intValue());
    }

    public static final void onAnimationUpdate$47(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        ((C2H2) iDUListenerS263S0100000.l0).LJLZ.setAlpha(((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static final void onAnimationUpdate$5(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        try {
            ConstraintLayout contentView = ((C30011Ft) iDUListenerS263S0100000.l0).getContentView();
            if (contentView != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                contentView.setAlpha(((Float) animatedValue).floatValue());
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void onAnimationUpdate$6(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        float LJIIZILJ;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        C30031Fv c30031Fv = (C30031Fv) iDUListenerS263S0100000.l0;
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ConstraintLayout constraintLayout = c30031Fv.LJLJLJ;
            if (constraintLayout != null) {
                if (!c30031Fv.LLD) {
                    floatValue = 1.8f - floatValue;
                }
                constraintLayout.setScaleX(floatValue);
            }
            ConstraintLayout constraintLayout2 = c30031Fv.LJLJLJ;
            if (constraintLayout2 != null) {
                if (!C15380j0.LJIIZILJ()) {
                    LJIIZILJ = 0.0f;
                } else {
                    LJIIZILJ = C32151Nz.LJIIZILJ(Integer.valueOf(UserLevelGeckoUpdateSetting.DEFAULT));
                }
                constraintLayout2.setPivotX(LJIIZILJ);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void onAnimationUpdate$7(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        C30031Fv c30031Fv = (C30031Fv) iDUListenerS263S0100000.l0;
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ConstraintLayout constraintLayout = c30031Fv.LJLJLJ;
            if (constraintLayout != null) {
                if (!c30031Fv.LLD) {
                    floatValue = 1.0f - floatValue;
                }
                constraintLayout.setAlpha(floatValue);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void onAnimationUpdate$8(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        C30031Fv c30031Fv = (C30031Fv) iDUListenerS263S0100000.l0;
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            c30031Fv.LJLJLJ.setScaleX(floatValue);
            c30031Fv.LJLJLJ.setScaleY(floatValue);
            c30031Fv.LJLJLJ.setPivotX(c30031Fv.LJLJL.getWidth() / 2);
            c30031Fv.LJLJLJ.setPivotY(0.0f);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onAnimationUpdate$9(IDUListenerS263S0100000 iDUListenerS263S0100000, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        InterfaceC88472Yns<Float, C76800UCe> onScrollListener = ((C30061Fy) iDUListenerS263S0100000.l0).getOnScrollListener();
        if (onScrollListener != 0) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            onScrollListener.invoke(animatedValue);
        }
    }
}
