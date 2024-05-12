package X;

/* renamed from: X.HBf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC43651HBf implements InterfaceC43658HBm {
    SAVE_PHOTO_STICKER_WATERMARK("save_photo_sticker_watermark"),
    FILTERS("filters"),
    FONT("font"),
    EFFECT_MODEL("effect_model"),
    MV_RES("mv_res"),
    EFFECT("effect"),
    MODERATION_WATERMARK_VIDEO("moderation_watermark_video"),
    LOCAL_AUDIO_EFFECT("local_audio-effect"),
    MUSIC("music"),
    LOCAL_EXTRACT_MUSIC("local_extract_music"),
    LOCAL_DUET_LAYOUT("local_duet_layout"),
    DUET_ORIGIN_VIDEO("duet_origin_video"),
    STITCH_ORIGIN_VIDEO("stitch_origin_video"),
    EDIT_CAP_CUT_RES("edit_cap_cut_res"),
    STREAM_EDIT_VIDEO("stream_edit_video"),
    NOWS_GIF_GUIDE_RES("nows_gif_guide_res"),
    CAMERA_WIDGET_GUIDE_RES("nows_gif_guide_res"),
    ADVANCED_MOBILE_EFFECT("advanced_mobile_effect"),
    VIDEO_2_STICKER("video_2_sticker"),
    UGC_TEMPLATE("ugc_template"),
    AUTOCUT_TEMPLATE("autocut_template"),
    ANCHOR("anchor"),
    MAGIC_PROCESSOR("magic_processor"),
    STYLE_EFFECT("style_effect"),
    VOP_CLONE("vop_clone");

    public final String LJLIL;

    public static EnumC43651HBf valueOf(String str) {
        return (EnumC43651HBf) V0N.LJJJ(EnumC43651HBf.class, str);
    }

    @Override // X.InterfaceC43658HBm
    public String getNameSpace() {
        return this.LJLIL;
    }

    EnumC43651HBf(String str) {
        this.LJLIL = str;
    }
}
