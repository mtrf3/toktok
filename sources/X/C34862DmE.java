package X;

/* renamed from: X.DmE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34862DmE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34862DmE LJLIL = new C34862DmE();

    public C34862DmE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34833Dll.LIZ() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
