package X;

/* loaded from: classes7.dex */
public final class DSL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSL LJLIL = new DSL();

    public DSL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DSG.LIZ() & 64) == 64) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
