package X;

/* renamed from: X.DpC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35046DpC extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35046DpC LJLIL = new C35046DpC();

    public C35046DpC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C35044DpA.LIZ.getValue()).intValue() & 4) > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
