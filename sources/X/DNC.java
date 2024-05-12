package X;

/* loaded from: classes7.dex */
public final class DNC extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DNC LJLIL = new DNC();

    public DNC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) DNB.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
