package Y;

import X.C15610jN;
import X.C29746Blu;
import X.C31538CZi;
import X.C32001ChB;
import X.C47061t0;
import X.InterfaceC29768BmG;
import X.InterfaceC31571CaF;
import X.KL2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDAListenerS39S0200000_5 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animator");
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
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
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animator");
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                onAnimationStart$2(this, animator);
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animator");
                return;
            case 5:
                onAnimationStart$5(this, animator);
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            default:
                return;
        }
    }

    public IDAListenerS39S0200000_5(C29746Blu c29746Blu, int i) {
        this.$t = i;
        this.l0 = c29746Blu;
        this.l1 = null;
    }

    public static final void onAnimationEnd$0(IDAListenerS39S0200000_5 iDAListenerS39S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C15610jN.LIZ().postDelayed(new ARunnableS24S0200000_5((LivePlayFragment) iDAListenerS39S0200000_5.l0, (LivePlayFragment) iDAListenerS39S0200000_5.l1, 70), 3000L);
    }

    public static final void onAnimationEnd$1(IDAListenerS39S0200000_5 iDAListenerS39S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        KL2.LJIILLIIL(8, ((C29746Blu) iDAListenerS39S0200000_5.l0).LJJII);
        InterfaceC29768BmG interfaceC29768BmG = (InterfaceC29768BmG) iDAListenerS39S0200000_5.l1;
        if (interfaceC29768BmG != null) {
            interfaceC29768BmG.LIZ();
        }
    }

    public static final void onAnimationEnd$2(IDAListenerS39S0200000_5 iDAListenerS39S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AnimatorSet) iDAListenerS39S0200000_5.l1).start();
    }

    public static final void onAnimationEnd$3(IDAListenerS39S0200000_5 iDAListenerS39S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C47061t0) iDAListenerS39S0200000_5.l0).setVisibility(8);
        ((C32001ChB) iDAListenerS39S0200000_5.l1).LJLJI = false;
    }

    public static final void onAnimationEnd$4(IDAListenerS39S0200000_5 iDAListenerS39S0200000_5, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C31538CZi) iDAListenerS39S0200000_5.l0).LJLLILLLL = new AnimatorSet();
        AnimatorSet animatorSet = ((C31538CZi) iDAListenerS39S0200000_5.l0).LJLLILLLL;
        if (animatorSet != null) {
            animatorSet.setDuration(300L);
        }
        AnimatorSet animatorSet2 = ((C31538CZi) iDAListenerS39S0200000_5.l0).LJLLILLLL;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(new LinearInterpolator());
        }
        C31538CZi c31538CZi = (C31538CZi) iDAListenerS39S0200000_5.l0;
        c31538CZi.LJLL = ObjectAnimator.ofFloat(c31538CZi, (Property<C31538CZi, Float>) View.SCALE_X, 1.2f, 1.0f);
        C31538CZi c31538CZi2 = (C31538CZi) iDAListenerS39S0200000_5.l0;
        c31538CZi2.LJLJLLL = ObjectAnimator.ofFloat(c31538CZi2, (Property<C31538CZi, Float>) View.SCALE_Y, 1.2f, 1.0f);
        C31538CZi c31538CZi3 = (C31538CZi) iDAListenerS39S0200000_5.l0;
        AnimatorSet animatorSet3 = c31538CZi3.LJLLILLLL;
        if (animatorSet3 != null) {
            animatorSet3.playTogether(c31538CZi3.LJLL, c31538CZi3.LJLJLLL);
        }
        View view = (View) iDAListenerS39S0200000_5.l1;
        if (view != null) {
            view.postDelayed(new ARunnableS41S0100000_5((C31538CZi) iDAListenerS39S0200000_5.l0, 319), 600L);
        }
    }

    public static final void onAnimationEnd$5(IDAListenerS39S0200000_5 iDAListenerS39S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AnimatorSet) iDAListenerS39S0200000_5.l1).start();
    }

    public static final void onAnimationEnd$6(IDAListenerS39S0200000_5 iDAListenerS39S0200000_5, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((ViewGroup.MarginLayoutParams) iDAListenerS39S0200000_5.l0).topMargin = ((BaseCommentPinnedWidget) iDAListenerS39S0200000_5.l1).LLFZ();
        ((BaseCommentPinnedWidget) iDAListenerS39S0200000_5.l1).LLFF().setLayoutParams((ViewGroup.MarginLayoutParams) iDAListenerS39S0200000_5.l0);
        ((BaseCommentPinnedWidget) iDAListenerS39S0200000_5.l1).LLFFF().setAlpha(1.0f);
        ((BaseCommentPinnedWidget) iDAListenerS39S0200000_5.l1).LLFF().setVisibility(8);
        ((BaseCommentPinnedWidget) iDAListenerS39S0200000_5.l1).LLFFF().setVisibility(8);
    }

    public static final void onAnimationStart$2(IDAListenerS39S0200000_5 iDAListenerS39S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C47061t0) iDAListenerS39S0200000_5.l0).setVisibility(0);
    }

    public static final void onAnimationStart$5(IDAListenerS39S0200000_5 iDAListenerS39S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC31571CaF) iDAListenerS39S0200000_5.l0).LIZIZ();
    }

    public IDAListenerS39S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
