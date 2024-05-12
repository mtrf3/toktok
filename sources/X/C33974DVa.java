package X;

/* renamed from: X.DVa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33974DVa extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33974DVa LJLIL = new C33974DVa();

    public C33974DVa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser()) {
            z = C33878DRi.LIZ();
        } else if (C2NW.LIZ().LJ() || ((Boolean) C33980DVg.LIZLLL.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
