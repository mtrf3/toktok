package X;

/* loaded from: classes11.dex */
public enum OTS {
    INVALID_REQUEST("invalid_request"),
    ACCESS_DENIED("access_denied"),
    INVALID_SCOPE("invalid_scope"),
    SERVER_ERROR("server_error"),
    TEMPORARILY_UNAVAILABLE("temporarily_unavailable"),
    UNAUTHORIZED_CLIENT("unauthorized_client");

    public final String LJLIL;

    public static OTS valueOf(String str) {
        return (OTS) V0N.LJJJ(OTS.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    OTS(String str) {
        this.LJLIL = str;
    }
}
