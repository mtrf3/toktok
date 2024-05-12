package X;

/* loaded from: classes9.dex */
public enum KT1 {
    VIDEO("video"),
    USER("user"),
    LIVE("live"),
    HOTSPOT("hotspot"),
    ADS("ads"),
    E_COM("e_com"),
    EFFECTS("effects"),
    MUSIC("music"),
    CHALLENGE("challenge"),
    POI("poi"),
    PICS("pics"),
    RECOMMEND_USER("recommend_user"),
    AGGREGATED("featured_aggregated");

    public final String LJLIL;

    public static KT1 valueOf(String str) {
        return (KT1) V0N.LJJJ(KT1.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    KT1(String str) {
        this.LJLIL = str;
    }
}
