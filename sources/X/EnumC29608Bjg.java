package X;

/* renamed from: X.Bjg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC29608Bjg {
    ROOM("room"),
    FEED("feed"),
    GIFT("gift"),
    BROADCAST("broadcast"),
    RANK_LIST("rank_list"),
    REPORT("report"),
    LINK_MIC("link_mic"),
    OTHER("other");

    public final String key;

    public static EnumC29608Bjg valueOf(String str) {
        return (EnumC29608Bjg) V0N.LJJJ(EnumC29608Bjg.class, str);
    }

    EnumC29608Bjg(String str) {
        this.key = str;
    }
}
