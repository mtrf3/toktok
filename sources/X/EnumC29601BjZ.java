package X;

/* renamed from: X.BjZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC29601BjZ {
    SOUND_EFFECT_PANEL("sound_effect"),
    STICKER_EFFECT_PANEL("sticker_effect"),
    VOICE_EFFECT_PANEL("voice_effect"),
    BEAUTY_PANEL("beauty_effect"),
    DIALOG_BIZ_OTHERS("others");

    public final String LJLIL;

    public static EnumC29601BjZ valueOf(String str) {
        return (EnumC29601BjZ) V0N.LJJJ(EnumC29601BjZ.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC29601BjZ(String str) {
        this.LJLIL = str;
    }
}
