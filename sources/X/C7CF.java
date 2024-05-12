package X;

/* renamed from: X.7CF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7CF LJLIL = new C7CF();

    public C7CF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C7CT.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
