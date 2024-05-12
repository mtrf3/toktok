package X;

/* renamed from: X.1yN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50391yN extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C50391yN LJLIL = new C50391yN();

    public C50391yN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        long j2 = 0;
        if (C32041No.LJIJ) {
            if (C32041No.LIZJ != null) {
                long currentTimeMillis = System.currentTimeMillis();
                C08870Wl c08870Wl = C32041No.LIZJ;
                if (c08870Wl != null) {
                    j = c08870Wl.LJIILL;
                } else {
                    j = currentTimeMillis;
                }
                j2 = (currentTimeMillis - j) / 1000;
            }
            if (C32041No.LJIIZILJ) {
                C32041No.LJIJ = false;
            }
        }
        return Long.valueOf(j2);
    }
}
