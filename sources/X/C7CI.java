package X;

/* renamed from: X.7CI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CI LJLIL = new C7CI();

    public C7CI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C7CR.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
