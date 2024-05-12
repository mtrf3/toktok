package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LSZ extends AnimatorListenerAdapter {
    public final /* synthetic */ View LJLIL;

    public LSZ(C47061t0 c47061t0) {
        this.LJLIL = c47061t0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        View view = this.LJLIL;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.LJLIL;
        if (view2 == null) {
            return;
        }
        view2.setAlpha(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation, boolean z) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation, z);
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }
}
