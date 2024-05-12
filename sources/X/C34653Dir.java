package X;

/* renamed from: X.Dir, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34653Dir extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34653Dir LJLIL = new C34653Dir();

    public C34653Dir() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C34652Diq.LIZ.getValue()).intValue() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
