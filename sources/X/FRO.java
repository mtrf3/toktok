package X;

/* loaded from: classes7.dex */
public final class FRO extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FRO LJLIL = new FRO();

    public FRO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((FRI.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
