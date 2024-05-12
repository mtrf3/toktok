package X;

/* loaded from: classes7.dex */
public final class DM3 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final DM3 LJLIL = new DM3();

    public DM3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        if (((Boolean) C33739DLz.LJ.getValue()).booleanValue()) {
            j = ((((Number) C33739DLz.LIZIZ.getValue()).intValue() & 124) >> 2) * 1000;
        } else {
            j = 0;
        }
        return Long.valueOf(j);
    }
}
