package X;

import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;

/* renamed from: X.XhL, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85519XhL implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ AvatarCutActivity LJLJI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.LJLJI.LJLILLLLZI.setRotation((90.0f * animatedFraction) + r0.LLIIIJ);
        this.LJLJI.LJLILLLLZI.setScaleX((this.LJLILLLLZI * animatedFraction) + this.LJLIL);
        this.LJLJI.LJLILLLLZI.setScaleY((this.LJLILLLLZI * animatedFraction) + this.LJLIL);
    }

    public C85519XhL(AvatarCutActivity avatarCutActivity, float f, float f2) {
        this.LJLJI = avatarCutActivity;
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
    }
}
