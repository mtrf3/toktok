package X;

/* renamed from: X.DRx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33893DRx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33893DRx LJLIL = new C33893DRx();

    public C33893DRx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!DPI.LIZ() ? (((Number) C33895DRz.LIZ.getValue()).intValue() & 1) != 1 : !C35478DwA.LIZIZ() || !DS1.LIZ()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
