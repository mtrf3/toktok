package X;

/* renamed from: X.7CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CC extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CC LJLIL = new C7CC();

    public C7CC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C7CN.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
