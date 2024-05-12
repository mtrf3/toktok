package X;

/* loaded from: classes7.dex */
public final class DN5 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DN5 LJLIL = new DN5();

    public DN5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser()) {
            z = DPP.LIZIZ();
        } else if ((DN4.LIZ() & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
