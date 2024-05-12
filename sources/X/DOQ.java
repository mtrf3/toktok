package X;

/* loaded from: classes7.dex */
public final class DOQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DOQ LJLIL = new DOQ();

    public DOQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DOR.LIZ.getValue()).intValue() >= 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
