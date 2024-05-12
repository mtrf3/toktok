package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.0l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16650l3 {
    public final WeakReference<View> LIZ;

    public final void LIZIZ() {
        View view = this.LIZ.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void LJ() {
        View view = this.LIZ.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C16650l3(View view) {
        this.LIZ = new WeakReference<>(view);
    }

    public final void LIZ(float f) {
        View view = this.LIZ.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void LIZJ(long j) {
        View view = this.LIZ.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void LIZLLL(final InterfaceC16660l4 interfaceC16660l4) {
        final View view = this.LIZ.get();
        if (view != null) {
            if (interfaceC16660l4 != null) {
                view.animate().setListener(new AnimatorListenerAdapter() { // from class: X.0l0
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        InterfaceC16660l4.this.LJIIIIZZ(view);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        InterfaceC16660l4.this.LIZ();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        InterfaceC16660l4.this.LJIIJ();
                    }
                });
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void LJFF(float f) {
        View view = this.LIZ.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
