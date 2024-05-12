package X;

import Y.ALAdapterS7S0100000_9;
import Y.AUListenerS99S0200000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.dsp.service.IMusicDspService;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LOU extends LOT {
    public final float LLFFF;
    public final AnimatorSet LLFII;
    public final long LLFZ;
    public final float LLI;
    public final /* synthetic */ LOS LLIFFJFJJ;

    public final ValueAnimator LJII(TuxIconView tuxIconView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS99S0200000_9(tuxIconView, this, 5));
        ofFloat.addListener(new ALAdapterS7S0100000_9(this.LLIFFJFJJ, 21));
        ofFloat.setDuration(110L);
        return ofFloat;
    }

    public final ValueAnimator LJIIIIZZ(TuxIconView tuxIconView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new AUListenerS99S0200000_9(tuxIconView, this, 6));
        ofFloat.setDuration(110L);
        return ofFloat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LOU(LOS los, Context context) {
        super(los, context);
        this.LLIFFJFJJ = los;
        new LinkedHashMap();
        this.LLFFF = 0.6f;
        this.LLFII = new AnimatorSet();
        this.LLFZ = 342L;
        this.LLI = 0.6f;
        getMSelectedIndicatorPaint().setShadowLayer(getHeight(), 0.0f, getWidth(), ColorProtector.parseColor("#26000000"));
        los.LJLLJ.add(new LOV(los, this));
    }

    public final void LJIIIZ(LOP lop, boolean z) {
        LOX lox;
        TextView mCustomTextView$homepage_common_release;
        float f;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (lop != null && (lox = lop.LIZLLL) != null && (mCustomTextView$homepage_common_release = lox.getMCustomTextView$homepage_common_release()) != null) {
            float f2 = 1.0f;
            if (!z) {
                if (this.LLIFFJFJJ.getEnableAnimation()) {
                    objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleX", mCustomTextView$homepage_common_release.getScaleX(), 1.25f, 1.125f).setDuration(300L);
                    objectAnimator2.setInterpolator(C54180LOe.LIZ);
                    objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleY", mCustomTextView$homepage_common_release.getScaleY(), 1.25f, 1.125f).setDuration(300L);
                    objectAnimator.setInterpolator(C54181LOf.LIZ);
                } else {
                    objectAnimator = null;
                }
                f2 = 1.125f;
                f = 1.0f;
            } else {
                f = 0.6f;
                if (this.LLIFFJFJJ.getEnableAnimation()) {
                    objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleX", mCustomTextView$homepage_common_release.getScaleX(), 1.0f).setDuration(200L);
                    objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleY", mCustomTextView$homepage_common_release.getScaleY(), 1.0f).setDuration(200L);
                } else {
                    objectAnimator = null;
                }
            }
            if (this.LLIFFJFJJ.getEnableAnimation()) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "alpha", mCustomTextView$homepage_common_release.getAlpha(), f).setDuration(200L);
                o.LJIIIIZZ(duration, "ofFloat(textView, \"alpha…        .setDuration(200)");
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(duration, objectAnimator2, objectAnimator);
                animatorSet.start();
                return;
            }
            mCustomTextView$homepage_common_release.setScaleX(f2);
            mCustomTextView$homepage_common_release.setScaleY(f2);
            mCustomTextView$homepage_common_release.setAlpha(f);
        }
    }

    public final void LJIIJ(LOP lop, boolean z) {
        LOX lox;
        TextView mCustomTextView$homepage_common_release;
        float f;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (lop != null && (lox = lop.LIZLLL) != null && (mCustomTextView$homepage_common_release = lox.getMCustomTextView$homepage_common_release()) != null) {
            float f2 = 1.0f;
            if (!z) {
                if (this.LLIFFJFJJ.getEnableAnimation()) {
                    objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleX", mCustomTextView$homepage_common_release.getScaleX(), 1.125f).setDuration(this.LLFZ);
                    objectAnimator2.setInterpolator(new InterpolatorC54178LOc());
                    objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleY", mCustomTextView$homepage_common_release.getScaleY(), 1.125f).setDuration(this.LLFZ);
                    objectAnimator.setInterpolator(new InterpolatorC54178LOc());
                } else {
                    objectAnimator = null;
                }
                f2 = 1.125f;
                f = 1.0f;
            } else {
                f = 0.6f;
                if (this.LLIFFJFJJ.getEnableAnimation()) {
                    objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleX", mCustomTextView$homepage_common_release.getScaleX(), 1.0f).setDuration(this.LLFZ);
                    objectAnimator2.setInterpolator(new InterpolatorC54178LOc());
                    objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleY", mCustomTextView$homepage_common_release.getScaleY(), 1.0f).setDuration(this.LLFZ);
                } else {
                    objectAnimator = null;
                }
            }
            if (this.LLIFFJFJJ.getEnableAnimation()) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "alpha", mCustomTextView$homepage_common_release.getAlpha(), f).setDuration(this.LLFZ);
                o.LJIIIIZZ(duration, "ofFloat(textView, \"alpha…P_TAB_ANIMATION_DURATION)");
                duration.setInterpolator(new InterpolatorC54178LOc());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(duration, objectAnimator2, objectAnimator);
                animatorSet.start();
                return;
            }
            mCustomTextView$homepage_common_release.setScaleX(f2);
            mCustomTextView$homepage_common_release.setScaleY(f2);
            mCustomTextView$homepage_common_release.setAlpha(f);
        }
    }

    public final void LJIIJJI(LOP lop, boolean z) {
        LOX lox;
        TextView mCustomTextView$homepage_common_release;
        IMusicDspService iMusicDspService;
        TuxIconView LJIIIIZZ;
        boolean z2;
        if (lop == null || (lox = lop.LIZLLL) == null || (mCustomTextView$homepage_common_release = lox.getMCustomTextView$homepage_common_release()) == null || (LJIIIIZZ = (iMusicDspService = C51645KOr.LIZIZ).LJIIIIZZ(lop.LIZLLL)) == null) {
            return;
        }
        if (iMusicDspService.LIZLLL() && !C52309Kfx.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LLIFFJFJJ.getEnableAnimation() && !z) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(lox, "scaleX", 1.0f, 1.125f).setDuration(this.LLFZ);
            o.LJIIIIZZ(duration, "ofFloat(\n               …P_TAB_ANIMATION_DURATION)");
            duration.setInterpolator(new InterpolatorC54178LOc());
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(lox, "scaleY", 1.0f, 1.125f).setDuration(this.LLFZ);
            o.LJIIIIZZ(duration2, "ofFloat(\n               …P_TAB_ANIMATION_DURATION)");
            duration2.setInterpolator(new InterpolatorC54178LOc());
            HashSet LIZLLL = C77275UUl.LIZLLL(duration, duration2);
            HashSet hashSet = new HashSet();
            if (z2) {
                hashSet.add(LJII(LJIIIIZZ));
            }
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "alpha", this.LLI, 1.0f).setDuration(this.LLFZ);
            o.LJIIIIZZ(duration3, "ofFloat(\n               …P_TAB_ANIMATION_DURATION)");
            duration3.setInterpolator(new InterpolatorC54178LOc());
            hashSet.add(duration3);
            hashSet.addAll(LIZLLL);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(hashSet);
            animatorSet.start();
            return;
        }
        if (this.LLIFFJFJJ.getEnableAnimation() && z) {
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(lox, "scaleX", 1.125f, 1.0f).setDuration(this.LLFZ);
            o.LJIIIIZZ(duration4, "ofFloat(\n               …P_TAB_ANIMATION_DURATION)");
            duration4.setInterpolator(new InterpolatorC54178LOc());
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(lox, "scaleY", 1.125f, 1.0f).setDuration(this.LLFZ);
            o.LJIIIIZZ(duration5, "ofFloat(\n               …P_TAB_ANIMATION_DURATION)");
            duration5.setInterpolator(new InterpolatorC54178LOc());
            HashSet LIZLLL2 = C77275UUl.LIZLLL(duration4, duration5);
            HashSet hashSet2 = new HashSet();
            if (z2) {
                hashSet2.add(LJIIIIZZ(LJIIIIZZ));
            }
            ObjectAnimator duration6 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "alpha", 1.0f, this.LLI).setDuration(this.LLFZ);
            o.LJIIIIZZ(duration6, "ofFloat(\n               …P_TAB_ANIMATION_DURATION)");
            duration6.setInterpolator(new InterpolatorC54178LOc());
            hashSet2.add(duration6);
            hashSet2.addAll(LIZLLL2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(hashSet2);
            animatorSet2.start();
            return;
        }
        if (!z) {
            lox.setScaleX(1.125f);
            lox.setScaleY(1.125f);
            mCustomTextView$homepage_common_release.setAlpha(1.0f);
            if (!z2) {
                return;
            }
            LJIIIIZZ.setIconWidth((int) this.LLIFFJFJJ.LJLZ);
            LJIIIIZZ.setAlpha(1.0f);
            mCustomTextView$homepage_common_release.setTranslationX(0.0f);
            return;
        }
        lox.setScaleX(1.0f);
        lox.setScaleY(1.0f);
        mCustomTextView$homepage_common_release.setAlpha(this.LLI);
        if (!z2) {
            return;
        }
        LJIIIIZZ.setIconWidth(0);
        LJIIIIZZ.setAlpha(0.0f);
    }

    public final void LJIIL(LOP lop, boolean z) {
        LOX lox;
        TextView mCustomTextView$homepage_common_release;
        boolean z2;
        if (lop == null || (lox = lop.LIZLLL) == null || (mCustomTextView$homepage_common_release = lox.getMCustomTextView$homepage_common_release()) == null) {
            return;
        }
        LOX lox2 = lop.LIZLLL;
        IMusicDspService iMusicDspService = C51645KOr.LIZIZ;
        TuxIconView LJIIIIZZ = iMusicDspService.LJIIIIZZ(lox2);
        if (LJIIIIZZ == null) {
            return;
        }
        if (iMusicDspService.LIZLLL() && !C52309Kfx.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            mCustomTextView$homepage_common_release.setAlpha(1.0f);
            if (!z2) {
                return;
            }
            if (this.LLIFFJFJJ.getEnableAnimation()) {
                LJII(LJIIIIZZ).start();
                return;
            } else {
                if (this.LLIFFJFJJ.getEnableAnimation()) {
                    return;
                }
                LJIIIIZZ.setIconWidth((int) this.LLIFFJFJJ.LJLZ);
                LJIIIIZZ.setAlpha(1.0f);
                return;
            }
        }
        mCustomTextView$homepage_common_release.setAlpha(this.LLI);
        if (!z2) {
            return;
        }
        if (this.LLIFFJFJJ.getEnableAnimation()) {
            LJIIIIZZ(LJIIIIZZ).start();
        } else {
            if (this.LLIFFJFJJ.getEnableAnimation()) {
                return;
            }
            LJIIIIZZ.setIconWidth(0);
            LJIIIIZZ.setAlpha(0.0f);
        }
    }
}
