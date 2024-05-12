package X;

/* renamed from: X.2WE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WE extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C2WE LJLIL = new C2WE();

    public C2WE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(HG3.LJIILL().getCurUserId());
        LIZ.append("_read_reposts_aids");
        return X1D.LIZIZ(LIZ);
    }
}
