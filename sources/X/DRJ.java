package X;

/* loaded from: classes7.dex */
public final class DRJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DRJ LJLIL = new DRJ();

    public DRJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (DRH.LIZ() != 1 && DRH.LIZ() != 3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
