package X;

/* loaded from: classes7.dex */
public final class DTB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DTB LJLIL = new DTB();

    public DTB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DTA.LJLJI.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
