package X;

/* renamed from: X.TYh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC74827TYh {
    DEFAULT_MODE("default_mode"),
    MANUAL_SETTING("manual_setting"),
    CLOSE_MODE("close_mode"),
    CLOSE_PERMISSION_FROM_VIEWERS("close_permission_from_viewers"),
    OPEN_MODE("open_mode"),
    LINK_MANAGEMENT_PANEL("link_management_panel");

    public final String LJLIL;

    public static EnumC74827TYh valueOf(String str) {
        return (EnumC74827TYh) V0N.LJJJ(EnumC74827TYh.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC74827TYh(String str) {
        this.LJLIL = str;
    }
}
