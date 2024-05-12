package X;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.YdV, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87829YdV extends C87797Ycz {
    public final /* synthetic */ C87819YdL LJLIL;

    public C87829YdV(C87819YdL c87819YdL) {
        this.LJLIL = c87819YdL;
    }

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        ViewGroup viewGroup = this.LJLIL.LJIILL;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            ImageView imageView = this.LJLIL.LJIJJLI;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.LJLIL.LJ.setVisibility(0);
                this.LJLIL.LJII(false);
                this.LJLIL.LIZ();
                return;
            }
            o.LJIJI("numArrow");
            throw null;
        }
        o.LJIJI("numContainer");
        throw null;
    }
}
