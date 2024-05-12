package X;

/* renamed from: X.Dsq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35272Dsq extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35272Dsq LJLIL = new C35272Dsq();

    public C35272Dsq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_focusprioritized", false));
    }
}
