package X;

/* renamed from: X.51z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1283551z extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C1283551z LJLIL = new C1283551z();

    public C1283551z() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "studio_editor_pro_enable_crop", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
