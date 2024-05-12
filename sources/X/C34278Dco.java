package X;

/* renamed from: X.Dco, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34278Dco extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34278Dco LJLIL = new C34278Dco();

    public C34278Dco() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Boolean) C34276Dcm.LJ.getValue()).booleanValue() || (C34276Dcm.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
