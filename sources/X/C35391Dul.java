package X;

/* renamed from: X.Dul, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35391Dul extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35391Dul LJLIL = new C35391Dul();

    public C35391Dul() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C35389Duj.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
