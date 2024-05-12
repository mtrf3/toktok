package X;

/* renamed from: X.Gku, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42424Gku extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C42424Gku LJLIL = new C42424Gku();

    public C42424Gku() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "studio_can_cancel_loading_in_duet", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
