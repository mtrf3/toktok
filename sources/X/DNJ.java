package X;

/* loaded from: classes7.dex */
public final class DNJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DNJ LJLIL = new DNJ();

    public DNJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) DNH.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
