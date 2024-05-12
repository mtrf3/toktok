package X;

/* renamed from: X.DUg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33954DUg extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33954DUg LJLIL = new C33954DUg();

    public C33954DUg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 5;
        try {
            FFL.LJIIIZ().getClass();
            boolean z = true;
            Integer valueOf = Integer.valueOf(FFL.LJIIJ(31744, 5, "ad_deeplink_opened_time_experiment", true));
            if (valueOf.intValue() <= 0) {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                i = valueOf.intValue();
            }
        } catch (Throwable unused) {
        }
        return Integer.valueOf(i);
    }
}
