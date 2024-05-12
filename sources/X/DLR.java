package X;

/* loaded from: classes7.dex */
public final class DLR extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DLR LJLIL = new DLR();

    public DLR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DLQ.LIZIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
