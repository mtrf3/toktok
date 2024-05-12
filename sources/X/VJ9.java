package X;

/* loaded from: classes15.dex */
public final class VJ9 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final VJ9 LJLIL = new VJ9();

    public VJ9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) VJB.LIZ.getValue()).intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
