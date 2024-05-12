package X;

/* renamed from: X.Dst, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35275Dst extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35275Dst LJLIL = new C35275Dst();

    public C35275Dst() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_jatoio", false));
    }
}
