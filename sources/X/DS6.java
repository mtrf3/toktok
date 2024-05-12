package X;

/* loaded from: classes7.dex */
public final class DS6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DS6 LJLIL = new DS6();

    public DS6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser()) {
            z = C2NW.LIZ().LJIILLIIL(DS5.LJLIL);
        } else if ((DSG.LIZ() & 512) == 512) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
