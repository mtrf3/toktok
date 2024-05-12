package X;

/* renamed from: X.IhI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47296IhI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C47296IhI LJLIL = new C47296IhI();

    public C47296IhI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "vod_enable_bmf_sr", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
