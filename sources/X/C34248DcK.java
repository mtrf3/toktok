package X;

/* renamed from: X.DcK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34248DcK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34248DcK LJLIL = new C34248DcK();

    public C34248DcK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "search_dual_request_optimize", true, false);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
