package X;

/* renamed from: X.Dlx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34845Dlx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34845Dlx LJLIL = new C34845Dlx();

    public C34845Dlx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34843Dlv.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
