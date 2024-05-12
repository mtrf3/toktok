package X;

/* loaded from: classes7.dex */
public final class DSE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSE LJLIL = new DSE();

    public DSE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((DSG.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
