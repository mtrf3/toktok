package X;

/* loaded from: classes7.dex */
public final class DNE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DNE LJLIL = new DNE();

    public DNE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) DNB.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
