package X;

/* renamed from: X.FDd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38605FDd extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C38605FDd LJLIL = new C38605FDd();

    public C38605FDd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        int LIZ = FDY.LIZ();
        if (LIZ != 3 && LIZ != 4 && LIZ != 5) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
