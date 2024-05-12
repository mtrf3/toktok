package X;

/* loaded from: classes7.dex */
public final class DPK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DPK LJLIL = new DPK();

    public DPK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean isNewUser;
        if (C33949DUb.LIZJ()) {
            isNewUser = false;
        } else {
            isNewUser = C2NW.LIZ().isNewUser();
        }
        return Boolean.valueOf(isNewUser);
    }
}
