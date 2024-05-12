package X;

/* renamed from: X.AQn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26213AQn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C26213AQn LJLIL = new C26213AQn();

    public C26213AQn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "offline_mode_enable", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
