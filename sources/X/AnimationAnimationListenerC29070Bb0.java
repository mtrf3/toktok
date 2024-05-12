package X;

import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.AqS155S0100000_5;

/* renamed from: X.Bb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AnimationAnimationListenerC29070Bb0 implements Animation.AnimationListener {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C29306Beo.LJI(this.LIZ);
        this.LIZIZ.invoke();
    }

    public AnimationAnimationListenerC29070Bb0(View view, AqS155S0100000_5 aqS155S0100000_5) {
        this.LIZ = view;
        this.LIZIZ = aqS155S0100000_5;
    }
}
