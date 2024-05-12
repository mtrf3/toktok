package X;

import android.view.animation.Animation;

/* loaded from: classes16.dex */
public class YAZ extends AnimationAnimationListenerC86940YAe {
    public final /* synthetic */ YAY LIZ;

    public YAZ(YAY yay) {
        this.LIZ = yay;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        YAY yay = this.LIZ;
        yay.LJLJLLL = 0;
        yay.LJZ = EnumC84367X9f.NORMAL;
        yay.LJZI = false;
        InterfaceC86939YAd interfaceC86939YAd = yay.LJLJI;
        if (interfaceC86939YAd != null) {
            interfaceC86939YAd.LIZ();
        }
    }
}
