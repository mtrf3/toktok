package X;

/* loaded from: classes10.dex */
public enum LSO {
    CLICK_TAB("click_tab"),
    SWITCH_TAB("switch_tab"),
    CLICK_BUBBLE("click_bubble"),
    WEB_TO_APP("webtoapp"),
    OTHER("other");

    public final String LJLIL;

    public static LSO valueOf(String str) {
        return (LSO) V0N.LJJJ(LSO.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    LSO(String str) {
        this.LJLIL = str;
    }
}
