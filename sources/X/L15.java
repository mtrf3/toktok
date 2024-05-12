package X;

/* loaded from: classes10.dex */
public final class L15 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final L15 LJLIL = new L15();

    public L15() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) L14.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
