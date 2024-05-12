package X;

/* renamed from: X.IHj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46359IHj extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C46359IHj LJLIL = new C46359IHj();

    public C46359IHj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        int i = J1N.LIZ().getInt("push_count", 0);
        J1N.LIZ().storeLong("push_interval_millisecond", System.currentTimeMillis());
        int i2 = i + 1;
        J1N.LIZ().storeInt("push_count", i2);
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i2, "unmute_settings_push_show_cnt");
        FMX.LJIIL("mute_settings_push_show", c188727au.LIZ);
        return C76800UCe.LIZ;
    }
}
