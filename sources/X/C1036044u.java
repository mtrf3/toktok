package X;

/* renamed from: X.44u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1036044u extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C1036044u LJLIL = new C1036044u();

    public C1036044u() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        Long l = C1036144v.LIZ().pollingProcessInfoInterval;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 1000;
        }
        return Long.valueOf(j);
    }
}
