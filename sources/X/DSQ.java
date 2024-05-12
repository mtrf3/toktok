package X;

/* loaded from: classes7.dex */
public final class DSQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSQ LJLIL = new DSQ();

    public DSQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser()) {
            z = DS8.LIZ();
        } else if (C2NW.LIZ().LJJIJLIJ()) {
            z = C2NW.LIZ().LJIIJJI();
        } else if ((C33780DNo.LIZ() & 512) == 512 || (C33780DNo.LIZ() & 1024) == 1024 || (C33780DNo.LIZ() & 2048) == 2048) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
