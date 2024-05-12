package X;

/* renamed from: X.LjO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55070LjO extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C55070LjO LJLIL = new C55070LjO();

    public C55070LjO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C55068LjM.LIZ() & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
