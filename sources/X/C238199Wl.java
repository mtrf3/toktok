package X;

/* renamed from: X.9Wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238199Wl extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C238199Wl LJLIL = new C238199Wl();

    public C238199Wl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "edit_profile_name_sync", true) > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
