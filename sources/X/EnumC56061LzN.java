package X;

/* renamed from: X.LzN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56061LzN {
    PREFETCH_CACHE("prefetch_cache"),
    PREFETCH("prefetch"),
    REFRESH("refresh"),
    PULL_REFRESH("pull_refresh"),
    API_ERROR_RETRY("api_error_retry"),
    NETWORK_UNAVAILABLE_RETRY("network_unavailable_retry"),
    TEMPLATE_ERROR_RETRY("template_error_retry");

    public final String LJLIL;

    public static EnumC56061LzN valueOf(String str) {
        return (EnumC56061LzN) V0N.LJJJ(EnumC56061LzN.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC56061LzN(String str) {
        this.LJLIL = str;
    }
}
