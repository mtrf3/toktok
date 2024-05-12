package X;

/* renamed from: X.12S, reason: invalid class name */
/* loaded from: classes.dex */
public /* synthetic */ class C12S {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C12F.values().length];
        try {
            iArr[C12F.CMD_ORIENTATION_CHANGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C12F.CMD_DRAG_MOVE_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C12F.CMD_SEND_FIRST_SNAP_TIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C12F.CMD_DRAG_ONGOING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[C12F.CMD_NEW_TIP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[C12F.CMD_HIDE_TIP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[C12F.CMD_CLICK_FLOAT_BALL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        LIZ = iArr;
    }
}
