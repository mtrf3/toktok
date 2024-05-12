package X;

/* loaded from: classes6.dex */
public final class CGF extends AbstractC65781Prl implements InterfaceC88472Yns<Float, C76800UCe> {
    public static final CGF LJLIL = new CGF();

    public CGF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Float f) {
        float floatValue = f.floatValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UI fps: ");
        LIZ.append(floatValue);
        C0NB.LJIIIZ("DebugService", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }
}
