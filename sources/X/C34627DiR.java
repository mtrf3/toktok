package X;

/* renamed from: X.DiR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34627DiR extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34627DiR LJLIL = new C34627DiR();

    public C34627DiR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) C34626DiQ.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
