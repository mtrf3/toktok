package Y;

import X.C0CM;
import X.C0CO;
import X.C0CP;
import X.C29191Cp;
import X.C45804HyK;
import X.C81081Vrx;
import X.KOV;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDAListenerS44S0200000_14 implements Animator.AnimatorListener {
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
            default:
                return;
        }
    }

    public static final void onAnimationEnd$0(IDAListenerS44S0200000_14 iDAListenerS44S0200000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C81081Vrx.LIZJ((Matrix) iDAListenerS44S0200000_14.l0);
        Activity LJIJJ = C45804HyK.LJIJJ((Context) iDAListenerS44S0200000_14.l1);
        if (LJIJJ != null) {
            LJIJJ.finish();
        }
    }

    public static final void onAnimationEnd$1(IDAListenerS44S0200000_14 iDAListenerS44S0200000_14, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C0CO c0co = ((KOV) iDAListenerS44S0200000_14.l0).LJLJJL.LJLLL;
        C29191Cp c29191Cp = c0co.LIZIZ;
        if (!c29191Cp.LJLLJ) {
            return;
        }
        int i = c29191Cp.LJLJJLL;
        c29191Cp.LJLLJ = false;
        c29191Cp.LJIJJ();
        C0CP c0cp = c29191Cp.LJLJL;
        if (c0cp.LIZJ == 0) {
            int i2 = c0cp.LIZ;
            if (i2 != c29191Cp.LJLJLJ) {
                c29191Cp.LJIILLIIL(i2);
            }
            c29191Cp.LJIIZILJ(0);
            c29191Cp.LJIJ();
        } else {
            c29191Cp.LJIIZILJ(2);
        }
        VelocityTracker velocityTracker = c0co.LIZLLL;
        velocityTracker.computeCurrentVelocity(1000, c0co.LJ);
        if (c0co.LIZJ.LJJJI((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return;
        }
        C0CM c0cm = c0co.LIZ;
        View LJFF = c0cm.LJLLI.LJFF(c0cm.LJLJL);
        if (LJFF == null) {
            return;
        }
        int[] LIZJ = c0cm.LJLLI.LIZJ(c0cm.LJLJL, LJFF);
        int i3 = LIZJ[0];
        if (i3 == 0 && LIZJ[1] == 0) {
            return;
        }
        c0cm.LJLL.LJLIIIL(i3, LIZJ[1]);
    }

    public static final void onAnimationStart$1(IDAListenerS44S0200000_14 iDAListenerS44S0200000_14, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C0CO c0co = ((KOV) iDAListenerS44S0200000_14.l1).LJLJJL.LJLLL;
        if (c0co.LIZIZ.LJLJJLL == 1) {
            return;
        }
        c0co.LJI = 0;
        c0co.LJFF = 0;
        c0co.LJII = SystemClock.uptimeMillis();
        VelocityTracker velocityTracker = c0co.LIZLLL;
        if (velocityTracker == null) {
            c0co.LIZLLL = VelocityTracker.obtain();
            c0co.LJ = ViewConfiguration.get(c0co.LIZ.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        C29191Cp c29191Cp = c0co.LIZIZ;
        c29191Cp.LJLJJL = 4;
        c29191Cp.LJIJI(true);
        if (c0co.LIZIZ.LJLJJLL != 0) {
            c0co.LIZJ.LJLJJI();
        }
        long j = c0co.LJII;
        MotionEvent obtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
        c0co.LIZLLL.addMovement(obtain);
        obtain.recycle();
    }

    public IDAListenerS44S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
