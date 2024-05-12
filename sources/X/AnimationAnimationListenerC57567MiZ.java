package X;

import android.view.animation.Animation;

/* renamed from: X.MiZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class AnimationAnimationListenerC57567MiZ implements Animation.AnimationListener {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C57569Mib LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        if (this.LIZ) {
            this.LIZIZ.LIZJ();
            this.LIZIZ.getClass();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (!this.LIZ) {
            this.LIZIZ.getClass();
            this.LIZIZ.LIZLLL();
        }
    }

    public AnimationAnimationListenerC57567MiZ(boolean z, C57569Mib c57569Mib, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = z;
        this.LIZIZ = c57569Mib;
        this.LIZJ = interfaceC65784Pro;
    }
}
