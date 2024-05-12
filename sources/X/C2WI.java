package X;

/* renamed from: X.2WI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WI extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C2WI LJLIL = new C2WI();

    public C2WI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(HG3.LJIILL().getCurUserId());
        LIZ.append("_nickname");
        return X1D.LIZIZ(LIZ);
    }
}
