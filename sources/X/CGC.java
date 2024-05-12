package X;

/* loaded from: classes6.dex */
public final class CGC extends AbstractC65781Prl implements InterfaceC88472Yns<Double, C76800UCe> {
    public static final CGC LJLIL = new CGC();

    public CGC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Double d) {
        double doubleValue = d.doubleValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cpu: ");
        LIZ.append(doubleValue);
        C0NB.LJIIIZ("DebugService", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }
}
