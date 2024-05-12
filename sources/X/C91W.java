package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.91W, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C91W extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91W(float f, int i, long j) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View view) {
        final View it = view;
        o.LJIIIZ(it, "it");
        if (!C2302491w.LIZ() || !C91Y.LIZIZ.contains(Integer.valueOf(it.getId()))) {
            ViewPropertyAnimator duration = it.animate().alpha(this.LJLIL).setDuration(this.LJLILLLLZI);
            final int i = this.LJLJI;
            duration.setListener(new Animator.AnimatorListener(it, i) { // from class: X.91V
                public final View LJLIL;
                public final int LJLILLLLZI;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (this.LJLILLLLZI == 2 && DVX.LIZ()) {
                        this.LJLIL.setVisibility(4);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    if (this.LJLILLLLZI == 1 && DVX.LIZ()) {
                        this.LJLIL.setVisibility(0);
                    }
                }

                {
                    this.LJLIL = it;
                    this.LJLILLLLZI = i;
                }
            }).start();
        }
        return C76800UCe.LIZ;
    }
}
