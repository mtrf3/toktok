package X;

/* renamed from: X.DiJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34619DiJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34619DiJ LJLIL = new C34619DiJ();

    public C34619DiJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34613DiD.LIZ() & 64) == 64) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
