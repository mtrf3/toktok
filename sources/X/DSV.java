package X;

/* loaded from: classes7.dex */
public final class DSV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSV LJLIL = new DSV();

    public DSV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DSW.LJLJI.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
