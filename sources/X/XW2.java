package X;

/* loaded from: classes16.dex */
public enum XW2 {
    TAB_AI("recommend"),
    TAB_COLLECT("favorite"),
    TAB_RECENT("recent");

    public final String LJLIL;

    public static XW2 valueOf(String str) {
        return (XW2) V0N.LJJJ(XW2.class, str);
    }

    public final String getStringValue() {
        return this.LJLIL;
    }

    XW2(String str) {
        this.LJLIL = str;
    }
}
