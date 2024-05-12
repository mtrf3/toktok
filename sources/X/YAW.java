package X;

import android.view.animation.Animation;
import kotlin.jvm.internal.AqS165S0100000_15;

/* loaded from: classes16.dex */
public final class YAW implements Animation.AnimationListener {
    public final /* synthetic */ YAV LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.LIZ.LIZJ.setVisibility(8);
        this.LIZIZ.invoke();
    }

    public YAW(YAV yav, AqS165S0100000_15 aqS165S0100000_15) {
        this.LIZ = yav;
        this.LIZIZ = aqS165S0100000_15;
    }
}
