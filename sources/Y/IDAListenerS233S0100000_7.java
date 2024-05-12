package Y;

import X.C10K;
import X.C32151Nz;
import X.C41636GVs;
import X.C42041Gej;
import X.C44301Ha5;
import X.C90193gN;
import X.GVX;
import X.JVD;
import X.KL2;
import X.O6R;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.ParallelPublishDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishDialogFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDAListenerS233S0100000_7 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$1(IDAListenerS233S0100000_7 iDAListenerS233S0100000_7, Animation animation) {
    }

    public static final void onAnimationRepeat$2(IDAListenerS233S0100000_7 iDAListenerS233S0100000_7, Animation animation) {
    }

    public static final void onAnimationRepeat$3(IDAListenerS233S0100000_7 iDAListenerS233S0100000_7, Animation animation) {
    }

    public static final void onAnimationStart$1(IDAListenerS233S0100000_7 iDAListenerS233S0100000_7, Animation animation) {
    }

    public static final void onAnimationStart$2(IDAListenerS233S0100000_7 iDAListenerS233S0100000_7, Animation animation) {
    }

    public static final void onAnimationStart$3(IDAListenerS233S0100000_7 iDAListenerS233S0100000_7, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                return;
            case 1:
                onAnimationEnd$1(this, animation);
                return;
            case 2:
                onAnimationEnd$2(this, animation);
                return;
            case 3:
                onAnimationEnd$3(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animation, "animation");
                return;
            case 1:
                onAnimationRepeat$1(this, animation);
                return;
            case 2:
                onAnimationRepeat$2(this, animation);
                return;
            case 3:
                onAnimationRepeat$3(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animation, "animation");
                return;
            case 1:
                onAnimationStart$1(this, animation);
                return;
            case 2:
                onAnimationStart$2(this, animation);
                return;
            case 3:
                onAnimationStart$3(this, animation);
                return;
            default:
                return;
        }
    }

    public IDAListenerS233S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(IDAListenerS233S0100000_7 iDAListenerS233S0100000_7, Animation animation) {
        float f;
        o.LJIIIZ(animation, "animation");
        ((ParallelPublishDialogFragment) iDAListenerS233S0100000_7.l0).getClass();
        if (C90193gN.LIZ()) {
            f = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        } else {
            f = -O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 0, f, 1, 0.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        animationSet.setFillAfter(true);
        TextView textView = ((ParallelPublishDialogFragment) iDAListenerS233S0100000_7.l0).LJLJLLL;
        if (textView != null) {
            if (textView.getVisibility() == 0) {
                C10K.LJII(3000L).LJ(new AgS110S0200000_7((ParallelPublishDialogFragment) iDAListenerS233S0100000_7.l0, animationSet, 1), C10K.LJIIIIZZ, null);
                ((ParallelPublishDialogFragment) iDAListenerS233S0100000_7.l0).LJLLJ.setNeedShowAnim(false);
                ((ParallelPublishDialogFragment) iDAListenerS233S0100000_7.l0).LJLLJ.setMultiTaskRecover(false);
                return;
            }
            return;
        }
        o.LJIJI("autoUploadingText");
        throw null;
    }

    public static final void onAnimationEnd$1(IDAListenerS233S0100000_7 iDAListenerS233S0100000_7, Animation animation) {
        int i;
        PublishDialogFragment publishDialogFragment = (PublishDialogFragment) iDAListenerS233S0100000_7.l0;
        publishDialogFragment.getClass();
        if (C90193gN.LIZ()) {
            i = (int) KL2.LIZJ(publishDialogFragment.getContext(), 12.0f);
        } else {
            i = -((int) KL2.LIZJ(publishDialogFragment.getContext(), 12.0f));
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 0, i, 1, 0.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        animationSet.setFillAfter(true);
        TextView textView = ((PublishDialogFragment) iDAListenerS233S0100000_7.l0).LJLJJI;
        if (textView != null && textView.getVisibility() == 0) {
            C10K.LJII(3000L).LJ(new AgS110S0200000_7(iDAListenerS233S0100000_7, animationSet, 14), C10K.LJIIIIZZ, null);
            GVX.LIZIZ = false;
        }
    }

    public static final void onAnimationEnd$2(IDAListenerS233S0100000_7 iDAListenerS233S0100000_7, Animation animation) {
        ((C44301Ha5) ((ARunnableS43S0100000_7) iDAListenerS233S0100000_7.l0).l0).LJJLIIIJL(true);
    }

    public static final void onAnimationEnd$3(IDAListenerS233S0100000_7 iDAListenerS233S0100000_7, Animation animation) {
        TextView textView = ((C42041Gej) iDAListenerS233S0100000_7.l0).LJLL;
        if (textView != null) {
            textView.setVisibility(8);
            JVD.LIZ((C42041Gej) iDAListenerS233S0100000_7.l0, C41636GVs.LJLIL);
        } else {
            o.LJIJI("autoUploadingText");
            throw null;
        }
    }
}
