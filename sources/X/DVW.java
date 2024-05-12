package X;

/* loaded from: classes7.dex */
public final class DVW extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DVW LJLIL = new DVW();

    public DVW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser()) {
            z = C33878DRi.LIZ();
        } else if (C2NW.LIZ().LJ() || ((Boolean) C33980DVg.LJ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
