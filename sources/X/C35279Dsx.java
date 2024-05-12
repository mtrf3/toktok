package X;

/* renamed from: X.Dsx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35279Dsx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35279Dsx LJLIL = new C35279Dsx();

    public C35279Dsx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_preinitpush", false));
    }
}
