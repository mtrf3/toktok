package X;

/* loaded from: classes7.dex */
public final class DOZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DOZ LJLIL = new DOZ();

    public DOZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33793DOb.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
