package X;

/* loaded from: classes7.dex */
public final class DRQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DRQ LJLIL = new DRQ();

    public DRQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) DRR.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
