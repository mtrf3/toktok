package X;

/* renamed from: X.Tbu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC74990Tbu {
    USER_CLICK("turn_on_with_user_click"),
    AUDIENCE_OPEN("audience_open"),
    AUTO_START("turn_on_with_auto_start"),
    RESTART_AFTER_MIC_ROOM("turn_on_with_restart_after_mic_room"),
    RESTART_AFTER_CO_HOST("turn_on_with_restart_after_co_host"),
    ACTIVITY_PAGE_OPEN("turn_on_with_activity_page"),
    ADAPT_MIC_ROOM("turn_on_adapt_mic_room");

    public String value;

    public static EnumC74990Tbu valueOf(String str) {
        return (EnumC74990Tbu) V0N.LJJJ(EnumC74990Tbu.class, str);
    }

    EnumC74990Tbu(String str) {
        this.value = str;
    }
}
