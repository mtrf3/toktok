package X;

/* loaded from: classes10.dex */
public enum L84 {
    TOP_TAB("top_tab"),
    BOTTOM_TAB("bottom_tab"),
    LEFT_ICON("left_icon"),
    RIGHT_ICON("right_icon");

    public final String LJLIL;

    public static L84 valueOf(String str) {
        return (L84) V0N.LJJJ(L84.class, str);
    }

    public final String getPartStr() {
        return this.LJLIL;
    }

    L84(String str) {
        this.LJLIL = str;
    }
}
