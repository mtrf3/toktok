package X;

/* loaded from: classes7.dex */
public final class DMM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DMM LJLIL = new DMM();

    public DMM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser()) {
            z = C2NW.LIZ().LJIILLIIL(DMQ.LJLIL);
        } else if ((((Number) DMN.LIZ.getValue()).intValue() & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
