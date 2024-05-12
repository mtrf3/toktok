package X;

/* loaded from: classes7.dex */
public final class DSI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSI LJLIL = new DSI();

    public DSI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser()) {
            z = DS8.LIZ();
        } else if (C2NW.LIZ().LJJIJLIJ()) {
            z = C2NW.LIZ().LJIIJJI();
        } else if ((DSG.LIZ() & 32) == 32) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
