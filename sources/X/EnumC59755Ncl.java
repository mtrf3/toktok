package X;

/* renamed from: X.Ncl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC59755Ncl implements InterfaceC58699N1z<String> {
    LOAD_FAIL("1"),
    NOT_RIGHT_SCENE("2"),
    FORCE_PRELOGIN("3"),
    INVALID_AWEME("4"),
    EXPIRED("5"),
    NOT_ALLOW_TOPVIEW("6"),
    DISABLE_HOT_START("7"),
    FILTER_WITH_SAME_AWEME("8"),
    COLD_START_WITH_FOLLOW_TAB("9"),
    SUPER_ENTRANCE_SHOW("10"),
    LIVE_SPLASH_SHOW("11"),
    FILTER_WITH_SAME_AWEME_24_HOURS("12"),
    FILTER_WITH_OVER_DELIVERY("13");

    public final String LJLIL;

    public static EnumC59755Ncl valueOf(String str) {
        return (EnumC59755Ncl) V0N.LJJJ(EnumC59755Ncl.class, str);
    }

    @Override // X.InterfaceC58699N1z
    public String getParamValue() {
        return this.LJLIL;
    }

    EnumC59755Ncl(String str) {
        this.LJLIL = str;
    }
}
