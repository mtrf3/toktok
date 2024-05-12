package X;

/* loaded from: classes7.dex */
public final class DSF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSF LJLIL = new DSF();

    public DSF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DSG.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
