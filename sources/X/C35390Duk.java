package X;

/* renamed from: X.Duk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35390Duk extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35390Duk LJLIL = new C35390Duk();

    public C35390Duk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C35389Duj.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
