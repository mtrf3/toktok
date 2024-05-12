package X;

/* renamed from: X.Dso, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35270Dso extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35270Dso LJLIL = new C35270Dso();

    public C35270Dso() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_focushookwebview", false));
    }
}
