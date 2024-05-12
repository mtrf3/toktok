package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.Blz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29751Blz extends AnimatorListenerAdapter {
    public final /* synthetic */ C29746Blu LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        ViewGroup viewGroup;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ConstraintLayout constraintLayout = this.LJLIL.LJIILJJIL;
        if (constraintLayout != null) {
            constraintLayout.setClipChildren(false);
        }
        ViewGroup viewGroup2 = this.LJLIL.LJIIJ;
        ViewParent viewParent = null;
        if (viewGroup2 != null) {
            viewParent = viewGroup2.getParent();
        }
        if (!(viewParent instanceof ViewGroup) || (viewGroup = (ViewGroup) viewParent) == null) {
            return;
        }
        viewGroup.setClipChildren(this.LJLILLLLZI);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C29746Blu c29746Blu = this.LJLIL;
        c29746Blu.LJIILL(false, c29746Blu.LJJIJ);
    }

    public C29751Blz(C29746Blu c29746Blu, boolean z) {
        this.LJLIL = c29746Blu;
        this.LJLILLLLZI = z;
    }
}
