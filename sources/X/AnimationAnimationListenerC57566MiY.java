package X;

import android.view.animation.Animation;

/* renamed from: X.MiY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class AnimationAnimationListenerC57566MiY implements Animation.AnimationListener {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C57568Mia LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.LIZ) {
            this.LIZIZ.getClass();
            this.LIZIZ.LIZJ();
        } else {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
            if (interfaceC65784Pro == null) {
                return;
            }
            interfaceC65784Pro.invoke();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (!this.LIZ) {
            this.LIZIZ.LIZLLL();
            this.LIZIZ.getClass();
        }
    }

    public AnimationAnimationListenerC57566MiY(boolean z, C57568Mia c57568Mia, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = z;
        this.LIZIZ = c57568Mia;
        this.LIZJ = interfaceC65784Pro;
    }
}
