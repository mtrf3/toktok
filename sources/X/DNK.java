package X;

/* loaded from: classes7.dex */
public final class DNK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DNK LJLIL = new DNK();

    public DNK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) DNH.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
