package X;

/* renamed from: X.Dsu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35276Dsu extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35276Dsu LJLIL = new C35276Dsu();

    public C35276Dsu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_kevapreloadio", false));
    }
}