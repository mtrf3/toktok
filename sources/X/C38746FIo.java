package X;

/* renamed from: X.FIo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38746FIo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C38746FIo LJLIL = new C38746FIo();

    public C38746FIo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C38745FIn.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
