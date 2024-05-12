package X;

/* loaded from: classes6.dex */
public final class BAB extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public static final BAB LJLIL = new BAB();

    public BAB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C7N.LJII().getLiveGameEffectHelper();
            C1XG.LIZ();
        } else {
            C7N.LJII().getLiveGameEffectHelper();
            C1XG.LIZJ();
        }
        return C76800UCe.LIZ;
    }
}
