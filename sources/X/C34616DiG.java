package X;

/* renamed from: X.DiG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34616DiG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34616DiG LJLIL = new C34616DiG();

    public C34616DiG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34613DiD.LIZ() & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
