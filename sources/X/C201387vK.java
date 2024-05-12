package X;

/* renamed from: X.7vK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201387vK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C201387vK LJLIL = new C201387vK();

    public C201387vK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "photo_mode_no_entrance_animation", true, false)) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
