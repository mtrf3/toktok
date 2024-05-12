package X;

/* renamed from: X.LjN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55069LjN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C55069LjN LJLIL = new C55069LjN();

    public C55069LjN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C55068LjM.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
