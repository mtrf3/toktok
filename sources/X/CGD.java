package X;

/* loaded from: classes6.dex */
public final class CGD extends AbstractC65781Prl implements InterfaceC88472Yns<Float, C76800UCe> {
    public static final CGD LJLIL = new CGD();

    public CGD() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Float f) {
        float floatValue = f.floatValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("total qps: ");
        LIZ.append(floatValue);
        C0NB.LJIIIZ("DebugService", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }
}
