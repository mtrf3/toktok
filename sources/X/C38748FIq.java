package X;

/* renamed from: X.FIq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38748FIq extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C38748FIq LJLIL = new C38748FIq();

    public C38748FIq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C38745FIn.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
