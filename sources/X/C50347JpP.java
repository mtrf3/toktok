package X;

/* renamed from: X.JpP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50347JpP extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C50347JpP LJLIL = new C50347JpP();

    public C50347JpP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        try {
            FFL.LJIIIZ().getClass();
            i = FFL.LJIIJ(31744, 0, "jsb_version_control", true);
        } catch (Throwable unused) {
        }
        return Integer.valueOf(i);
    }
}
