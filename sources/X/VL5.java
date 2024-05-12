package X;

/* loaded from: classes15.dex */
public final class VL5 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final VL5 LJLIL = new VL5();

    public VL5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) VL7.LIZIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
