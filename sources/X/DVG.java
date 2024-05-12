package X;

/* loaded from: classes7.dex */
public final class DVG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DVG LJLIL = new DVG();

    public DVG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((DVD.LIZ() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
