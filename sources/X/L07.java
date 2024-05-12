package X;

/* loaded from: classes10.dex */
public final class L07 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final L07 LJLIL = new L07();

    public L07() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) L08.LIZ.getValue()).intValue() & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
