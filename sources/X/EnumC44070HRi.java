package X;

/* renamed from: X.HRi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC44070HRi {
    NO_ERROR(-1),
    UNDEFINED(0),
    AWEME_INTERACT_PERMISSION(1),
    AWEME_TYPE(3),
    MUSIC_NULL(4),
    AWEME_IS_WITH_PROMOTIONAL_MUSIC(5),
    VIDEO_LENGTH_RESTRICT(6),
    COMMERCE_CLOSE_DUET_OR_STITCH(7),
    AWEME_IS_VR(8),
    PRIVATE_STATUS(9),
    DELETE_STATUS(10),
    PHOTO_MODE_VIDEO_TYPE(11),
    USER_CLOSE_DUET_OR_STITCH_AND_NOT_SELF(12),
    AUTHOR_SETTING_FORBID(13),
    COMMERCE_USER_NOT_COMMERCE_MUSIC(15),
    NO_INTERNET(16),
    DOWNLOAD_FAILED(17),
    SERVER_CHECK_DENY(19),
    CONTEXT_NULL(21),
    AWEME_ID_UNAVAILABLE(22),
    IS_PUBLISH(23),
    SD_CARD_NOT_ENOUGH_SPACE(24),
    SD_CARD_NOT_AVAILABLE(25),
    VIDEO_IS_NOT_EXIT(26),
    CHILDREN_MODE(27),
    DUAL_MODE(28),
    VIDEO_URL_MODEL_IS_NULL(29),
    AWEME_TYPE_IS_NON_NATIVE_ADX_AD(30);

    public final int LJLIL;

    public static EnumC44070HRi valueOf(String str) {
        return (EnumC44070HRi) V0N.LJJJ(EnumC44070HRi.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    EnumC44070HRi(int i) {
        this.LJLIL = i;
    }
}
