package X;

/* loaded from: classes7.dex */
public final class DUF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DUF LJLIL = new DUF();

    public DUF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) DUI.LIZ.getValue()).intValue() & 2) != 2 || DUE.LIZJ() || DUE.LIZIZ() || DUE.LJFF(false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
