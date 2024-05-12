package X;

/* renamed from: X.DiK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34620DiK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34620DiK LJLIL = new C34620DiK();

    public C34620DiK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C34613DiD.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
