package X;

/* renamed from: X.7CM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CM LJLIL = new C7CM();

    public C7CM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C7CP.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
