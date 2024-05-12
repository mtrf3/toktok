package X;

/* renamed from: X.Dhz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34599Dhz extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34599Dhz LJLIL = new C34599Dhz();

    public C34599Dhz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C34595Dhv.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
