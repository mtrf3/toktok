package X;

/* renamed from: X.DmA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34858DmA extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34858DmA LJLIL = new C34858DmA();

    public C34858DmA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34833Dll.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
