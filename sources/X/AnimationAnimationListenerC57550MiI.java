package X;

import android.view.animation.Animation;
import kotlin.jvm.internal.o;

/* renamed from: X.MiI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class AnimationAnimationListenerC57550MiI implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC57546MiE LIZ;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        o.LJIIIZ(animation, "animation");
    }

    public AnimationAnimationListenerC57550MiI(ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE) {
        this.LIZ = viewOnClickListenerC57546MiE;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        o.LJIIIZ(animation, "animation");
        this.LIZ.P().setVisibility(8);
    }
}
