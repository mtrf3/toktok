package X;

/* loaded from: classes7.dex */
public final class DRF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DRF LJLIL = new DRF();

    public DRF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DRE.LIZIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
