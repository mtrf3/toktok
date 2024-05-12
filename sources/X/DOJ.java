package X;

/* loaded from: classes7.dex */
public final class DOJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DOJ LJLIL = new DOJ();

    public DOJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DOI.LIZ() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
