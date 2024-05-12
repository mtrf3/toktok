package X;

/* renamed from: X.KhU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52404KhU extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52404KhU LJLIL = new C52404KhU();

    public C52404KhU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C52400KhQ.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
