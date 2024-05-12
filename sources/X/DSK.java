package X;

/* loaded from: classes7.dex */
public final class DSK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSK LJLIL = new DSK();

    public DSK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DSG.LIZ() & 256) == 256) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
