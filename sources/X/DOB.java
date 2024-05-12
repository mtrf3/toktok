package X;

/* loaded from: classes7.dex */
public final class DOB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DOB LJLIL = new DOB();

    public DOB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) DOC.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
