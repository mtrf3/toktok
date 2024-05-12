package X;

/* renamed from: X.Dlw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34844Dlw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34844Dlw LJLIL = new C34844Dlw();

    public C34844Dlw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C34843Dlv.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
