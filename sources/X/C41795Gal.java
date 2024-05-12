package X;

/* renamed from: X.Gal, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41795Gal extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C41795Gal LJLIL = new C41795Gal();

    public C41795Gal() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "publish_retry_cancellation", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
