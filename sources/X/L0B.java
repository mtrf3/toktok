package X;

/* loaded from: classes10.dex */
public final class L0B extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final L0B LJLIL = new L0B();

    public L0B() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) L0A.LIZ.getValue()).intValue() & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}