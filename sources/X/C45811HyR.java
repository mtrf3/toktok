package X;

import defpackage.e1;

/* renamed from: X.HyR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45811HyR extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C45811HyR LJLIL = new C45811HyR();

    public C45811HyR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!e1.LIZ(31744, "photo_mode_open_upload_tab", true, false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
