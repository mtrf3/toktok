package X;

/* loaded from: classes7.dex */
public final class FRP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FRP LJLIL = new FRP();

    public FRP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((FRI.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
