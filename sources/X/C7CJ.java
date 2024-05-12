package X;

/* renamed from: X.7CJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CJ LJLIL = new C7CJ();

    public C7CJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C7CR.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
