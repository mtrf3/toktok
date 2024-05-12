package X;

/* loaded from: classes7.dex */
public final class DQU extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final DQU LJLIL = new DQU();

    public DQU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        int intValue = ((Number) DQV.LIZIZ.getValue()).intValue();
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
