package X;

/* renamed from: X.Gak, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41794Gak extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C41794Gak LJLIL = new C41794Gak();

    public C41794Gak() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "publish_retry_new_toast", true) == 0 && C00F.LIZ(31744, 0, "publish_automatic_retry", true) == 0 && C00F.LIZ(31744, 0, "publish_retry_cancellation", true) == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
