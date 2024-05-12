package X;

/* renamed from: X.LzO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56062LzO {
    PREFETCH_CACHE("prefetch_cache"),
    PREFETCH("prefetch"),
    REFRESH("refresh"),
    API_ERROR_RETRY("api_error_retry"),
    NETWORK_UNAVAILABLE_RETRY("network_unavailable_retry"),
    TEMPLATE_ERROR_RETRY("template_error_retry");

    public final String LJLIL;

    public static EnumC56062LzO valueOf(String str) {
        return (EnumC56062LzO) V0N.LJJJ(EnumC56062LzO.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC56062LzO(String str) {
        this.LJLIL = str;
    }
}
