package X;

/* renamed from: X.4tc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123884tc {
    NONE(0),
    VIDEO(2),
    AUDIO(3),
    IMAGE(4),
    TRANSITION(5),
    EFFECT(6),
    FILTER(7),
    INFO_STICKER(8),
    IMAGE_STICKER(9),
    TEXT_STICKER(10),
    SUBTITLE_STICKER(11),
    EMOJI_STICKER(12),
    TIME_EFFECT(13),
    TEXT_TEMPLATE(14),
    VIDEO_ANIMATION(15),
    MASK(16),
    CHROMA(17),
    MV(18);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC123884tc swigToEnum(int i) {
        EnumC123884tc[] enumC123884tcArr = (EnumC123884tc[]) EnumC123884tc.class.getEnumConstants();
        if (i < enumC123884tcArr.length && i >= 0) {
            EnumC123884tc enumC123884tc = enumC123884tcArr[i];
            if (enumC123884tc.LJLIL == i) {
                return enumC123884tc;
            }
        }
        for (EnumC123884tc enumC123884tc2 : enumC123884tcArr) {
            if (enumC123884tc2.LJLIL == i) {
                return enumC123884tc2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC123884tc.class, " with value ", i));
    }

    public static EnumC123884tc valueOf(String str) {
        return (EnumC123884tc) V0N.LJJJ(EnumC123884tc.class, str);
    }

    EnumC123884tc(int i) {
        this.LJLIL = i;
    }
}
