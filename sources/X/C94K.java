package X;

/* renamed from: X.94K, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C94K extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C94K LJLIL = new C94K();

    public C94K() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser() && ((Number) C94M.LIZ.getValue()).intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
