package X;

/* renamed from: X.HHk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC43812HHk {
    RECORD_VIDEO_SOUND(1),
    UPLOAD_VIDEO_SOUND(2),
    EDIT_RECORD_SOUND(4),
    VOLUME_NOT_MUTE(8),
    MUSIC(16),
    EDIT_AUDIO_EFFECT(32),
    RECORD_UPLOAD_VIDEO_SOUND(64);

    public final int LJLIL;

    public static EnumC43812HHk valueOf(String str) {
        return (EnumC43812HHk) V0N.LJJJ(EnumC43812HHk.class, str);
    }

    public final int getTag() {
        return this.LJLIL;
    }

    EnumC43812HHk(int i) {
        this.LJLIL = i;
    }
}
