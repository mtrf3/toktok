package X;

import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UX8 implements Animation.AnimationListener {
    public final /* synthetic */ Animation LIZ;
    public final /* synthetic */ View LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro LIZJ;

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
        this.LIZ.setAnimationListener(null);
        this.LIZIZ.clearAnimation();
        this.LIZJ.invoke();
    }

    public UX8(Animation animation, View view, AqS160S0200000_13 aqS160S0200000_13) {
        this.LIZ = animation;
        this.LIZIZ = view;
        this.LIZJ = aqS160S0200000_13;
    }
}
