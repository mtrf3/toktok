package X;

/* loaded from: classes10.dex */
public final class L05 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final L05 LJLIL = new L05();

    public L05() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) L08.LIZ.getValue()).intValue() & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
