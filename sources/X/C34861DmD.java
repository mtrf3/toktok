package X;

/* renamed from: X.DmD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34861DmD extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34861DmD LJLIL = new C34861DmD();

    public C34861DmD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34833Dll.LIZ() & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
