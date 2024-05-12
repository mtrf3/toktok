package X;

/* loaded from: classes7.dex */
public final class DLL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DLL LJLIL = new DLL();

    public DLL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DLK.LIZIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
