package X;

/* renamed from: X.DyY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35626DyY extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35626DyY LJLIL = new C35626DyY();

    public C35626DyY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        long j;
        Long l = (Long) DU5.LIZ.getValue();
        if (l != null) {
            j = l.longValue();
        } else {
            j = 1;
        }
        return Integer.valueOf((int) j);
    }
}
