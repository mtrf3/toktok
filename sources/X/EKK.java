package X;

/* loaded from: classes7.dex */
public final class EKK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final EKK LJLIL = new EKK();

    public EKK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((EKL.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
