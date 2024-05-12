package X;

/* renamed from: X.Dm0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34848Dm0 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34848Dm0 LJLIL = new C34848Dm0();

    public C34848Dm0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C34847Dlz.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
