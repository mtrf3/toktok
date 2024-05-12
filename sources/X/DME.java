package X;

/* loaded from: classes7.dex */
public final class DME extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DME LJLIL = new DME();

    public DME() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DMB.LIZ() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
