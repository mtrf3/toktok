package X;

/* renamed from: X.DiF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34615DiF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34615DiF LJLIL = new C34615DiF();

    public C34615DiF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34613DiD.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
