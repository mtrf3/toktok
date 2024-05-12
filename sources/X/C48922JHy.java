package X;

import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

/* renamed from: X.JHy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48922JHy extends AbstractC65781Prl implements InterfaceC65784Pro<RotateAnimation> {
    public static final C48922JHy LJLIL = new C48922JHy();

    public C48922JHy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final RotateAnimation invoke() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(1000L);
        return rotateAnimation;
    }
}
