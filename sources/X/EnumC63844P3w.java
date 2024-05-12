package X;

/* renamed from: X.P3w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC63844P3w {
    HW_ENC_FALLBACK_NONE(0),
    VIDEO_ENC_INIT_FALLBACK(1),
    AUDIO_ENC_INIT_FALLBACK(2),
    VIDEO_ENC_ENCODING_FALLBACK(3),
    AUDIO_ENC_ENCODING_FALLBACK(4);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63844P3w valueOf(String str) {
        return (EnumC63844P3w) V0N.LJJJ(EnumC63844P3w.class, str);
    }

    EnumC63844P3w(int i) {
        this.LJLIL = i;
    }
}
