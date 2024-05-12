package X;

/* loaded from: classes7.dex */
public enum FAV {
    APPLICATION("application_"),
    MAIN_ACT_CREATE("main_act_"),
    RESUME_TO_FOCUS("resume_to_focus_"),
    FEED_UI_TO_VIDEO("ui_to_video_"),
    OTHER("other_");

    public final String LJLIL;

    public static FAV valueOf(String str) {
        return (FAV) V0N.LJJJ(FAV.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    FAV(String str) {
        this.LJLIL = str;
    }
}
