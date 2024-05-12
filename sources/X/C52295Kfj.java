package X;

import defpackage.e1;

/* renamed from: X.Kfj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52295Kfj extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52295Kfj LJLIL = new C52295Kfj();

    public C52295Kfj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!e1.LIZ(31744, "photomode_image_multi_rate_enable", true, false)) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        valueOf.booleanValue();
        return valueOf;
    }
}
