package X;

/* renamed from: X.KfK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52270KfK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52270KfK LJLIL = new C52270KfK();

    public C52270KfK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "live_preview_gson_refactor_setting", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
