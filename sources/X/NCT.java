package X;

/* loaded from: classes11.dex */
public enum NCT {
    IMMEDIATE("immediate"),
    PLAY_START("playstart"),
    PLAY_RESTART("playrestart"),
    PLAY_PAUSE("playpause"),
    PLAY_RESUME("playresume"),
    PLAY_END("playend"),
    PLAY_PROGRESS("playprogress"),
    LIKE("like"),
    COMMENT("comment"),
    SHARE("share"),
    FAVORITE("favorite"),
    LONG_PRESS("longpress"),
    SLIDE("slide"),
    TAP("tap"),
    SHAKE("shake"),
    OTHER_SHOW("othershow"),
    OTHER_HIDE("otherhide"),
    OTHER_SHOW_FAILURE("othershowfailure"),
    BY_BUSINESS("bybusiness");

    public final String LJLIL;

    public static NCT valueOf(String str) {
        return (NCT) V0N.LJJJ(NCT.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    NCT(String str) {
        this.LJLIL = str;
    }
}
