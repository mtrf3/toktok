package X;

/* renamed from: X.N3f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC58731N3f {
    NATIVE_NETWORK_MONITOR_EXCEPTION_LOG("native_network_monitor_exception_log"),
    UNEXPECTED_NETWORK_LOG("unexpected_network_log"),
    NATIVE_NETWORK_API_LOG("native_network_api_log"),
    PENETRATE_HEADER_LOG("penetrate_header_log"),
    HTTP_COOKIE_TOKEN_LOG("http_cookie_token_log"),
    COMPLIANCE_NETWORK_MONITOR_LOG("compliance_network_monitor_log"),
    COMPLIANCE_PAYLOAD_MONITOR_LOG("compliance_payload_monitor_log"),
    COMPLIANCE_THIRDPARTY_NETWORK_MONITOR_LOG("compliance_thirdparty_network_monitor_log"),
    PNS_URL_BEFORE_STORE_REGION("pns_url_before_store_region");

    public final String LJLIL;

    public static EnumC58731N3f valueOf(String str) {
        return (EnumC58731N3f) V0N.LJJJ(EnumC58731N3f.class, str);
    }

    public final String getLogType() {
        return this.LJLIL;
    }

    EnumC58731N3f(String str) {
        this.LJLIL = str;
    }
}
