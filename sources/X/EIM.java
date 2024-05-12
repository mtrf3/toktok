package X;

/* loaded from: classes7.dex */
public final class EIM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final EIM LJLIL = new EIM();

    public EIM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((EIH.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
