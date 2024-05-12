package X;

/* renamed from: X.M0u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56120M0u {
    NETWORK_UNAVAILABLE("network_unavailable"),
    NO_CACHE("no_cache"),
    SPARK_LOAD_FAILED("spark_load_failed"),
    RESPONSE_UNAVAILABLE("response_unavailable"),
    UNINITIALIZED("uninitialized"),
    NO_DATA("no_data"),
    NO_INTERNET("no_internet");

    public final String LJLIL;

    public static EnumC56120M0u valueOf(String str) {
        return (EnumC56120M0u) V0N.LJJJ(EnumC56120M0u.class, str);
    }

    public final String getErrMsg() {
        return this.LJLIL;
    }

    EnumC56120M0u(String str) {
        this.LJLIL = str;
    }
}
