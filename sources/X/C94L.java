package X;

/* renamed from: X.94L, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C94L extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C94L LJLIL = new C94L();

    public C94L() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        if (C2NW.LIZ().isNewUser()) {
            int intValue = ((Number) C94M.LIZ.getValue()).intValue();
            if (intValue == 1) {
                j = 1000;
            } else if (intValue == 2) {
                j = 3000;
            }
            return Long.valueOf(j);
        }
        j = 0;
        return Long.valueOf(j);
    }
}
