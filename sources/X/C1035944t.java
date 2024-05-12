package X;

/* renamed from: X.44t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1035944t extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C1035944t LJLIL = new C1035944t();

    public C1035944t() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        Long l = C1036144v.LIZ().pollingMaxTimeLimit;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 5000;
        }
        return Long.valueOf(j);
    }
}
