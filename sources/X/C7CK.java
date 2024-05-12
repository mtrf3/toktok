package X;

/* renamed from: X.7CK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CK LJLIL = new C7CK();

    public C7CK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C7CP.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
