package X;

/* renamed from: X.26K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26K extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C26K LJLIL = new C26K();

    public C26K() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C23930wn.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
