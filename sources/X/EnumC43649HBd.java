package X;

/* renamed from: X.HBd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC43649HBd implements InterfaceC43658HBm {
    RECORD("record"),
    CANVAS("canvas"),
    MV_PHOTO("mv_photo"),
    CONCAT("concat"),
    SHOUT_OUT("shout_out"),
    VIDEO_IMAGE_MIXED("video_image_mixed"),
    DUET("duet"),
    CUT("cut"),
    EFFECT_CAPTURE_PHOTO("effect_capture_photo"),
    EXTERNAL_SAVE("external_save"),
    EXTERNAL_RESTORE("external_restore"),
    REVERSE("reverse"),
    VE_PREVIEW_WORKSPACE("ve_preview_workspace"),
    MIX("mix"),
    CAPTION("caption"),
    AUDIO_RECORD("audio_record"),
    BACKGROUND_VIDEO("background_video"),
    DIY_PROP_VIDEO("diy_prop_video"),
    PHOTO("photo"),
    INFO_STICKER("info_sticker"),
    TEXT_STICKER("text_sticker"),
    IMAGE_STICKER("image_sticker"),
    MENTION_STICKER("mention_sticker"),
    HASHTAG_STICKER("hashtag_sticker"),
    CUSTOM_STICKER("custom_sticker"),
    COMMENT_STICKER("comment_sticker"),
    DONATION_STICKER("donation_sticker"),
    NATURE_STICKER("nature_sticker"),
    QA_STICKER("qa_sticker"),
    STICKER_PIN("sticker_pin"),
    UPLOAD_PIC_STICKER("upload_pic_sticker"),
    COVER_TEXT("cover_text"),
    COVER("cover"),
    PHOTO_MODE("multi_images"),
    NOWS("nows"),
    SHARE_T0_STORY("share_to_story"),
    PHOTO_MOVIE_WORKSPACE("photo_movie_workspace"),
    OTHER_BUSINESS_LINE_SHARE("other_business_line_share"),
    RETAKE_MUTE_AUDIO("retake_mute_audio"),
    NLE_DATA("nle_data"),
    AUTOCUT_NLE_DATA("autocut_nle_data"),
    LOCATION_STICKER("location_sticker"),
    CUTSAME("cutsame"),
    DM("dm"),
    MOBILE_EFFECT("mobile_effect"),
    SMART_MOVIE("smart_movie"),
    VIDEO_2_STICKER("video_2_sticker"),
    VOICE_CONVERSION("voice_conversion"),
    SVC_VOICE_CHANGE_CACHE("svc_stream_audio_cache"),
    UGC_TEMPLATE("ugc_template"),
    RECORD_MP4("record_mp4"),
    SOUND_SYNC("sound_sync");

    public final String LJLIL;

    public static EnumC43649HBd valueOf(String str) {
        return (EnumC43649HBd) V0N.LJJJ(EnumC43649HBd.class, str);
    }

    @Override // X.InterfaceC43658HBm
    public String getNameSpace() {
        return this.LJLIL;
    }

    EnumC43649HBd(String str) {
        this.LJLIL = str;
    }
}
