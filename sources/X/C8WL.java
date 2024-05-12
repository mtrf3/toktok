package X;

/* renamed from: X.8WL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8WL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C8WL LJLIL = new C8WL();

    public C8WL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "assem_optimize_enable", true, true);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
