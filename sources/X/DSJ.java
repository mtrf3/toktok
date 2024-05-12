package X;

/* loaded from: classes7.dex */
public final class DSJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSJ LJLIL = new DSJ();

    public DSJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DSG.LIZ() & 1024) == 1024) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
