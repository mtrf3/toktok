package X;

/* renamed from: X.M0v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56121M0v {
    NETWORK_UNAVAILABLE("network_unavailable"),
    NO_CACHE("no_cache"),
    SPARK_LOAD_FAILED("spark_load_failed"),
    RESPONSE_UNAVAILABLE("response_unavailable"),
    UNINITIALIZED("uninitialized"),
    NO_DATA("no_data"),
    NO_INTERNET("no_internet");

    public final String LJLIL;

    public static EnumC56121M0v valueOf(String str) {
        return (EnumC56121M0v) V0N.LJJJ(EnumC56121M0v.class, str);
    }

    public final String getErrMsg() {
        return this.LJLIL;
    }

    EnumC56121M0v(String str) {
        this.LJLIL = str;
    }
}
