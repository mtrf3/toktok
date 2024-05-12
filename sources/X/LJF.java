package X;

/* loaded from: classes10.dex */
public enum LJF {
    SLIDE("slide"),
    CLICK_TOP_ICON("click_top_icon"),
    CLICK_BOTTOM_ICON("click_bottom_icon"),
    GOBACK_ICON("goback_icon"),
    OPEN_APP("open_app");

    public final String LJLIL;

    public static LJF valueOf(String str) {
        return (LJF) V0N.LJJJ(LJF.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    LJF(String str) {
        this.LJLIL = str;
    }
}
