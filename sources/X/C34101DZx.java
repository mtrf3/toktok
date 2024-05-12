package X;

/* renamed from: X.DZx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34101DZx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34101DZx LJLIL = new C34101DZx();

    public C34101DZx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "remove_recommend_card_frequency_limit", true, false);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
