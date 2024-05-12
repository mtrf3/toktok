package X;

/* loaded from: classes7.dex */
public final class DVF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DVF LJLIL = new DVF();

    public DVF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((DVD.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
