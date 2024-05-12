package X;

/* renamed from: X.DiS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34628DiS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34628DiS LJLIL = new C34628DiS();

    public C34628DiS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C34626DiQ.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
