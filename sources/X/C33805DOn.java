package X;

/* renamed from: X.DOn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33805DOn extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C33805DOn LJLIL = new C33805DOn();

    public C33805DOn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long longValue;
        if (DPI.LIZ()) {
            if (DPB.LIZIZ()) {
                longValue = ((((Number) C33739DLz.LIZIZ.getValue()).intValue() & 124) >> 2) * 1000;
            } else {
                longValue = 0;
            }
        } else {
            longValue = ((Number) C33739DLz.LJI.getValue()).longValue();
        }
        return Long.valueOf(longValue);
    }
}
