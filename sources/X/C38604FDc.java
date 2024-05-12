package X;

/* renamed from: X.FDc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38604FDc extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C38604FDc LJLIL = new C38604FDc();

    public C38604FDc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        int LIZ = FDY.LIZ();
        boolean z = true;
        if (LIZ != 1 && LIZ != 2 && LIZ != 3 && LIZ != 4 && LIZ != 5) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
