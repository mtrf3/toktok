package Y;

import X.C018905p;
import X.C31811Ce7;
import X.C70653Ro9;
import X.C78996UzQ;
import X.InterfaceC65784Pro;
import X.T3J;
import X.X1D;
import X.XKQ;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.unityanimation.widget.EventAreaUnityAnimationWidget;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDAListenerS42S0200000_12 implements Animator.AnimatorListener {
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
                o.LJIIIZ(animator, "animator");
                return;
            case 3:
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
                o.LJIIIZ(animator, "animator");
                return;
            case 3:
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
                onAnimationStart$1(this, animator);
                return;
            case 2:
                o.LJIIIZ(animator, "animator");
                return;
            case 3:
                onAnimationStart$3(this, animator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationEnd$0(IDAListenerS42S0200000_12 iDAListenerS42S0200000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        EventAreaUnityAnimationWidget eventAreaUnityAnimationWidget = (EventAreaUnityAnimationWidget) iDAListenerS42S0200000_12.l0;
        T3J t3j = (T3J) iDAListenerS42S0200000_12.l1;
        eventAreaUnityAnimationWidget.LJZI().remove(t3j);
        XKQ xkq = t3j.LJLJJLL;
        if (xkq != null && !xkq.isCancelled()) {
            XKQ xkq2 = t3j.LJLJJLL;
            if (xkq2 != null) {
                xkq2.LIZIZ(null);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("canceled delay job:");
            C31811Ce7.LJ(LIZ, t3j.LJLIL, LIZ, "EventAreaUnityAnimationWidget");
        }
        eventAreaUnityAnimationWidget.LJLZ();
    }

    public static final void onAnimationEnd$1(IDAListenerS42S0200000_12 iDAListenerS42S0200000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) iDAListenerS42S0200000_12.l1).invoke();
    }

    public static final void onAnimationEnd$2(IDAListenerS42S0200000_12 iDAListenerS42S0200000_12, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C70653Ro9 c70653Ro9 = (C70653Ro9) iDAListenerS42S0200000_12.l0;
        TuxIconView tuxIconView = c70653Ro9.LJLIL;
        float f = c70653Ro9.LJLJI;
        float f2 = c70653Ro9.LJLJJI;
        float f3 = c70653Ro9.LJLJJL;
        C018905p c018905p = new C018905p((int) f, (int) f2);
        c018905p.startToStart = 0;
        c018905p.endToEnd = 0;
        c018905p.topToTop = 0;
        c018905p.bottomToBottom = 0;
        int i = (int) f3;
        c018905p.setMarginStart(i);
        c018905p.setMarginEnd(i);
        ((ViewGroup.MarginLayoutParams) c018905p).topMargin = i;
        ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = i;
        tuxIconView.setLayoutParams(c018905p);
        C70653Ro9 c70653Ro92 = (C70653Ro9) iDAListenerS42S0200000_12.l0;
        TuxTextView tuxTextView = (TuxTextView) iDAListenerS42S0200000_12.l1;
        if (C78996UzQ.LJJIIJZLJL(tuxTextView)) {
            C78996UzQ.LJI();
        }
        c70653Ro92.removeView(tuxTextView);
    }

    public static final void onAnimationEnd$3(IDAListenerS42S0200000_12 iDAListenerS42S0200000_12, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((AnimatorSet) iDAListenerS42S0200000_12.l0).start();
    }

    public static final void onAnimationStart$1(IDAListenerS42S0200000_12 iDAListenerS42S0200000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((InterfaceC65784Pro) iDAListenerS42S0200000_12.l0).invoke();
    }

    public static final void onAnimationStart$3(IDAListenerS42S0200000_12 iDAListenerS42S0200000_12, Animator animator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(animator, "animator");
        TuxIconView tuxIconView = ((C70653Ro9) iDAListenerS42S0200000_12.l1).LJLIL;
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams2 = marginLayoutParams;
        }
        tuxIconView.setLayoutParams(marginLayoutParams2);
    }

    public IDAListenerS42S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
