package X;

/* loaded from: classes7.dex */
public final class DSB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSB LJLIL = new DSB();

    public DSB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DS8.LIZ.getValue()).intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
