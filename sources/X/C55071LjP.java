package X;

/* renamed from: X.LjP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55071LjP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C55071LjP LJLIL = new C55071LjP();

    public C55071LjP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C55068LjM.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
