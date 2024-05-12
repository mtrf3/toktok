package X;

/* renamed from: X.DZz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34103DZz extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34103DZz LJLIL = new C34103DZz();

    public C34103DZz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 10000;
        try {
            FFL.LJIIIZ().getClass();
            i = FFL.LJIIJ(31744, 10000, "required_followers_cnt_to_show_card", true);
        } catch (Throwable unused) {
        }
        return Integer.valueOf(i);
    }
}
