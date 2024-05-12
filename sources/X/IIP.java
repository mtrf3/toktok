package X;

/* loaded from: classes9.dex */
public final class IIP extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public static final IIP LJLIL = new IIP();

    public IIP() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        if (num.intValue() == 0) {
            C47541IlF.LIZJ = Long.valueOf(System.currentTimeMillis());
        } else {
            C47541IlF.LIZ();
            C47541IlF.LIZJ = null;
        }
        return C76800UCe.LIZ;
    }
}
