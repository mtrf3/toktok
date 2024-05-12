package X;

import defpackage.e1;

/* renamed from: X.82i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2048882i extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2048882i LJLIL = new C2048882i();

    public C2048882i() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!e1.LIZ(31744, "photo_mode_self_profile_image_centered", true, false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
