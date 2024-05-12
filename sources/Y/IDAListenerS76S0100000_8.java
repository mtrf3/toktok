package Y;

import X.C45804HyK;
import X.C46579IPv;
import X.C48740JAy;
import X.InterfaceC65784Pro;
import X.KUP;
import X.LFH;
import X.S0A;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.WelcomeVideoPlayerDialogFragment;
import com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDAListenerS76S0100000_8 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$1(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animator) {
    }

    public static final void onAnimationRepeat$1(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animator) {
    }

    public static final void onAnimationStart$1(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                onAnimationCancel$1(this, animator);
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                onAnimationCancel$4(this, animator);
                return;
            case 5:
                onAnimationCancel$5(this, animator);
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
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                onAnimationRepeat$1(this, animator);
                return;
            case 2:
                o.LJIIIZ(animator, "animation");
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
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
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    public IDAListenerS76S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$4(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animation) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        LinearLayout linearLayout = ((C48740JAy) iDAListenerS76S0100000_8.l0).LIZLLL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        View view = ((C48740JAy) iDAListenerS76S0100000_8.l0).LIZJ;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -2;
    }

    public static final void onAnimationCancel$5(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        TuxTextView tuxTextView = ((BaseAutoScrollUIComponent) iDAListenerS76S0100000_8.l0).LJLJJLL;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        ((BaseAutoScrollUIComponent) iDAListenerS76S0100000_8.l0).LJLJJL = false;
        LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZLLL().LJII(false);
    }

    public static final void onAnimationEnd$0(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((InterfaceC65784Pro) iDAListenerS76S0100000_8.l0).invoke();
    }

    public static final void onAnimationEnd$1(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animator) {
        ((KUP) iDAListenerS76S0100000_8.l0).getClass();
    }

    public static final void onAnimationEnd$2(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((WelcomeVideoPlayerDialogFragment) iDAListenerS76S0100000_8.l0).dismiss();
        ((WelcomeVideoPlayerDialogFragment) iDAListenerS76S0100000_8.l0).onDestroy();
        ((WelcomeVideoPlayerDialogFragment) iDAListenerS76S0100000_8.l0).getClass();
    }

    public static final void onAnimationEnd$4(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animation) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        LinearLayout linearLayout = ((C48740JAy) iDAListenerS76S0100000_8.l0).LIZLLL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        View view = ((C48740JAy) iDAListenerS76S0100000_8.l0).LIZJ;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -2;
    }

    public static final void onAnimationEnd$5(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animation) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        TuxTextView tuxTextView = ((BaseAutoScrollUIComponent) iDAListenerS76S0100000_8.l0).LJLJJLL;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        BaseAutoScrollUIComponent baseAutoScrollUIComponent = (BaseAutoScrollUIComponent) iDAListenerS76S0100000_8.l0;
        baseAutoScrollUIComponent.LJLJJL = false;
        View view = baseAutoScrollUIComponent.LJLJLJ;
        Integer num = null;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            TuxIconView tuxIconView = ((BaseAutoScrollUIComponent) iDAListenerS76S0100000_8.l0).LJLJL;
            if (tuxIconView != null) {
                num = Integer.valueOf(tuxIconView.getWidth());
            }
            layoutParams.width = num.intValue();
        }
        LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZLLL().LJII(false);
    }

    public static final void onAnimationStart$2(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C46579IPv c46579IPv = ((WelcomeVideoPlayerDialogFragment) iDAListenerS76S0100000_8.l0).LJLJI;
        if (c46579IPv != null) {
            c46579IPv.LIZIZ();
        }
    }

    public static final void onAnimationStart$3(IDAListenerS76S0100000_8 iDAListenerS76S0100000_8, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C45804HyK.LJJLL(((S0A) iDAListenerS76S0100000_8.l0).LIZ(R.id.a3s));
    }
}
