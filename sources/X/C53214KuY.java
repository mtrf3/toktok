package X;

/* renamed from: X.KuY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53214KuY extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C53214KuY LJLIL = new C53214KuY();

    public C53214KuY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "social_interactive_in_app_push", true) > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
