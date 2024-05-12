package X;

/* loaded from: classes7.dex */
public final class DOM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DOM LJLIL = new DOM();

    public DOM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((DOI.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
