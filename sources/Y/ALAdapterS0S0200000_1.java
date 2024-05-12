package Y;

import X.C1047549f;
import X.C115674gN;
import X.C115684gO;
import X.C117364j6;
import X.C117374j7;
import X.C119894nB;
import X.C17N;
import X.C232629Ba;
import X.C29701Eo;
import X.C34B;
import X.C4S3;
import X.InterfaceC65784Pro;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ALAdapterS0S0200000_1 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationCancel$0(this, animator);
                return;
            case 3:
                onAnimationCancel$1(this, animator);
                return;
            case 4:
                onAnimationCancel$2(this, animator);
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
                o.LJIIIZ(animator, "animation");
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                return;
            case 2:
                onAnimationStart$1(this, animator);
                return;
            case 3:
                onAnimationStart$2(this, animator);
                return;
            case 4:
                onAnimationStart$3(this, animator);
                return;
            case 5:
                onAnimationStart$4(this, animator);
                return;
            case 6:
            default:
                super.onAnimationStart(animator);
                return;
            case 7:
                onAnimationStart$5(this, animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C117374j7 c117374j7 = (C117374j7) aLAdapterS0S0200000_1.l0;
        View view = ((RecyclerView.ViewHolder) aLAdapterS0S0200000_1.l1).itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        c117374j7.getClass();
        C117374j7.LJJIIJZLJL(view);
    }

    public static final void onAnimationCancel$1(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C117374j7 c117374j7 = (C117374j7) aLAdapterS0S0200000_1.l0;
        View view = ((RecyclerView.ViewHolder) aLAdapterS0S0200000_1.l1).itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        c117374j7.getClass();
        C117374j7.LJJIIJZLJL(view);
    }

    public static final void onAnimationCancel$2(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((RecyclerView.ViewHolder) aLAdapterS0S0200000_1.l1).itemView.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C115674gN c115674gN = C115674gN.LIZ;
        C232629Ba c232629Ba = (C232629Ba) aLAdapterS0S0200000_1.l0;
        C115684gO c115684gO = (C115684gO) aLAdapterS0S0200000_1.l1;
        c115674gN.getClass();
        C115674gN.LIZLLL(c232629Ba, c115684gO);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        InterfaceC65784Pro interfaceC65784Pro;
        o.LJIIIZ(animation, "animation");
        C17N.LJJIIJZLJL(((C1047549f) aLAdapterS0S0200000_1.l0).LLF);
        C34B.LJI("UnreadMessageTips", "hideUnreadMessageTips: onAnimationEnd");
        C1047549f c1047549f = (C1047549f) aLAdapterS0S0200000_1.l0;
        c1047549f.LLIIIJ = true;
        c1047549f.LLIFFJFJJ = null;
        if (!c1047549f.LLIIIILZ && (interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS0S0200000_1.l1) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        animation.getListeners().remove(aLAdapterS0S0200000_1);
        C117374j7 c117374j7 = (C117374j7) aLAdapterS0S0200000_1.l0;
        View view = ((RecyclerView.ViewHolder) aLAdapterS0S0200000_1.l1).itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        c117374j7.getClass();
        C117374j7.LJJIIJZLJL(view);
        ((C117374j7) aLAdapterS0S0200000_1.l0).LJIL((RecyclerView.ViewHolder) aLAdapterS0S0200000_1.l1);
        C117374j7 c117374j72 = (C117374j7) aLAdapterS0S0200000_1.l0;
        if (!c117374j72.LJIILJJIL()) {
            c117374j72.LJIIIIZZ();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        animation.getListeners().remove(aLAdapterS0S0200000_1);
        C117374j7 c117374j7 = (C117374j7) aLAdapterS0S0200000_1.l0;
        View view = ((RecyclerView.ViewHolder) aLAdapterS0S0200000_1.l1).itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        c117374j7.getClass();
        C117374j7.LJJIIJZLJL(view);
        ((C117374j7) aLAdapterS0S0200000_1.l0).LJII((RecyclerView.ViewHolder) aLAdapterS0S0200000_1.l1);
        C117374j7 c117374j72 = (C117374j7) aLAdapterS0S0200000_1.l0;
        if (!c117374j72.LJIILJJIL()) {
            c117374j72.LJIIIIZZ();
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ArrayList<Animator.AnimatorListener> listeners = animation.getListeners();
        if (listeners != null) {
            listeners.remove(aLAdapterS0S0200000_1);
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) aLAdapterS0S0200000_1.l0).removeAnimatorListener(aLAdapterS0S0200000_1);
        ((InterfaceC65784Pro) aLAdapterS0S0200000_1.l1).invoke();
    }

    public static final void onAnimationStart$0(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C34B.LJI("UnreadMessageTips", "hideUnreadMessageTips: onAnimationStart");
    }

    public static final void onAnimationStart$1(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C117374j7) aLAdapterS0S0200000_1.l0).getClass();
    }

    public static final void onAnimationStart$2(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C117374j7) aLAdapterS0S0200000_1.l0).getClass();
    }

    public static final void onAnimationStart$3(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C117364j6) aLAdapterS0S0200000_1.l0).getClass();
    }

    public static final void onAnimationStart$4(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, final Animator outAnimation) {
        o.LJIIIZ(outAnimation, "outAnimation");
        C4S3 c4s3 = (C4S3) aLAdapterS0S0200000_1.l0;
        if (c4s3.LIZJ) {
            c4s3.LJII.startAnimation(c4s3.LJIIIZ);
        }
        Animation animation = ((C4S3) aLAdapterS0S0200000_1.l0).LJIIJJI;
        final Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aLAdapterS0S0200000_1.l1;
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: X.4S4
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation2) {
                o.LJIIIZ(animation2, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation2) {
                o.LJIIIZ(animation2, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation2) {
                o.LJIIIZ(animation2, "animation");
                animatorListener.onAnimationEnd(outAnimation);
            }
        });
        C4S3 c4s32 = (C4S3) aLAdapterS0S0200000_1.l0;
        c4s32.LJIILL.startAnimation(c4s32.LJIIJJI);
    }

    public static final void onAnimationStart$5(ALAdapterS0S0200000_1 aLAdapterS0S0200000_1, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View underView = ((C119894nB) aLAdapterS0S0200000_1.l0).getUnderView();
        if (underView != null) {
            C119894nB c119894nB = (C119894nB) aLAdapterS0S0200000_1.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aLAdapterS0S0200000_1.l1;
            ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
            layoutParams.height = c119894nB.getHeight() + underView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            underView.setLayoutParams(layoutParams);
        }
    }

    public ALAdapterS0S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
