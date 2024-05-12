package X;

/* renamed from: X.DPf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33823DPf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33823DPf LJLIL = new C33823DPf();

    public C33823DPf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C2NW.LIZ().isNewUser()) {
            z = C2NW.LIZ().LJIILLIIL(C33822DPe.LJLIL);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
