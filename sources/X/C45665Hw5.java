package X;

import defpackage.e1;

/* renamed from: X.Hw5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45665Hw5 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C45665Hw5 LJLIL = new C45665Hw5();

    public C45665Hw5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!e1.LIZ(31744, "photo_mode_open_upload_album", true, false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
