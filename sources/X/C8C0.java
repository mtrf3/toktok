package X;

/* renamed from: X.8C0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8C0 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C8C0 LJLIL = new C8C0();

    public C8C0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "photo_mode_full_page_refactor", true, false)) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
