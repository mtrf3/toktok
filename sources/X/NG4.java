package X;

/* loaded from: classes11.dex */
public enum NG4 {
    TOP_CARD("top_card"),
    BOTTOM_CARD("bottom_card"),
    DESCRIPTIVE_CARD("descriptive_card"),
    NON_DESCRIPTIVE("non_descriptive");

    public final String LJLIL;

    public static NG4 valueOf(String str) {
        return (NG4) V0N.LJJJ(NG4.class, str);
    }

    public final String getSceneName() {
        return this.LJLIL;
    }

    NG4(String str) {
        this.LJLIL = str;
    }
}
