package X;

import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

/* loaded from: classes9.dex */
public final class JIQ extends AbstractC65781Prl implements InterfaceC65784Pro<RotateAnimation> {
    public static final JIQ LJLIL = new JIQ();

    public JIQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final RotateAnimation invoke() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setDuration(1000L);
        return rotateAnimation;
    }
}
