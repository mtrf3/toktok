package X;

/* renamed from: X.26C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26C extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C26C LJLIL = new C26C();

    public C26C() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C23840we.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
