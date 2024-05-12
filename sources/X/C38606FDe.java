package X;

/* renamed from: X.FDe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38606FDe extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C38606FDe LJLIL = new C38606FDe();

    public C38606FDe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        int LIZ = FDY.LIZ();
        boolean z = true;
        if (LIZ != 1 && LIZ != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
