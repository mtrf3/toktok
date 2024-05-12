package X;

/* loaded from: classes5.dex */
public enum AJH {
    NOT_MATCH("not_match"),
    CONNECT("connect"),
    FETCH("fetch"),
    INVALID_LINK("invalid_link"),
    SECURITY("security"),
    NONE("");

    public final String LJLIL;

    public static AJH valueOf(String str) {
        return (AJH) V0N.LJJJ(AJH.class, str);
    }

    public final String getReason() {
        return this.LJLIL;
    }

    AJH(String str) {
        this.LJLIL = str;
    }
}
