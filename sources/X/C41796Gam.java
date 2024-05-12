package X;

/* renamed from: X.Gam, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41796Gam extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C41796Gam LJLIL = new C41796Gam();

    public C41796Gam() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "publish_retry_cancellation", true) == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
