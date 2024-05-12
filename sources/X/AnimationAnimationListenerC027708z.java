package X;

import Y.IDRunnableS85S0100000;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;

/* renamed from: X.08z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC027708z implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup LIZ;
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ InterfaceC026608o LIZJ;
    public final /* synthetic */ C10610bJ LIZLLL;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.LIZ.post(new IDRunnableS85S0100000(this, 22));
    }

    public AnimationAnimationListenerC027708z(ViewGroup viewGroup, Fragment fragment, C28771Az c28771Az, C10610bJ c10610bJ) {
        this.LIZ = viewGroup;
        this.LIZIZ = fragment;
        this.LIZJ = c28771Az;
        this.LIZLLL = c10610bJ;
    }
}
