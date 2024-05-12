package X;

import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

/* renamed from: X.7oi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197287oi extends AbstractC65781Prl implements InterfaceC65784Pro<RotateAnimation> {
    public static final C197287oi LJLIL = new C197287oi();

    public C197287oi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final RotateAnimation invoke() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 3600000.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setDuration(15000000L);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        return rotateAnimation;
    }
}
