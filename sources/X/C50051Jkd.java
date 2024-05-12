package X;

/* renamed from: X.Jkd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50051Jkd extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C50051Jkd LJLIL = new C50051Jkd();

    public C50051Jkd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "search_dual_empty_optimize", true, false);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
