package X;

/* renamed from: X.Lkg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC55150Lkg {
    LIST_VIEW("story_list_vh"),
    VIDEO_VIEW("story_video_vh"),
    PHOTO_VIEW("story_photo_vh"),
    IMMERSIVE_FEED_VIEW("story_immersive_feed_vh"),
    GUIDE_CARD_VIDEO("story_guide_card_vh_video"),
    GUIDE_CARD_PHOTO("story_guide_card_vh_photo");

    public final String LJLIL;

    public static EnumC55150Lkg valueOf(String str) {
        return (EnumC55150Lkg) V0N.LJJJ(EnumC55150Lkg.class, str);
    }

    public final String getTag() {
        return this.LJLIL;
    }

    EnumC55150Lkg(String str) {
        this.LJLIL = str;
    }
}
