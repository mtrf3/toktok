package X;

/* loaded from: classes7.dex */
public final class DLV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DLV LJLIL = new DLV();

    public DLV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DLU.LIZIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
