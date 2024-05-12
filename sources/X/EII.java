package X;

/* loaded from: classes7.dex */
public final class EII extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final EII LJLIL = new EII();

    public EII() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((EIH.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
