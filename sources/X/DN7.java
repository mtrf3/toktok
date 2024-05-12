package X;

/* loaded from: classes7.dex */
public final class DN7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DN7 LJLIL = new DN7();

    public DN7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DN4.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
