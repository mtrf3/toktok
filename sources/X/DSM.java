package X;

/* loaded from: classes7.dex */
public final class DSM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSM LJLIL = new DSM();

    public DSM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DSG.LIZ() & 4096) == 4096) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
