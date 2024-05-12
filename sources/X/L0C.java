package X;

/* loaded from: classes10.dex */
public final class L0C extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final L0C LJLIL = new L0C();

    public L0C() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) L0A.LIZ.getValue()).intValue() & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
