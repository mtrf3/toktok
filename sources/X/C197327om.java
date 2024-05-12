package X;

import android.view.animation.RotateAnimation;

/* renamed from: X.7om, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197327om extends AbstractC65781Prl implements InterfaceC65784Pro<RotateAnimation> {
    public static final C197327om LJLIL = new C197327om();

    public C197327om() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final RotateAnimation invoke() {
        RotateAnimation rotateAnimation = new RotateAnimation(180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(200L);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(C55953Lxd.LJ());
        return rotateAnimation;
    }
}
