package X;

/* renamed from: X.31S, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31S extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C31S LJLIL = new C31S();

    public C31S() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        int LIZ = C31V.LIZ();
        if (LIZ != 0) {
            if (LIZ != 1) {
                if (LIZ != 2) {
                    j = 5000;
                } else {
                    j = 1000;
                }
            } else {
                j = 10000;
            }
        } else {
            j = 20000;
        }
        return Long.valueOf(j);
    }
}
