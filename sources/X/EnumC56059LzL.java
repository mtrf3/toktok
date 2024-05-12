package X;

/* renamed from: X.LzL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56059LzL {
    PREFETCH_CACHE("prefetch_cache"),
    PREFETCH("prefetch"),
    REFRESH("refresh"),
    PULL_REFRESH("pull_refresh"),
    API_ERROR_RETRY("api_error_retry"),
    NETWORK_UNAVAILABLE_RETRY("network_unavailable_retry"),
    TEMPLATE_ERROR_RETRY("template_error_retry");

    public final String LJLIL;

    public static EnumC56059LzL valueOf(String str) {
        return (EnumC56059LzL) V0N.LJJJ(EnumC56059LzL.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC56059LzL(String str) {
        this.LJLIL = str;
    }
}
