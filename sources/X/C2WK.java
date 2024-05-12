package X;

/* renamed from: X.2WK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WK extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C2WK LJLIL = new C2WK();

    public C2WK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(HG3.LJIILL().getCurUserId());
        LIZ.append("_profile_tab");
        return X1D.LIZIZ(LIZ);
    }
}
