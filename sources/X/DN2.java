package X;

/* loaded from: classes7.dex */
public final class DN2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DN2 LJLIL = new DN2();

    public DN2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser()) {
            z = DPP.LIZIZ();
        } else if ((((Number) C33765DMz.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
