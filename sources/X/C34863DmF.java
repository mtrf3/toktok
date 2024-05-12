package X;

/* renamed from: X.DmF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34863DmF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34863DmF LJLIL = new C34863DmF();

    public C34863DmF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34833Dll.LIZ() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
