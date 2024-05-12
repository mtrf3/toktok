package X;

/* loaded from: classes8.dex */
public enum HGV {
    PHOTO_MOVIE(1),
    MV_THEME(2),
    STATUS_UPLOAD(4),
    RECORD_PROP(8),
    EDIT_EFFECT(16),
    EDIT_STICKER(32),
    RECORD_UPLOAD_VIDEO_SOUND(64);

    public final int LJLIL;

    public static HGV valueOf(String str) {
        return (HGV) V0N.LJJJ(HGV.class, str);
    }

    public final int getTag() {
        return this.LJLIL;
    }

    HGV(int i) {
        this.LJLIL = i;
    }
}
