package Y;

import X.C16O;
import X.C16P;
import X.InterfaceC65784Pro;
import android.animation.Animator;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDAListenerS35S0200000 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$1(IDAListenerS35S0200000 iDAListenerS35S0200000, Animator animator) {
    }

    public static final void onAnimationEnd$1(IDAListenerS35S0200000 iDAListenerS35S0200000, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                onAnimationCancel$1(this, animator);
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
            default:
                return;
        }
    }

    public static final void onAnimationCancel$0(IDAListenerS35S0200000 iDAListenerS35S0200000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((InterfaceC65784Pro) iDAListenerS35S0200000.l1).invoke();
    }

    public static final void onAnimationEnd$0(IDAListenerS35S0200000 iDAListenerS35S0200000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((InterfaceC65784Pro) iDAListenerS35S0200000.l0).invoke();
    }

    public static final void onAnimationRepeat$1(IDAListenerS35S0200000 iDAListenerS35S0200000, Animator animator) {
        ((C16P) iDAListenerS35S0200000.l1).LIZ(1.0f, (C16O) iDAListenerS35S0200000.l0, true);
        C16O c16o = (C16O) iDAListenerS35S0200000.l0;
        c16o.LJIIJ = c16o.LJ;
        c16o.LJIIJJI = c16o.LJFF;
        c16o.LJIIL = c16o.LJI;
        c16o.LIZ((c16o.LJIIIZ + 1) % c16o.LJIIIIZZ.length);
        C16P c16p = (C16P) iDAListenerS35S0200000.l1;
        if (c16p.LJLJJLL) {
            c16p.LJLJJLL = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            C16O c16o2 = (C16O) iDAListenerS35S0200000.l0;
            if (c16o2.LJIILIIL) {
                c16o2.LJIILIIL = false;
                return;
            }
            return;
        }
        c16p.LJLJJL += 1.0f;
    }

    public static final void onAnimationStart$1(IDAListenerS35S0200000 iDAListenerS35S0200000, Animator animator) {
        ((C16P) iDAListenerS35S0200000.l1).LJLJJL = 0.0f;
    }

    public IDAListenerS35S0200000(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
