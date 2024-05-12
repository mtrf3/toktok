package X;

import defpackage.e1;

/* renamed from: X.84f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2053784f extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2053784f LJLIL = new C2053784f();

    public C2053784f() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!e1.LIZ(31744, "photo_mode_title_limit_enabled", true, false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
