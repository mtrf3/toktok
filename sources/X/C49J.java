package X;

/* renamed from: X.49J, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C49J {
    DEFAULT_VIDEO("share_video"),
    PHOTO_MODE("share_video_photo"),
    STORY("share_video_story"),
    VIDEO_SUBSCRIPTION("share_video_sub");

    public final String LJLIL;

    public static C49J valueOf(String str) {
        return (C49J) V0N.LJJJ(C49J.class, str);
    }

    public final String getScene() {
        return this.LJLIL;
    }

    C49J(String str) {
        this.LJLIL = str;
    }
}
