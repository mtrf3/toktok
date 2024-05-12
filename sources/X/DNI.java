package X;

/* loaded from: classes7.dex */
public final class DNI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DNI LJLIL = new DNI();

    public DNI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) DNH.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
