package X;

/* loaded from: classes7.dex */
public final class EB5 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final EB5 LJLIL = new EB5();

    public EB5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) EB7.LIZ.getValue()).intValue() & 2) == 2 && V0Q.Default.nextFloat() <= ((Number) C35159Dr1.LIZ.getValue()).floatValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
