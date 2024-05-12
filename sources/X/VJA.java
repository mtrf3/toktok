package X;

/* loaded from: classes15.dex */
public final class VJA extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final VJA LJLIL = new VJA();

    public VJA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) VJB.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
