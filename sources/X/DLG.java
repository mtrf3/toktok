package X;

/* loaded from: classes7.dex */
public final class DLG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DLG LJLIL = new DLG();

    public DLG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DLF.LIZIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
