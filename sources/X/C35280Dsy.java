package X;

/* renamed from: X.Dsy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35280Dsy extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35280Dsy LJLIL = new C35280Dsy();

    public C35280Dsy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_preinituitask", false));
    }
}
