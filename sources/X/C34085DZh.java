package X;

/* renamed from: X.DZh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34085DZh extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34085DZh LJLIL = new C34085DZh();

    public C34085DZh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "check_camera_permission_modify", true, false);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
