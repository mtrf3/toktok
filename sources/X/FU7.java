package X;

/* loaded from: classes7.dex */
public final class FU7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FU7 LJLIL = new FU7();

    public FU7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((FU3.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
