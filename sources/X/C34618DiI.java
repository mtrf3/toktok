package X;

/* renamed from: X.DiI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34618DiI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34618DiI LJLIL = new C34618DiI();

    public C34618DiI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34613DiD.LIZ() & 32) == 32) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
