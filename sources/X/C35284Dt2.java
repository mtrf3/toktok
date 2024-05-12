package X;

/* renamed from: X.Dt2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35284Dt2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35284Dt2 LJLIL = new C35284Dt2();

    public C35284Dt2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_ugio", false));
    }
}
