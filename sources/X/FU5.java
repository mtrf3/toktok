package X;

/* loaded from: classes7.dex */
public final class FU5 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FU5 LJLIL = new FU5();

    public FU5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((FU3.LIZ() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
