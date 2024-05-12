package X;

/* renamed from: X.M8f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56313M8f {
    STOP_SWITCH_OPEN(101),
    SCENE_INACTIVE(102),
    INTERCEPT(103),
    CAN_SHOW_FALSE(104),
    DEBUG_STOP_SWITCH_OPEN(105),
    STATE_ERROR(106),
    DEPENDENCY(107),
    ASYNC_FALSE(108),
    EXCEPTION(1011);

    public final int LJLIL;

    public static EnumC56313M8f valueOf(String str) {
        return (EnumC56313M8f) V0N.LJJJ(EnumC56313M8f.class, str);
    }

    public final int getErrCode() {
        return this.LJLIL;
    }

    EnumC56313M8f(int i) {
        this.LJLIL = i;
    }
}
