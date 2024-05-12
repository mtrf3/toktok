package Y;

import X.C115674gN;
import X.C115684gO;
import X.C17N;
import X.C34B;
import X.C4S3;
import X.C55953Lxd;
import X.InterfaceC65784Pro;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedKeyboardDialogFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFragmentV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ALAdapterS0S0100000_1 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
            case 3:
            case 12:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                onAnimationEnd$1(this, animator);
                return;
            case 4:
                onAnimationEnd$2(this, animator);
                return;
            case 5:
                onAnimationEnd$3(this, animator);
                return;
            case 6:
                onAnimationEnd$4(this, animator);
                return;
            case 7:
                onAnimationEnd$5(this, animator);
                return;
            case 8:
                onAnimationEnd$6(this, animator);
                return;
            case 9:
                onAnimationEnd$7(this, animator);
                return;
            case 10:
                onAnimationEnd$8(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$9(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$10(this, animator);
                return;
            case 14:
                onAnimationEnd$11(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                return;
            case 3:
                onAnimationStart$1(this, animator);
                return;
            case 9:
                onAnimationStart$2(this, animator);
                return;
            case 10:
                onAnimationStart$3(this, animator);
                return;
            case 12:
                onAnimationStart$4(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS0S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C115674gN c115674gN = C115674gN.LIZ;
        C115684gO c115684gO = (C115684gO) aLAdapterS0S0100000_1.l0;
        c115674gN.getClass();
        C115674gN.LIZ(c115684gO);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C17N.LJJIIJZLJL(((DetailFeedKeyboardDialogFragment) aLAdapterS0S0100000_1.l0)._$_findCachedViewById(R.id.ikt));
    }

    public static final void onAnimationEnd$10(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) aLAdapterS0S0100000_1.l0).setTranslationX(0.0f);
    }

    public static final void onAnimationEnd$11(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) aLAdapterS0S0100000_1.l0).setScaleX(0.0f);
        ((View) aLAdapterS0S0100000_1.l0).setScaleY(0.0f);
        ((View) aLAdapterS0S0100000_1.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C17N.LJJIIJZLJL(((DetailFeedQuickDMFragmentV2) aLAdapterS0S0100000_1.l0)._$_findCachedViewById(R.id.ikt));
    }

    public static final void onAnimationEnd$3(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((SmartImageView) aLAdapterS0S0100000_1.l0, "scaleX", 0.6f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((SmartImageView) aLAdapterS0S0100000_1.l0, "scaleY", 0.6f, 1.0f);
        ofFloat.setDuration(266L);
        ofFloat.setInterpolator(C55953Lxd.LIZLLL());
        ofFloat2.setDuration(266L);
        ofFloat2.setInterpolator(C55953Lxd.LIZLLL());
        ofFloat.start();
        ofFloat2.start();
    }

    public static final void onAnimationEnd$4(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((BaseQuickChatRoomFragment) aLAdapterS0S0100000_1.l0).vl();
    }

    public static final void onAnimationEnd$5(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) aLAdapterS0S0100000_1.l0).invoke();
    }

    public static final void onAnimationEnd$6(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) aLAdapterS0S0100000_1.l0).invoke();
    }

    public static final void onAnimationEnd$7(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAnimationEnd: ");
        LIZ.append(System.currentTimeMillis());
        C34B.LIZIZ("ReactionJumpAnimatorUtils", X1D.LIZIZ(LIZ));
        View view = (View) aLAdapterS0S0100000_1.l0;
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public static final void onAnimationEnd$8(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("animation end: ");
        LIZ.append(System.currentTimeMillis());
        C34B.LIZIZ("ReactionItemExpandAnimatorUtils", X1D.LIZIZ(LIZ));
        FrameLayout frameLayout = (FrameLayout) aLAdapterS0S0100000_1.l0;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationEnd$9(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C4S3) aLAdapterS0S0100000_1.l0).LIZ();
    }

    public static final void onAnimationStart$0(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        DetailFeedKeyboardDialogFragment detailFeedKeyboardDialogFragment = (DetailFeedKeyboardDialogFragment) aLAdapterS0S0100000_1.l0;
        if (!detailFeedKeyboardDialogFragment.LJZ) {
            C17N.LJJLIIIJJI(detailFeedKeyboardDialogFragment._$_findCachedViewById(R.id.ikt));
        }
    }

    public static final void onAnimationStart$1(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C17N.LJJLIIIJJI(((DetailFeedQuickDMFragmentV2) aLAdapterS0S0100000_1.l0)._$_findCachedViewById(R.id.ikt));
    }

    public static final void onAnimationStart$2(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAnimationStart: ");
        LIZ.append(System.currentTimeMillis());
        C34B.LIZIZ("ReactionJumpAnimatorUtils", X1D.LIZIZ(LIZ));
    }

    public static final void onAnimationStart$3(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("animation start: ");
        LIZ.append(System.currentTimeMillis());
        C34B.LIZIZ("ReactionItemExpandAnimatorUtils", X1D.LIZIZ(LIZ));
    }

    public static final void onAnimationStart$4(ALAdapterS0S0100000_1 aLAdapterS0S0100000_1, Animator parentAnimation) {
        o.LJIIIZ(parentAnimation, "parentAnimation");
        C4S3 c4s3 = (C4S3) aLAdapterS0S0100000_1.l0;
        if (c4s3.LIZJ) {
            CardView cardView = c4s3.LJII;
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = c4s3.LIZ;
                cardView.setLayoutParams(marginLayoutParams);
                C4S3 c4s32 = (C4S3) aLAdapterS0S0100000_1.l0;
                c4s32.LJII.startAnimation(c4s32.LJIIIIZZ);
                ((C4S3) aLAdapterS0S0100000_1.l0).LJII.setVisibility(0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        c4s3.LJIILL.startAnimation(c4s3.LJIIJ);
        ((C4S3) aLAdapterS0S0100000_1.l0).LJIILL.setVisibility(0);
    }
}
