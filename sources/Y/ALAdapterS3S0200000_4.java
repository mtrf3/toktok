package Y;

import X.AAY;
import X.C247279n9;
import X.C250999t9;
import X.C29701Eo;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import com.bytedance.touchpoint.core.model.Animation;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ALAdapterS3S0200000_4 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationCancel$0(this, animator);
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
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS3S0200000_4 aLAdapterS3S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aLAdapterS3S0200000_4.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(3);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0200000_4 aLAdapterS3S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AAY) aLAdapterS3S0200000_4.l0).setVisibility(8);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS3S0200000_4.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0200000_4 aLAdapterS3S0200000_4, Animator animator) {
        RelativeLayout relativeLayout = ((VideoViewCell) aLAdapterS3S0200000_4.l1).LLF;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        ((ViewPropertyAnimator) aLAdapterS3S0200000_4.l0).setListener(null);
    }

    public static final void onAnimationEnd$2(ALAdapterS3S0200000_4 aLAdapterS3S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (((InterfaceC88472Yns) aLAdapterS3S0200000_4.l1) != null) {
            if (((C250999t9) aLAdapterS3S0200000_4.l0).getHasBreathLottie()) {
                ((C250999t9) aLAdapterS3S0200000_4.l0).getLottieView().setVisibility(8);
                ((C250999t9) aLAdapterS3S0200000_4.l0).getBreathLottieView().setVisibility(0);
            }
            ((InterfaceC88472Yns) aLAdapterS3S0200000_4.l1).invoke(2);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS3S0200000_4 aLAdapterS3S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29701Eo c29701Eo = ((C247279n9) aLAdapterS3S0200000_4.l0).LJIIJ;
        if (c29701Eo != null) {
            Animation animation2 = (Animation) aLAdapterS3S0200000_4.l1;
            c29701Eo.setMinAndMaxFrame(animation2.transitionFrame, animation2.endFrame);
        }
        C29701Eo c29701Eo2 = ((C247279n9) aLAdapterS3S0200000_4.l0).LJIIJ;
        if (c29701Eo2 != null) {
            c29701Eo2.setRepeatCount(-1);
        }
        C29701Eo c29701Eo3 = ((C247279n9) aLAdapterS3S0200000_4.l0).LJIIJ;
        if (c29701Eo3 != null) {
            c29701Eo3.removeAllAnimatorListeners();
        }
        C29701Eo c29701Eo4 = ((C247279n9) aLAdapterS3S0200000_4.l0).LJIIJ;
        if (c29701Eo4 != null) {
            c29701Eo4.playAnimation();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS3S0200000_4 aLAdapterS3S0200000_4, Animator animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aLAdapterS3S0200000_4.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(1);
        }
    }

    public ALAdapterS3S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
