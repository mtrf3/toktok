package X;

/* loaded from: classes7.dex */
public enum FAB {
    WATCH_INIT,
    WATCH_EXECUTE_TRANSACTION,
    WATCH_PAUSE_TOP_ACTIVITY,
    WATCH_LAUNCH_ACTIVITY,
    WATCH_MAIN_FRAME,
    WATCH_WINDOW_FOCUS_CHANGE,
    WATCH_UI_FRAME,
    DOUBLE_CHECK_WATCH_EXECUTE_TRANSACTION,
    DOUBLE_CHECK_WATCH_MAIN_FRAME,
    DOUBLE_CHECK_WINDOW_FOCUS_CHANGE,
    DOUBLE_CHECK_WATCH_UI_FRAME;

    public static FAB valueOf(String str) {
        return (FAB) V0N.LJJJ(FAB.class, str);
    }
}
