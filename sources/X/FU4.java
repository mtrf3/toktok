package X;

/* loaded from: classes7.dex */
public final class FU4 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FU4 LJLIL = new FU4();

    public FU4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((FU3.LIZ() & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
