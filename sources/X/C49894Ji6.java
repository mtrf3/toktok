package X;

/* renamed from: X.Ji6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49894Ji6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C49894Ji6 LJLIL = new C49894Ji6();

    public C49894Ji6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "search_dual_repeat_optimize", true, false);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
