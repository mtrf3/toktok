package X;

/* renamed from: X.12F, reason: invalid class name */
/* loaded from: classes.dex */
public enum C12F {
    CMD_NEW_TIP,
    CMD_HIDE_TIP,
    CMD_ORIENTATION_CHANGED,
    CMD_CLICK_FLOAT_BALL,
    CMD_CLICK_MSG_BTN_CHECKED,
    CMD_CLICK_MSG_BTN_UNCHECKED,
    CMD_CLICK_SMALL_WINDOW,
    CMD_DRAG_MOVE_START,
    CMD_DRAG_ONGOING,
    CMD_DRAG_MOVE_END,
    CMD_SEND_FIRST_SNAP_TIP,
    CMD_TRANSITION_TO_INIT,
    CMD_TRANSITION_TO_HIDDEN,
    CMD_TRANSITION_TO_DESTROY,
    CMD_TRANSITION_TO_SMALL,
    CMD_TRANSITION_TO_FLOATING;

    public Object LJLIL;

    public static C12F valueOf(String str) {
        return (C12F) V0N.LJJJ(C12F.class, str);
    }

    public final Object getParam() {
        return this.LJLIL;
    }

    public final void setParam(Object obj) {
        this.LJLIL = obj;
    }
}
