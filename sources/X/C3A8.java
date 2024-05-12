package X;

/* renamed from: X.3A8, reason: invalid class name */
/* loaded from: classes2.dex */
public enum C3A8 {
    INITIAL_STATE(0),
    ACTIVITY_STATUS_ENABLE(1),
    MSG_RECEIVED(0),
    OPTIMIZATION_ENABLE(0);

    public final int LJLIL;

    public static C3A8 valueOf(String str) {
        return (C3A8) V0N.LJJJ(C3A8.class, str);
    }

    public final int getState() {
        return this.LJLIL;
    }

    C3A8(int i) {
        this.LJLIL = i;
    }
}
