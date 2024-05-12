package X;

import android.animation.ValueAnimator;
import com.google.ar.core.InstallActivity;

/* renamed from: X.aSR, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93535aSR implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InstallActivity LJLJJI;

    public C93535aSR(InstallActivity installActivity, int i, int i2, int i3) {
        this.LJLJJI = installActivity;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        float f = this.LJLILLLLZI * animatedFraction2;
        this.LJLJJI.getWindow().setLayout((int) ((this.LJLIL * animatedFraction) + f), (int) ((this.LJLJI * animatedFraction) + f));
        this.LJLJJI.getWindow().getDecorView().refreshDrawableState();
    }
}
