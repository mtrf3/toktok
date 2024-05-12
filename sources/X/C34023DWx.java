package X;

/* renamed from: X.DWx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34023DWx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34023DWx LJLIL = new C34023DWx();

    public C34023DWx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C34025DWz.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
