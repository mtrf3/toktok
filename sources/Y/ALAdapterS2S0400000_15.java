package Y;

import X.C86991YCd;
import X.C86992YCe;
import X.C86997YCj;
import X.C86998YCk;
import X.C87000YCm;
import X.C87001YCn;
import X.C87003YCp;
import X.C87005YCr;
import X.C87006YCs;
import X.C87009YCv;
import X.C87010YCw;
import X.C87011YCx;
import X.C87012YCy;
import X.C87013YCz;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ALAdapterS2S0400000_15 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 4:
                onAnimationCancel$1(this, animator);
                return;
            case 8:
                onAnimationCancel$2(this, animator);
                return;
            case 12:
                onAnimationCancel$3(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationCancel$4(this, animator);
                return;
            case 19:
                onAnimationCancel$5(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                onAnimationEnd$7(this, animator);
                return;
            case 8:
                onAnimationEnd$8(this, animator);
                return;
            case 9:
                onAnimationEnd$9(this, animator);
                return;
            case 10:
                onAnimationEnd$10(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$11(this, animator);
                return;
            case 12:
                onAnimationEnd$12(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$13(this, animator);
                return;
            case 14:
                onAnimationEnd$14(this, animator);
                return;
            case 15:
                onAnimationEnd$15(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationEnd$16(this, animator);
                return;
            case 17:
                onAnimationEnd$17(this, animator);
                return;
            case 18:
                onAnimationEnd$18(this, animator);
                return;
            case 19:
                onAnimationEnd$19(this, animator);
                return;
            case 20:
                onAnimationEnd$20(this, animator);
                return;
            case 21:
                onAnimationEnd$21(this, animator);
                return;
            case 22:
                onAnimationEnd$22(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            case 2:
                onAnimationStart$2(this, animator);
                return;
            case 3:
                onAnimationStart$3(this, animator);
                return;
            case 4:
                onAnimationStart$4(this, animator);
                return;
            case 5:
                onAnimationStart$5(this, animator);
                return;
            case 6:
                onAnimationStart$6(this, animator);
                return;
            case 7:
                onAnimationStart$7(this, animator);
                return;
            case 8:
                onAnimationStart$8(this, animator);
                return;
            case 9:
                onAnimationStart$9(this, animator);
                return;
            case 10:
                onAnimationStart$10(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationStart$11(this, animator);
                return;
            case 12:
                onAnimationStart$12(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationStart$13(this, animator);
                return;
            case 14:
                onAnimationStart$14(this, animator);
                return;
            case 15:
                onAnimationStart$15(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationStart$16(this, animator);
                return;
            case 17:
                onAnimationStart$17(this, animator);
                return;
            case 18:
                onAnimationStart$18(this, animator);
                return;
            case 19:
                onAnimationStart$19(this, animator);
                return;
            case 20:
                onAnimationStart$20(this, animator);
                return;
            case 21:
                onAnimationStart$21(this, animator);
                return;
            case 22:
                onAnimationStart$22(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C86991YCd c86991YCd = (C86991YCd) aLAdapterS2S0400000_15.l0;
        View view = (View) aLAdapterS2S0400000_15.l2;
        c86991YCd.getClass();
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
    }

    public static final void onAnimationCancel$1(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((View) aLAdapterS2S0400000_15.l2).setTranslationY(0.0f);
    }

    public static final void onAnimationCancel$2(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((View) aLAdapterS2S0400000_15.l2).setTranslationY(0.0f);
    }

    public static final void onAnimationCancel$3(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((View) aLAdapterS2S0400000_15.l2).setAlpha(1.0f);
        if (((C87003YCp) aLAdapterS2S0400000_15.l1).LIZIZ != 0) {
            ((View) aLAdapterS2S0400000_15.l2).setTranslationY(0.0f);
        }
        if (((C87003YCp) aLAdapterS2S0400000_15.l1).LIZJ != 0) {
            ((View) aLAdapterS2S0400000_15.l2).setTranslationX(0.0f);
        }
    }

    public static final void onAnimationCancel$4(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        ((View) aLAdapterS2S0400000_15.l1).setTranslationX(0.0f);
    }

    public static final void onAnimationCancel$5(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((View) aLAdapterS2S0400000_15.l2).setAlpha(1.0f);
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l3).setListener(null);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJIL((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJIILL.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l2).setListener(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationY(0.0f);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJII(((C86992YCe) aLAdapterS2S0400000_15.l1).LIZ);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJIJ.remove(((C86992YCe) aLAdapterS2S0400000_15.l1).LIZ);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$10(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87013YCz) aLAdapterS2S0400000_15.l2).LIZ(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationY(0.0f);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJII(((C87012YCy) aLAdapterS2S0400000_15.l1).LIZIZ);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJIIZILJ.remove(((C87012YCy) aLAdapterS2S0400000_15.l1).LIZIZ);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$11(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87013YCz) aLAdapterS2S0400000_15.l2).LIZ(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJII((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJIILLIIL.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$12(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l3).setListener(null);
        ((C87000YCm) aLAdapterS2S0400000_15.l0).LJIL(((C87003YCp) aLAdapterS2S0400000_15.l1).LIZ);
        ((C87000YCm) aLAdapterS2S0400000_15.l0).LJIILLIIL.remove(((C87003YCp) aLAdapterS2S0400000_15.l1).LIZ);
        ((C87000YCm) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$13(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l2).setListener(null);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationY(0.0f);
        ((C87000YCm) aLAdapterS2S0400000_15.l0).LJII(((C87001YCn) aLAdapterS2S0400000_15.l1).LIZ);
        ((C87000YCm) aLAdapterS2S0400000_15.l0).LJIJI.remove(((C87001YCn) aLAdapterS2S0400000_15.l1).LIZ);
        ((C87000YCm) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$14(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l2).setListener(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationY(0.0f);
        try {
            ((C87000YCm) aLAdapterS2S0400000_15.l0).LJII(((C87001YCn) aLAdapterS2S0400000_15.l1).LIZIZ);
            ((C87000YCm) aLAdapterS2S0400000_15.l0).LJIJI.remove(((C87001YCn) aLAdapterS2S0400000_15.l1).LIZIZ);
            ((C87000YCm) aLAdapterS2S0400000_15.l0).LJJIFFI();
        } catch (IllegalArgumentException unused) {
        }
    }

    public static final void onAnimationEnd$15(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l2).setListener(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((C87000YCm) aLAdapterS2S0400000_15.l0).LJII((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87000YCm) aLAdapterS2S0400000_15.l0).LJIJ.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87000YCm) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$16(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l2).setListener(null);
        ((C86997YCj) aLAdapterS2S0400000_15.l3).LJIL((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l0);
        ((C86997YCj) aLAdapterS2S0400000_15.l3).LJIILJJIL.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l0);
        ((C86997YCj) aLAdapterS2S0400000_15.l3).LJJIFFI();
    }

    public static final void onAnimationEnd$17(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l1).setListener(null);
        ((View) aLAdapterS2S0400000_15.l2).setAlpha(1.0f);
        ((View) aLAdapterS2S0400000_15.l2).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l2).setTranslationY(0.0f);
        ((C86997YCj) aLAdapterS2S0400000_15.l3).LJII(((C86998YCk) aLAdapterS2S0400000_15.l0).LIZ);
        ((C86997YCj) aLAdapterS2S0400000_15.l3).LJIIZILJ.remove(((C86998YCk) aLAdapterS2S0400000_15.l0).LIZ);
        ((C86997YCj) aLAdapterS2S0400000_15.l3).LJJIFFI();
    }

    public static final void onAnimationEnd$18(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l1).setListener(null);
        ((View) aLAdapterS2S0400000_15.l2).setAlpha(1.0f);
        ((View) aLAdapterS2S0400000_15.l2).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l2).setTranslationY(0.0f);
        ((C86997YCj) aLAdapterS2S0400000_15.l3).LJII(((C86998YCk) aLAdapterS2S0400000_15.l0).LIZIZ);
        ((C86997YCj) aLAdapterS2S0400000_15.l3).LJIIZILJ.remove(((C86998YCk) aLAdapterS2S0400000_15.l0).LIZIZ);
        ((C86997YCj) aLAdapterS2S0400000_15.l3).LJJIFFI();
    }

    public static final void onAnimationEnd$19(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l3).setListener(null);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJIL((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJIILLIIL.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$2(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l2).setListener(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationY(0.0f);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJII(((C86992YCe) aLAdapterS2S0400000_15.l1).LIZIZ);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJIJ.remove(((C86992YCe) aLAdapterS2S0400000_15.l1).LIZIZ);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$20(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l2).setListener(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationY(0.0f);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJII(((C87006YCs) aLAdapterS2S0400000_15.l1).LIZ);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJIJI.remove(((C87006YCs) aLAdapterS2S0400000_15.l1).LIZ);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$21(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l2).setListener(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationY(0.0f);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJII(((C87006YCs) aLAdapterS2S0400000_15.l1).LIZIZ);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJIJI.remove(((C87006YCs) aLAdapterS2S0400000_15.l1).LIZIZ);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$22(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l2).setListener(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJII((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJIJ.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87005YCr) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$3(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewPropertyAnimator) aLAdapterS2S0400000_15.l2).setListener(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJII((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJIIZILJ.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C86991YCd) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$4(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87013YCz) aLAdapterS2S0400000_15.l3).LIZ(null);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJIL((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJIIZILJ.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJJIFFI();
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJIIIIZZ.run();
    }

    public static final void onAnimationEnd$5(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87013YCz) aLAdapterS2S0400000_15.l2).LIZ(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationY(0.0f);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJII(((C87011YCx) aLAdapterS2S0400000_15.l1).LIZ);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJIJJ.remove(((C87011YCx) aLAdapterS2S0400000_15.l1).LIZ);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$6(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87013YCz) aLAdapterS2S0400000_15.l2).LIZ(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationY(0.0f);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJII(((C87011YCx) aLAdapterS2S0400000_15.l1).LIZIZ);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJIJJ.remove(((C87011YCx) aLAdapterS2S0400000_15.l1).LIZIZ);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$7(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87013YCz) aLAdapterS2S0400000_15.l2).LIZ(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJII((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJIJI.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationEnd$8(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87013YCz) aLAdapterS2S0400000_15.l3).LIZ(null);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJIL((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJIILJJIL.remove((RecyclerView.ViewHolder) aLAdapterS2S0400000_15.l1);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJJIFFI();
        Runnable runnable = ((C87010YCw) aLAdapterS2S0400000_15.l0).LJIIIIZZ;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87013YCz) aLAdapterS2S0400000_15.l2).LIZ(null);
        ((View) aLAdapterS2S0400000_15.l3).setAlpha(1.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationX(0.0f);
        ((View) aLAdapterS2S0400000_15.l3).setTranslationY(0.0f);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJII(((C87012YCy) aLAdapterS2S0400000_15.l1).LIZ);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJIIZILJ.remove(((C87012YCy) aLAdapterS2S0400000_15.l1).LIZ);
        ((C87010YCw) aLAdapterS2S0400000_15.l0).LJJIFFI();
    }

    public static final void onAnimationStart$0(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C86991YCd) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$1(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C86991YCd) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$10(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87010YCw) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$11(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87010YCw) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$12(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87000YCm) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$13(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87000YCm) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$14(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87000YCm) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$15(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87000YCm) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$16(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        ((C86997YCj) aLAdapterS2S0400000_15.l3).getClass();
    }

    public static final void onAnimationStart$17(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        ((C86997YCj) aLAdapterS2S0400000_15.l3).getClass();
    }

    public static final void onAnimationStart$18(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        ((C86997YCj) aLAdapterS2S0400000_15.l3).getClass();
    }

    public static final void onAnimationStart$19(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87005YCr) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$2(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C86991YCd) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$20(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87005YCr) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$21(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87005YCr) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$22(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87005YCr) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$3(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C86991YCd) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$4(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87009YCv) aLAdapterS2S0400000_15.l0).getClass();
        ((C87009YCv) aLAdapterS2S0400000_15.l0).LJII.run();
    }

    public static final void onAnimationStart$5(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87009YCv) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$6(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87009YCv) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$7(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87009YCv) aLAdapterS2S0400000_15.l0).getClass();
    }

    public static final void onAnimationStart$8(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87010YCw) aLAdapterS2S0400000_15.l0).getClass();
        Runnable runnable = ((C87010YCw) aLAdapterS2S0400000_15.l0).LJII;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onAnimationStart$9(ALAdapterS2S0400000_15 aLAdapterS2S0400000_15, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C87010YCw) aLAdapterS2S0400000_15.l0).getClass();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS2S0400000_15(android.view.View r2, android.view.ViewPropertyAnimator r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, X.C86991YCd r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS2S0400000_15.<init>(android.view.View, android.view.ViewPropertyAnimator, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.YCd, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS2S0400000_15(android.view.View r2, android.view.ViewPropertyAnimator r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, X.C87005YCr r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 19: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS2S0400000_15.<init>(android.view.View, android.view.ViewPropertyAnimator, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.YCr, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS2S0400000_15(android.view.View r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3, X.C87013YCz r4, X.C87009YCv r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 4: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r3
            r0.l2 = r4
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r3
            r0.l2 = r2
            r0.l3 = r4
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS2S0400000_15.<init>(android.view.View, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.YCz, X.YCv, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS2S0400000_15(android.view.View r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3, X.C87013YCz r4, X.C87010YCw r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 8: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r3
            r0.l2 = r4
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r3
            r0.l2 = r2
            r0.l3 = r4
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS2S0400000_15.<init>(android.view.View, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.YCz, X.YCw, int):void");
    }

    public ALAdapterS2S0400000_15(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
