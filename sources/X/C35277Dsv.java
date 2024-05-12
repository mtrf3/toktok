package X;

/* renamed from: X.Dsv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35277Dsv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35277Dsv LJLIL = new C35277Dsv();

    public C35277Dsv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_preinitav", false));
    }
}
