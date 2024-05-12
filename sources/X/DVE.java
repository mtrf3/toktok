package X;

/* loaded from: classes7.dex */
public final class DVE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DVE LJLIL = new DVE();

    public DVE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DVD.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
