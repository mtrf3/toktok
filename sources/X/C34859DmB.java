package X;

/* renamed from: X.DmB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34859DmB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34859DmB LJLIL = new C34859DmB();

    public C34859DmB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C34833Dll.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
