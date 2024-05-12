package X;

import android.view.animation.RotateAnimation;

/* renamed from: X.7on, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197337on extends AbstractC65781Prl implements InterfaceC65784Pro<RotateAnimation> {
    public static final C197337on LJLIL = new C197337on();

    public C197337on() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final RotateAnimation invoke() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(200L);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(C55953Lxd.LJ());
        return rotateAnimation;
    }
}
