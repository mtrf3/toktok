package X;

/* loaded from: classes7.dex */
public final class DSN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSN LJLIL = new DSN();

    public DSN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DSG.LIZ() & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
