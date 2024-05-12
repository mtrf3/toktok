package Y;

import X.AbstractC51310KBu;
import X.AbstractC51311KBv;
import X.C264612c;
import X.C51312KBw;
import X.C51313KBx;
import X.C51452KHg;
import X.C51634KOg;
import X.C51671KPr;
import X.JE2;
import X.JE9;
import X.KLD;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewController;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class AUListenerS96S0100000_8 implements ValueAnimator.AnimatorUpdateListener {
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
            default:
                return;
        }
    }

    public AUListenerS96S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C51671KPr c51671KPr = (C51671KPr) aUListenerS96S0100000_8.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c51671KPr.setDrawerWidth(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$1(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator valueAnimator) {
        C51312KBw c51312KBw = (C51312KBw) ((AbstractC51310KBu) aUListenerS96S0100000_8.l0);
        c51312KBw.LJ.setTranslationY(valueAnimator.getAnimatedFraction() * c51312KBw.LJFF);
        c51312KBw.LJ.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$10(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        WindowManager.LayoutParams layoutParams = ((C51634KOg) aUListenerS96S0100000_8.l0).LJLJL;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.x = ((Integer) animatedValue).intValue();
        ((C51634KOg) aUListenerS96S0100000_8.l0).LIZJ();
    }

    public static final void onAnimationUpdate$11(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        KLD kld = (KLD) aUListenerS96S0100000_8.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type android.graphics.RectF");
        kld.setCurrentRect((RectF) animatedValue);
        if (it.getAnimatedFraction() >= 0.8f) {
            ((KLD) aUListenerS96S0100000_8.l0).LJLJJLL.setColor(C51452KHg.LIZ);
        }
        ((KLD) aUListenerS96S0100000_8.l0).invalidate();
    }

    public static final void onAnimationUpdate$12(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        KLD kld = (KLD) aUListenerS96S0100000_8.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type android.graphics.RectF");
        kld.setCurrentRect((RectF) animatedValue);
    }

    public static final void onAnimationUpdate$13(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        KLD kld = (KLD) aUListenerS96S0100000_8.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type android.graphics.RectF");
        kld.setCurrentRect((RectF) animatedValue);
        ((KLD) aUListenerS96S0100000_8.l0).invalidate();
    }

    public static final void onAnimationUpdate$14(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        KLD kld = (KLD) aUListenerS96S0100000_8.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type android.graphics.RectF");
        kld.setCurrentRect((RectF) animatedValue);
    }

    public static final void onAnimationUpdate$15(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        KLD kld = (KLD) aUListenerS96S0100000_8.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type android.graphics.RectF");
        kld.setCurrentRect((RectF) animatedValue);
        ((KLD) aUListenerS96S0100000_8.l0).LJLJJLL.setColor(C51452KHg.LIZ);
        ((KLD) aUListenerS96S0100000_8.l0).invalidate();
    }

    public static final void onAnimationUpdate$16(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        TextView textView = ((SurveyViewController) aUListenerS96S0100000_8.l0).LJLJJL;
        if (textView != null) {
            textView.setAlpha(floatValue);
            View view = ((SurveyViewController) aUListenerS96S0100000_8.l0).LJLJLLL;
            if (view != null) {
                view.setAlpha(floatValue);
                return;
            } else {
                o.LJIJI("lottieGroup");
                throw null;
            }
        }
        o.LJIJI("titleText");
        throw null;
    }

    public static final void onAnimationUpdate$2(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator valueAnimator) {
        C51312KBw c51312KBw = (C51312KBw) ((AbstractC51310KBu) aUListenerS96S0100000_8.l0);
        c51312KBw.LJ.setTranslationY((1.0f - valueAnimator.getAnimatedFraction()) * c51312KBw.LJFF);
        c51312KBw.LJ.setAlpha(valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$3(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS96S0100000_8.l0).LLJ;
        if (frameLayout != null) {
            int paddingStart = frameLayout.getPaddingStart();
            int paddingTop = frameLayout.getPaddingTop();
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            frameLayout.setPaddingRelative(paddingStart, paddingTop, ((Integer) animatedValue).intValue(), frameLayout.getPaddingBottom());
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator valueAnimator) {
        C51313KBx c51313KBx = (C51313KBx) ((AbstractC51311KBv) aUListenerS96S0100000_8.l0);
        c51313KBx.LJ.setTranslationY(valueAnimator.getAnimatedFraction() * c51313KBx.LJFF);
        c51313KBx.LJ.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$5(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator valueAnimator) {
        C51313KBx c51313KBx = (C51313KBx) ((AbstractC51311KBv) aUListenerS96S0100000_8.l0);
        c51313KBx.LJ.setTranslationY((1.0f - valueAnimator.getAnimatedFraction()) * c51313KBx.LJFF);
        c51313KBx.LJ.setAlpha(valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$6(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        View view = ((JE2) aUListenerS96S0100000_8.l0).LJLILLLLZI;
        if (view == null) {
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$7(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        View view = ((JE9) aUListenerS96S0100000_8.l0).LJLL;
        if (view != null) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
            return;
        }
        o.LJIJI("transitionLayer");
        throw null;
    }

    public static final void onAnimationUpdate$8(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        View view = ((JE9) aUListenerS96S0100000_8.l0).LJLL;
        if (view != null) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
            return;
        }
        o.LJIJI("transitionLayer");
        throw null;
    }

    public static final void onAnimationUpdate$9(AUListenerS96S0100000_8 aUListenerS96S0100000_8, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        WindowManager.LayoutParams layoutParams = ((C51634KOg) aUListenerS96S0100000_8.l0).LJLJL;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.y = ((Integer) animatedValue).intValue();
        ((C51634KOg) aUListenerS96S0100000_8.l0).LIZJ();
    }
}
