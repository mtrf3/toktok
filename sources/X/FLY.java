package X;

/* loaded from: classes7.dex */
public final class FLY extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FLY LJLIL = new FLY();

    public FLY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((FLX.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
