package X;

/* renamed from: X.Dt1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35283Dt1 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35283Dt1 LJLIL = new C35283Dt1();

    public C35283Dt1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_ucio", false));
    }
}
