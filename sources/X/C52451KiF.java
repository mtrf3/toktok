package X;

/* renamed from: X.KiF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52451KiF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52451KiF LJLIL = new C52451KiF();

    public C52451KiF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (C00F.LIZ(31744, 1, "enable_video_seekbar_visible", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
