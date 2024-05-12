package X;

import android.view.animation.Animation;

/* renamed from: X.YAa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C86936YAa extends AnimationAnimationListenerC86940YAe {
    public final /* synthetic */ YAY LIZ;

    public C86936YAa(YAY yay) {
        this.LIZ = yay;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        YAY yay = this.LIZ;
        yay.LJLJLLL = yay.LJLZ;
        yay.LJZ = EnumC84367X9f.REFRESHING;
    }
}
