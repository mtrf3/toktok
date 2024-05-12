package X;

/* loaded from: classes7.dex */
public final class FRN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FRN LJLIL = new FRN();

    public FRN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((FRI.LIZ() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
