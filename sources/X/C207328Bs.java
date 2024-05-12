package X;

import defpackage.e1;

/* renamed from: X.8Bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207328Bs extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C207328Bs LJLIL = new C207328Bs();

    public C207328Bs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!e1.LIZ(31744, "photomode_enable_photo_tag", true, false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
