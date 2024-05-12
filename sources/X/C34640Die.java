package X;

/* renamed from: X.Die, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34640Die extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34640Die LJLIL = new C34640Die();

    public C34640Die() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C33776DNk.LIZ() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
