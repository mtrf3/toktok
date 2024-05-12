package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JE4 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ JE2 LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        JE2 je2;
        View view;
        Handler handler;
        View view2;
        o.LJIIIZ(animation, "animation");
        if (!this.LJLIL && (view2 = this.LJLILLLLZI.LJLILLLLZI) != null) {
            view2.setVisibility(4);
        }
        if (this.LJLIL && (view = (je2 = this.LJLILLLLZI).LJLILLLLZI) != null && (handler = view.getHandler()) != null) {
            handler.removeCallbacks(je2.LJLLLL);
            handler.postDelayed(je2.LJLLLL, 2000L);
        }
    }

    public JE4(boolean z, JE2 je2) {
        this.LJLIL = z;
        this.LJLILLLLZI = je2;
    }
}
