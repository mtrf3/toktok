package X;

/* renamed from: X.Dsw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35278Dsw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35278Dsw LJLIL = new C35278Dsw();

    public C35278Dsw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_preinitassem", false));
    }
}
