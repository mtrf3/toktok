package X;

/* renamed from: X.26L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26L extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C26L LJLIL = new C26L();

    public C26L() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C23930wn.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
