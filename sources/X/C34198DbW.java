package X;

/* renamed from: X.DbW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34198DbW extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34198DbW LJLIL = new C34198DbW();

    public C34198DbW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34203Dbb.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
