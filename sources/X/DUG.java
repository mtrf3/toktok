package X;

/* loaded from: classes7.dex */
public final class DUG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DUG LJLIL = new DUG();

    public DUG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) DUI.LIZ.getValue()).intValue() & 1) != 1 || DUE.LIZJ() || DUE.LIZIZ() || DUE.LJFF(false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
