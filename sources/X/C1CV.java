package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1CV, reason: invalid class name */
/* loaded from: classes.dex */
public class C1CV extends AnimatorListenerAdapter implements InterfaceC03480Bs {
    public final View LJLIL;
    public final int LJLILLLLZI;
    public final ViewGroup LJLJI;
    public final boolean LJLJJI = true;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC03480Bs
    public final void LIZIZ(AbstractC03490Bt abstractC03490Bt) {
    }

    @Override // X.InterfaceC03480Bs
    public final void LJ(C1CW c1cw) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // X.InterfaceC03480Bs
    public final void LIZJ(AbstractC03490Bt abstractC03490Bt) {
        if (!this.LJLJJLL) {
            View view = this.LJLIL;
            C03930Dl.LIZ.LJJJJJ(this.LJLILLLLZI, view);
            ViewGroup viewGroup = this.LJLJI;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        LJI(false);
        abstractC03490Bt.LJIL(this);
    }

    @Override // X.InterfaceC03480Bs
    public final void LIZLLL(AbstractC03490Bt abstractC03490Bt) {
        LJI(true);
    }

    @Override // X.InterfaceC03480Bs
    public final void LJFF(AbstractC03490Bt abstractC03490Bt) {
        LJI(false);
    }

    public final void LJI(boolean z) {
        ViewGroup viewGroup;
        if (this.LJLJJI && this.LJLJJL != z && (viewGroup = this.LJLJI) != null) {
            this.LJLJJL = z;
            C03890Dh.LIZ(viewGroup, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LJLJJLL = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.LJLJJLL) {
            View view = this.LJLIL;
            C03930Dl.LIZ.LJJJJJ(this.LJLILLLLZI, view);
            ViewGroup viewGroup = this.LJLJI;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        LJI(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (!this.LJLJJLL) {
            View view = this.LJLIL;
            C03930Dl.LIZ.LJJJJJ(this.LJLILLLLZI, view);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.LJLJJLL) {
            C03930Dl.LIZ.LJJJJJ(0, this.LJLIL);
        }
    }

    public C1CV(int i, View view) {
        this.LJLIL = view;
        this.LJLILLLLZI = i;
        this.LJLJI = (ViewGroup) view.getParent();
        LJI(true);
    }
}
