package X;

/* renamed from: X.Dsc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35258Dsc extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35258Dsc LJLIL = new C35258Dsc();

    public C35258Dsc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_preloadsubdecor", false));
    }
}
