package X;

/* renamed from: X.Gaj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41793Gaj extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C41793Gaj LJLIL = new C41793Gaj();

    public C41793Gaj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "publish_automatic_retry", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
