package X;

/* renamed from: X.DXb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34027DXb extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34027DXb LJLIL = new C34027DXb();

    public C34027DXb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34028DXc.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
