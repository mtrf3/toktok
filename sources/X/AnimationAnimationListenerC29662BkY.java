package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.BkY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AnimationAnimationListenerC29662BkY implements Animation.AnimationListener {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ int LIZIZ = 8;
    public final /* synthetic */ C29656BkS LIZJ;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.LIZ.setVisibility(this.LIZIZ);
        this.LIZJ.LJLLILLLL();
    }

    public AnimationAnimationListenerC29662BkY(View view, C29656BkS c29656BkS) {
        this.LIZ = view;
        this.LIZJ = c29656BkS;
    }
}
