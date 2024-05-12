package X;

import Y.ARunnableS24S0200000_5;
import android.animation.Animator;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C9A implements Animator.AnimatorListener {
    public final /* synthetic */ LiveCenterEntranceWidget LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        C47121t6 c47121t6 = this.LJLIL.LJLLLLLL;
        if (c47121t6 != null) {
            c47121t6.setText(LiveCenterEntranceWidget.LJZL(this.LJLILLLLZI));
            C9H c9h = this.LJLIL.LLFF;
            if (c9h != null) {
                c9h.LJI = false;
                OSZ<Integer, Integer> poll = c9h.LJFF.poll();
                if (poll == null) {
                    return;
                }
                c9h.LJI = true;
                C15610jN.LIZJ(new ARunnableS24S0200000_5(c9h, poll, 77), 1000L);
                return;
            }
            return;
        }
        o.LJIJI("violationText");
        throw null;
    }

    public C9A(LiveCenterEntranceWidget liveCenterEntranceWidget, int i) {
        this.LJLIL = liveCenterEntranceWidget;
        this.LJLILLLLZI = i;
    }
}
