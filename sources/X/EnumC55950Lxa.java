package X;

/* renamed from: X.Lxa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC55950Lxa {
    ANCHOR_PANEL_SHOW("anchor_panel_show"),
    REQUEST_REACH_CFG("request_reach_cfg"),
    ANCHOR_PANEL_HIDE("anchor_panel_hide"),
    VIDEO_GUIDE_SHOW_SUCCESS("video_guide_show_success"),
    VIDEO_GUIDE_SHOW_FAIL("video_guide_show_fail"),
    VIDEO_GUIDE_DISMISS("video_guide_dismiss");

    public final String LJLIL;

    public static EnumC55950Lxa valueOf(String str) {
        return (EnumC55950Lxa) V0N.LJJJ(EnumC55950Lxa.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC55950Lxa(String str) {
        this.LJLIL = str;
    }
}
