package X;

/* loaded from: classes7.dex */
public final class FU9 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FU9 LJLIL = new FU9();

    public FU9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((FU3.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
