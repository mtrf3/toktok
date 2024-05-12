package X;

/* renamed from: X.M8e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56312M8e {
    STOP_SWITCH_OPEN("stop by caller."),
    SCENE_INACTIVE("popup scene is not active."),
    INTERCEPT("popup was intercepted by "),
    CAN_SHOW_FALSE("the canShow function returns false."),
    DEBUG_STOP_SWITCH_OPEN("debug stop switch is open."),
    STATE_ERROR("popup state error."),
    DEPENDENCY("popup's dependency reason."),
    ASYNC_FALSE("popup async task returns false."),
    ASYNC_TIMEOUT("popup async task returns timeout."),
    ASYNC_EXCEPTION("popup async task execute exception ");

    public final String LJLIL;

    public static EnumC56312M8e valueOf(String str) {
        return (EnumC56312M8e) V0N.LJJJ(EnumC56312M8e.class, str);
    }

    public final String getErrMsg() {
        return this.LJLIL;
    }

    EnumC56312M8e(String str) {
        this.LJLIL = str;
    }
}
