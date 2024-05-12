package Y;

import X.C264612c;
import X.C75O;
import X.C82158WMg;
import X.C90193gN;
import X.X1D;
import X.XW8;
import X.XXF;
import X.Y00;
import X.Y0S;
import X.Y45;
import X.YBU;
import X.YKB;
import X.YNZ;
import X.YS3;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import com.ss.android.ugc.aweme.setting.ui.SettingItemHighlightHelper;
import com.ss.android.videoshop.context.VideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AUListenerS102S0100000_15 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationUpdate$11(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        ((I18nSettingNewVersionFragment) aUListenerS102S0100000_15.l0).lambda$setupHighlightAnimation$4(valueAnimator);
    }

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
            default:
                return;
        }
    }

    public AUListenerS102S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        YKB ykb = (YKB) aUListenerS102S0100000_15.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ykb.LJ = ((Float) animatedValue).floatValue();
    }

    public static final void onAnimationUpdate$1(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        YKB ykb = (YKB) aUListenerS102S0100000_15.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ykb.LJ = ((Float) animatedValue).floatValue();
    }

    public static final void onAnimationUpdate$10(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        ((ChooseMusicActivity) aUListenerS102S0100000_15.l0).LJLILLLLZI.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$12(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator animator) {
        o.LJIIIZ(animator, "animator");
        Drawable drawable = ((SettingItemHighlightHelper) aUListenerS102S0100000_15.l0).LJLJI.LJFF().LLIIIILZ;
        if (drawable != null) {
            drawable.setAlpha(255 - ((int) (animator.getAnimatedFraction() * 255)));
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator animator) {
        o.LJIIIZ(animator, "animator");
        Drawable drawable = ((SettingItemHighlightHelper) aUListenerS102S0100000_15.l0).LJLJI.LJFF().LLIIIILZ;
        if (drawable != null) {
            drawable.setAlpha((int) (animator.getAnimatedFraction() * 255));
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        YS3 ys3 = ((VideoContext) aUListenerS102S0100000_15.l0).layerHostMediaLayout;
        if (ys3 == null) {
            return;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ys3.getLayoutParams();
        float f = 1.0f - floatValue;
        VideoContext videoContext = (VideoContext) aUListenerS102S0100000_15.l0;
        int[] iArr = videoContext.location;
        marginLayoutParams.leftMargin = (int) (iArr[0] * f);
        marginLayoutParams.topMargin = (int) (f * iArr[1]);
        marginLayoutParams.width = (int) (((videoContext.screenWidth - r2) * floatValue) + videoContext.halfScreenWidth);
        marginLayoutParams.height = (int) ((floatValue * (videoContext.screenHeight - r2)) + videoContext.halfScreenHeight);
        ys3.setLayoutParams(marginLayoutParams);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFullScreen onAnimationUpdate:");
        LIZ.append(marginLayoutParams);
        X1D.LIZIZ(LIZ);
    }

    public static final void onAnimationUpdate$15(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        YS3 ys3 = ((VideoContext) aUListenerS102S0100000_15.l0).layerHostMediaLayout;
        if (ys3 == null) {
            return;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ys3.getLayoutParams();
        VideoContext videoContext = (VideoContext) aUListenerS102S0100000_15.l0;
        int[] iArr = videoContext.location;
        marginLayoutParams.leftMargin = (int) (iArr[0] * floatValue);
        marginLayoutParams.topMargin = (int) (iArr[1] * floatValue);
        float f = 1.0f - floatValue;
        marginLayoutParams.width = (int) (((videoContext.screenWidth - r2) * f) + videoContext.halfScreenWidth);
        marginLayoutParams.height = (int) ((f * (videoContext.screenHeight - r2)) + videoContext.halfScreenHeight);
        ys3.setLayoutParams(marginLayoutParams);
    }

    public static final void onAnimationUpdate$16(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAni) {
        o.LJIIIZ(valueAni, "valueAni");
        RelativeLayout relativeLayout = ((XW8) aUListenerS102S0100000_15.l0).LJLJJLL;
        if (relativeLayout == null) {
            return;
        }
        Object animatedValue = valueAni.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        relativeLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$17(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAni) {
        o.LJIIIZ(valueAni, "valueAni");
        RelativeLayout relativeLayout = ((XW8) aUListenerS102S0100000_15.l0).LJLJJLL;
        if (relativeLayout == null) {
            return;
        }
        Object animatedValue = valueAni.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        relativeLayout.setAlpha(1 - ((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$18(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        Y45 y45 = (Y45) aUListenerS102S0100000_15.l0;
        C75O c75o = y45.LJLJJI;
        if (c75o != null) {
            int i = y45.LJLJJLL;
            c75o.O4(floatValue * i, i);
        }
    }

    public static final void onAnimationUpdate$19(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        Y45 y45 = (Y45) aUListenerS102S0100000_15.l0;
        C75O c75o = y45.LJLJJI;
        if (c75o != null) {
            int i = y45.LJLJJLL;
            c75o.O4(floatValue * i, i);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        YKB ykb = (YKB) aUListenerS102S0100000_15.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ykb.LJII = ((Integer) animatedValue).intValue();
    }

    public static final void onAnimationUpdate$20(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        ((Y0S) aUListenerS102S0100000_15.l0).LIZIZ.setCaptionControlIconAlpha(((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static final void onAnimationUpdate$21(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        if (intValue <= 100) {
            ((Y00) aUListenerS102S0100000_15.l0).LIZ(R.id.c4m).setAlpha(intValue * 0.01f);
        } else if (intValue <= 1100) {
            ((Y00) aUListenerS102S0100000_15.l0).LIZ(R.id.c4m).setAlpha(1.0f);
        } else {
            ((Y00) aUListenerS102S0100000_15.l0).LIZ(R.id.c4m).setAlpha(1 - ((intValue - 1100) * 0.01f));
        }
    }

    public static final void onAnimationUpdate$22(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        YBU ybu = (YBU) aUListenerS102S0100000_15.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ybu.setLeftWidth(((Float) animatedValue).floatValue());
        YBU ybu2 = (YBU) aUListenerS102S0100000_15.l0;
        ybu2.LLIIII = true;
        ybu2.LLIZ = true;
        ybu2.postInvalidate();
    }

    public static final void onAnimationUpdate$23(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        ((C82158WMg) aUListenerS102S0100000_15.l0).LIZIZ.setTranslationX(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$24(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        ((C82158WMg) aUListenerS102S0100000_15.l0).LIZIZ.setTranslationX(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$25(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        ((View) aUListenerS102S0100000_15.l0).setTranslationX(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$26(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        ((View) aUListenerS102S0100000_15.l0).setTranslationX(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$27(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (C90193gN.LIZIZ(((XXF) aUListenerS102S0100000_15.l0).LJLZ)) {
            ((ViewGroup.MarginLayoutParams) ((XXF) aUListenerS102S0100000_15.l0).LJLL.getLayoutParams()).leftMargin = intValue;
        } else {
            ((ViewGroup.MarginLayoutParams) ((XXF) aUListenerS102S0100000_15.l0).LJLL.getLayoutParams()).rightMargin = intValue;
        }
        ((XXF) aUListenerS102S0100000_15.l0).LJLL.requestLayout();
    }

    public static final void onAnimationUpdate$28(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator it) {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        o.LJIIIZ(it, "it");
        ViewGroup viewGroup = ((YNZ) aUListenerS102S0100000_15.l0).LJLLI;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            if ((layoutParams3 instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams3) != null) {
                Object animatedValue = it.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.width = ((Integer) animatedValue).intValue();
            }
        }
        YNZ ynz = (YNZ) aUListenerS102S0100000_15.l0;
        ViewGroup viewGroup2 = ynz.LJLLILLLL;
        if (viewGroup2 != null) {
            int i = ynz.LJLLLL;
            Object animatedValue2 = it.getAnimatedValue();
            o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = (i - ((Integer) animatedValue2).intValue()) + ynz.LJLLL;
            ViewGroup.LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
            if ((layoutParams4 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams4) != null) {
                layoutParams.width = intValue;
            }
        }
        ((YNZ) aUListenerS102S0100000_15.l0).requestLayout();
    }

    public static final void onAnimationUpdate$3(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        YKB ykb = (YKB) aUListenerS102S0100000_15.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ykb.LJII = ((Integer) animatedValue).intValue();
    }

    public static final void onAnimationUpdate$4(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        YKB ykb = (YKB) aUListenerS102S0100000_15.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ykb.LJII = ((Integer) animatedValue).intValue();
    }

    public static final void onAnimationUpdate$5(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        YKB ykb = (YKB) aUListenerS102S0100000_15.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ykb.LJ = ((Float) animatedValue).floatValue();
    }

    public static final void onAnimationUpdate$6(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        YKB ykb = (YKB) aUListenerS102S0100000_15.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ykb.LJI = ((Integer) animatedValue).intValue();
    }

    public static final void onAnimationUpdate$7(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        YKB ykb = (YKB) aUListenerS102S0100000_15.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ykb.LJFF = ((Float) animatedValue).floatValue();
    }

    public static final void onAnimationUpdate$8(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        YKB ykb = (YKB) aUListenerS102S0100000_15.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ykb.LJII = ((Integer) animatedValue).intValue();
    }

    public static final void onAnimationUpdate$9(AUListenerS102S0100000_15 aUListenerS102S0100000_15, ValueAnimator valueAnimator) {
        ((ChooseMusicActivity) aUListenerS102S0100000_15.l0).LJLILLLLZI.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
