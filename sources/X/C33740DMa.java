package X;

/* renamed from: X.DMa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33740DMa extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33740DMa LJLIL = new C33740DMa();

    public C33740DMa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((DMY.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
