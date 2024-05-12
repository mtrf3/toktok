package X;

/* renamed from: X.DLy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33738DLy extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33738DLy LJLIL = new C33738DLy();

    public C33738DLy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33739DLz.LIZIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
