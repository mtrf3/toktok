package X;

/* loaded from: classes7.dex */
public final class FRJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FRJ LJLIL = new FRJ();

    public FRJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((FRI.LIZ() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
