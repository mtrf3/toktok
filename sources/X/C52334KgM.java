package X;

/* renamed from: X.KgM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52334KgM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52334KgM LJLIL = new C52334KgM();

    public C52334KgM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "in_app_push_platform_switch", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
