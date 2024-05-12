package X;

/* loaded from: classes11.dex */
public enum NPR implements InterfaceC58699N1z<String> {
    TEENAGE_MODE("teenage_mode"),
    LOW_DEVICE("low_device"),
    PAST_DATA("past_data"),
    SPLASH_INFO_NULL("splash_info_null"),
    NO_NETWORK("no_network"),
    WIFI_ONLY("wifi_only"),
    IS_DOWNLOADING("is_downloading"),
    VIDEO_NULL("video_null"),
    VIDEO_URL_MODEL_NULL("video_url_model_null"),
    VIDEO_URL_LIST_NULL("video_url_list_null"),
    VIDEO_EXISTS("video_exists"),
    VIDEO_URL_FIRST_NULL("video_url_first_null"),
    DOWNLOAD_SERVICE_NULL("download_service_null");

    public final String LJLIL;

    public static NPR valueOf(String str) {
        return (NPR) V0N.LJJJ(NPR.class, str);
    }

    @Override // X.InterfaceC58699N1z
    public String getParamValue() {
        return this.LJLIL;
    }

    NPR(String str) {
        this.LJLIL = str;
    }
}
