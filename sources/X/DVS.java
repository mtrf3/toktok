package X;

/* loaded from: classes7.dex */
public final class DVS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DVS LJLIL = new DVS();

    public DVS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) DVT.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
