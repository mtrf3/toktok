package X;

/* loaded from: classes7.dex */
public final class FU6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FU6 LJLIL = new FU6();

    public FU6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((FU3.LIZ() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
