package X;

/* renamed from: X.Dm1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34849Dm1 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34849Dm1 LJLIL = new C34849Dm1();

    public C34849Dm1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34847Dlz.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
