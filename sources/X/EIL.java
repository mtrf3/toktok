package X;

/* loaded from: classes7.dex */
public final class EIL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final EIL LJLIL = new EIL();

    public EIL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((EIH.LIZ() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
