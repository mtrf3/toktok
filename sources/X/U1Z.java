package X;

import Y.ARunnableS49S0100000_13;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U1Z extends AnimatorListenerAdapter {
    public final /* synthetic */ U1X LJLIL;

    public U1Z(U1X u1x) {
        this.LJLIL = u1x;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation, boolean z) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation, z);
        U1X u1x = this.LJLIL;
        int i2 = u1x.LJLILLLLZI;
        HorizontalScrollView horizontalScrollView = u1x.LJLLILLLL;
        if (horizontalScrollView != null) {
            i = horizontalScrollView.getWidth();
        } else {
            i = 0;
        }
        if (i2 > i) {
            C47121t6 c47121t6 = this.LJLIL.LJZI;
            if (c47121t6 != null) {
                layoutParams = c47121t6.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = this.LJLIL.LJLILLLLZI;
                }
            } else {
                layoutParams = null;
            }
            C47121t6 c47121t62 = this.LJLIL.LJZI;
            if (c47121t62 != null) {
                c47121t62.setLayoutParams(layoutParams);
            }
            U1X u1x2 = this.LJLIL;
            C47121t6 c47121t63 = u1x2.LJZI;
            if (c47121t63 != null) {
                c47121t63.post(new ARunnableS49S0100000_13(u1x2, 108));
            }
        }
    }
}
