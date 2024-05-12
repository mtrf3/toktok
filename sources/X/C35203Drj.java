package X;

/* renamed from: X.Drj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35203Drj extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35203Drj LJLIL = new C35203Drj();

    public C35203Drj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_preinituser", false));
    }
}
