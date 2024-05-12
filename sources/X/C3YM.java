package X;

/* renamed from: X.3YM, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3YM {
    COLDUP_FULL("coldup_full"),
    COLDUP_DIFF("coldup"),
    WS_DIFF("frontier"),
    FONT_DIFF("font"),
    LOADER_DIFF("loader_diff"),
    MISSING_PAGE("missing_page");

    public final String LJLIL;

    public static C3YM valueOf(String str) {
        return (C3YM) V0N.LJJJ(C3YM.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    C3YM(String str) {
        this.LJLIL = str;
    }
}
