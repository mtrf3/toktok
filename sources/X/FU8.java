package X;

/* loaded from: classes7.dex */
public final class FU8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FU8 LJLIL = new FU8();

    public FU8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((FU3.LIZ() & 32) == 32) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
