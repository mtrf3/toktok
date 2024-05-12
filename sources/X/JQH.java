package X;

/* loaded from: classes9.dex */
public final class JQH extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final JQH LJLIL = new JQH();

    public JQH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FHD.LIZLLL().getClass();
            z = FHD.LIZ(0, "lynx_full_screen_thumbnail", false, true);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
