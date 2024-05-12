package X;

import android.view.View;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Hye, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class AnimationAnimationListenerC45824Hye implements Animation.AnimationListener {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ InterfaceC65784Pro LIZIZ;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        o.LJIIIZ(animation, "animation");
        this.LIZ.clearAnimation();
        this.LIZIZ.invoke();
    }

    public AnimationAnimationListenerC45824Hye(ConstraintLayout constraintLayout, AqS163S0100000_13 aqS163S0100000_13) {
        this.LIZ = constraintLayout;
        this.LIZIZ = aqS163S0100000_13;
    }
}
