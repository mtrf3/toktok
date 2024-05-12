package X;

/* loaded from: classes8.dex */
public enum H1T {
    CACHE_CLEAN("cache_clean"),
    EXTRACT("extract"),
    COMPILE("compile"),
    UPLOAD("upload"),
    AUTH_KEY("auth_key"),
    COVER_TEXT_UPLOAD("cover_text_upload"),
    CREATE_AWEME("create_aweme"),
    SAVE_LOCAL("save_local"),
    WAIT_CLICK_POST("wait_click_post"),
    MOBILE_EFFECT_UPLOAD("mobile_effect_upload"),
    ORIGINAL_FRAME_UPLOAD("original_frame_upload"),
    ADD_EFFECT_WATERMARK("add_effect_watermark"),
    REPLACE_LOCAL_IMAGE("replace_local_image"),
    EDIT_POST("edit_post"),
    WAIT_UPLOAD_PARAMS("wait_upload_params"),
    WAIT_EDIT_SAVE_LOCAL_TASK("wait_edit_save_local"),
    RETRY_EDIT_SAVE_LOCAL_TASK("retry_edit_save_local"),
    VE_CODEC_DOWNLOAD("ve_codec_download"),
    VE_BYTEVC1_PLUGIN_LOAD("ve_bytevc1_plugin_load"),
    UGC_TEMPLATE_UPLOAD("ugc_template_upload"),
    AUTOCUT_TEMPLATE_UPLOAD("autocut_template_upload"),
    PUGC_TEMPLATE_UPLOAD("pugc_template_upload"),
    PUGC_TEMPLATE_BINDING("pugc_template_binding"),
    UPDATE_AIGC_INFO_BEFORE_SAVE_LOCAL("update_aigc_info_before_save_local"),
    CLOUD_MERGE("cloud_merge"),
    QUICK_FORWARD_LOCK_CREATE_AWEME("quick_forward_lock_create_aweme"),
    QUICK_FORWARD_RES_RESTORE("quick_forward_res_restore");

    public final String LJLIL;

    public static H1T valueOf(String str) {
        return (H1T) V0N.LJJJ(H1T.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    H1T(String str) {
        this.LJLIL = str;
    }
}
