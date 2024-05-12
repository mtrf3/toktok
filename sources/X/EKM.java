package X;

/* loaded from: classes7.dex */
public final class EKM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final EKM LJLIL = new EKM();

    public EKM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((EKL.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
