package X;

import android.view.animation.Animation;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WLH implements Animation.AnimationListener {
    public final /* synthetic */ C29901Fi LIZ;
    public final /* synthetic */ boolean LIZIZ;

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
        this.LIZ.LJII(new WLF(this.LIZIZ, true));
    }

    public WLH(boolean z, C29901Fi c29901Fi) {
        this.LIZ = c29901Fi;
        this.LIZIZ = z;
    }
}
