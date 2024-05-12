package X;

/* renamed from: X.3EI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C3EI LJLIL = new C3EI();

    public C3EI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) C3EJ.LIZ.getValue()).longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
