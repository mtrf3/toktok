package X;

/* loaded from: classes7.dex */
public final class DSO extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSO LJLIL = new DSO();

    public DSO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DSG.LIZ() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}