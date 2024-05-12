package X;

/* loaded from: classes7.dex */
public final class EIK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final EIK LJLIL = new EIK();

    public EIK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((EIH.LIZ() & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
