package X;

/* renamed from: X.KiN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52459KiN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52459KiN LJLIL = new C52459KiN();

    public C52459KiN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "remove_other_profile_invalid_tab", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
