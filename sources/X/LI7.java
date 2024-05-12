package X;

/* loaded from: classes10.dex */
public enum LI7 {
    NULL("null"),
    COLD_START("cold_start"),
    HOMEPAGE_RECREATE("homepage_recreate"),
    POLLING("polling"),
    NUMBER_DOT_CHANGE("number_dot_change"),
    COMPENSATE_BY_FOREGROUND("compensate_by_foreground"),
    NON_PERSONALIZED_FEED_CHANGE("non_personalized_feed_change");

    public final String LJLIL;

    public static LI7 valueOf(String str) {
        return (LI7) V0N.LJJJ(LI7.class, str);
    }

    public final String getScene() {
        return this.LJLIL;
    }

    LI7(String str) {
        this.LJLIL = str;
    }
}
