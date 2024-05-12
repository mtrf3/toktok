package X;

/* loaded from: classes10.dex */
public enum MXP {
    DETAIL_TYPE_LIKE_LIST("like_list"),
    DETAIL_TYPE_NOTIFICATION("notification"),
    DETAIL_TYPE_FOLLOW_REQUEST("follow_request"),
    DETAIL_TYPE_TRANSLATION_LIKE_LIST("translation_like_list");

    public final String LJLIL;

    public static MXP valueOf(String str) {
        return (MXP) V0N.LJJJ(MXP.class, str);
    }

    public final String getTypeName() {
        return this.LJLIL;
    }

    MXP(String str) {
        this.LJLIL = str;
    }
}
