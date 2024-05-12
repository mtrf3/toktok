package X;

/* renamed from: X.Hsl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45459Hsl extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C45459Hsl LJLIL = new C45459Hsl();

    public C45459Hsl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        int LIZIZ;
        boolean z = false;
        int LIZ = C00F.LIZ(31744, 0, "studio_network_preload_opti_experiment", true);
        if (LIZ != 0 && (LIZ == 1 ? !((LIZIZ = IJV.LIZIZ()) >= 4 || LIZIZ == 0) : !(LIZ == 2 ? IJV.LIZ() > 6 : LIZ != 3))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
