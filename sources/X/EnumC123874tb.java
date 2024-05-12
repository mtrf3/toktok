package X;

/* renamed from: X.4tb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123874tb {
    NONE(0),
    DRAFT(1),
    VIDEO(2),
    AUDIO(3),
    IMAGE(4),
    TRANSITION(5),
    EFFECT(6),
    FILTER(7),
    STICKER(8),
    FLOWER(9),
    FONT(10),
    SRT(11),
    ADJUST(12),
    ANIMATION_STICKER(15),
    ANIMATION_VIDEO(16),
    MASK(17),
    PIN(18),
    INFO_STICKER(19),
    IMAGE_STICKER(20),
    TEXT_STICKER(21),
    SUBTITLE_STICKER(22),
    EMOJI_STICKER(23),
    TIME_EFFECT(24),
    CHER_EFFECT(25),
    CHROMA(26),
    ANIMATION_TEXT(27),
    LYRIC_STICKER(28),
    COMPOSER(29),
    AUTOSUBTITLE_STICKER(30),
    TEXT_TEMPLATE(31),
    MIX_MODE(32),
    BUBBLE(33),
    TEXT_SHAPE(34),
    BEAUTY(35),
    SOUND(36),
    RECORD(37),
    ALGORITHM_MV_AUDIO(38),
    MUSIC_MV_AUDIO(39),
    NORMAL_MV_AUDIO(40),
    VOICE_CHANGER_FILTER(41),
    KARAOKE_USER_AUDIO(42),
    ALGORITHM_AUDIO(43),
    AUDIO_DSP_FILTER(44),
    IMAGE_RAW(45),
    EFFECT_STICKER(46),
    AI_MATTING(47),
    AUTO_FILL_FRAME(48),
    CHART_DATA(49),
    COMPOSITE(50),
    ANIMATION_VIDEO_IN(51),
    ANIMATION_VIDEO_OUT(52),
    ANIMATION_VIDEO_COMBO(53);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC123874tb swigToEnum(int i) {
        EnumC123874tb[] enumC123874tbArr = (EnumC123874tb[]) EnumC123874tb.class.getEnumConstants();
        if (i < enumC123874tbArr.length && i >= 0) {
            EnumC123874tb enumC123874tb = enumC123874tbArr[i];
            if (enumC123874tb.LJLIL == i) {
                return enumC123874tb;
            }
        }
        for (EnumC123874tb enumC123874tb2 : enumC123874tbArr) {
            if (enumC123874tb2.LJLIL == i) {
                return enumC123874tb2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC123874tb.class, " with value ", i));
    }

    public static EnumC123874tb valueOf(String str) {
        return (EnumC123874tb) V0N.LJJJ(EnumC123874tb.class, str);
    }

    EnumC123874tb(int i) {
        this.LJLIL = i;
    }
}
