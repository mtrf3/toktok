package X;

/* loaded from: classes7.dex */
public final class DVY extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DVY LJLIL = new DVY();

    public DVY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser()) {
            z = C33878DRi.LIZ();
        } else if (C2NW.LIZ().LJ() || ((Boolean) C33980DVg.LJFF.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
