package X;

/* loaded from: classes7.dex */
public final class DLB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DLB LJLIL = new DLB();

    public DLB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DLA.LIZIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
