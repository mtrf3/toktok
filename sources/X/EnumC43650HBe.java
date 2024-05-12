package X;

/* renamed from: X.HBe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC43650HBe implements InterfaceC43658HBm {
    VIDEO_TO_GIF_VE_WORKSPACE("video_to_gif_ve_workspace"),
    CUT_VE_WORKSPACE("cut_ve_workspace"),
    SAVE_TO_LOCAL("save_to_local"),
    MV_VE_WORKSPACE("mv_ve_workspace"),
    COVER("cover"),
    CAPTION("caption"),
    WATERMARK_MODERATION("watermark_moderation"),
    CAPTION_VE_WORKSPACE("caption_ve_workspace"),
    EXTRACT_ORIGIN_SOUND_WORKSPACE("extract_origin_sound_workspace"),
    WATERMARK_VE_WORKSPACE("watermark_ve_workspace"),
    WATERMARK("watermark"),
    EXTRACT_ORIGIN_SOUND_VE_WORKSPACE("extract_origin_sound_ve_workspace"),
    COMPILE_PROBE_VE_WORKSPACE("compile_probe_ve_workspace"),
    SHARED_AR("shared_ar"),
    VIDEO_FRAME_CACHE("video_frame_cache"),
    AI_CHOOSE_MUSIC("ai_choose_music"),
    UPLOAD_FRAME_TASK_S_CACHE("upload_frame_task_s_cache"),
    UPLOAD_FRAME_TASK_L_CACHE("upload_frame_task_l_cache"),
    DUET_VE_WORKSPACE("duet_ve_workspace"),
    AUDIO_COPYRIGHT_DETECT("audio_copyright_detect"),
    AUDIO_COPYRIGHT_REPLACE("audio_copyright_replace"),
    SYNTHESISE("synthesise"),
    PARALLEL_UPLOAD("parallel_upload"),
    ORIGIN_FILE("origin_file"),
    EFFECT_WATERMARK("effect_watermark"),
    MUSIC_BEATS("music_beats"),
    VE_LENS_ONE_KEY_HDR("ve_lens_one_key_hdr"),
    EDIT_POST_VIDEO("edit_post_video"),
    ALBUM_PREVIEW_VIDEO("album_preview_video"),
    RECORD_CACHE_FILE("record_cache_file"),
    VIDEO_2_STICKER("video_2_sticker"),
    UGC_TEMPLATE_PREVIEW_VIDEO("ugc_template_preview_video"),
    UGC_TEMPLATE_ZIP("ugc_template_zip"),
    AUTOCUT_TEMPLATE_ZIP("autocut_template_zip"),
    MAGIC_EFFECT_CACHE("magic_effect_cache"),
    VE_GET_IMAGES_CACHE("ve_get_images_cache"),
    EDIT_EFFECT_CACHE("edit_effect_cache");

    public final String LJLIL;

    public static EnumC43650HBe valueOf(String str) {
        return (EnumC43650HBe) V0N.LJJJ(EnumC43650HBe.class, str);
    }

    @Override // X.InterfaceC43658HBm
    public String getNameSpace() {
        return this.LJLIL;
    }

    EnumC43650HBe(String str) {
        this.LJLIL = str;
    }
}
