package X;

/* loaded from: classes9.dex */
public final class IRK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final IRK LJLIL = new IRK();

    public IRK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) IRL.LIZ.getValue()).intValue() < 1 || !IRI.LIZ()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
