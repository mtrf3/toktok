package X;

/* renamed from: X.Imo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47638Imo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C47638Imo LJLIL = new C47638Imo();

    public C47638Imo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "use_audio_manager_wrapper_for_device_info", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
