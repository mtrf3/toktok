package X;

/* renamed from: X.DQu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33864DQu extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C33864DQu LJLIL = new C33864DQu();

    public C33864DQu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        C33862DQs.LIZ.getClass();
        int intValue = ((Number) C33862DQs.LIZJ.getValue()).intValue();
        if (intValue != 20) {
            if (intValue != 25) {
                if (intValue != 30) {
                    j = 0;
                } else {
                    j = 30;
                }
            } else {
                j = 25;
            }
        } else {
            j = 20;
        }
        return Long.valueOf(j);
    }
}
