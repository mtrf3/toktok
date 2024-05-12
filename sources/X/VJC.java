package X;

/* loaded from: classes15.dex */
public final class VJC extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final VJC LJLIL = new VJC();

    public VJC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) VJB.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
