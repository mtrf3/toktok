package X;

/* loaded from: classes7.dex */
public final class DT3 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DT3 LJLIL = new DT3();

    public DT3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DT2.LJLJI.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
