package X;

/* renamed from: X.0JC, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0JC {
    IDLE,
    DISCONNECTED,
    RECONNECTING,
    CONNECTED,
    DESTROY;

    public static C0JC valueOf(String str) {
        return (C0JC) V0N.LJJJ(C0JC.class, str);
    }

    public final boolean isConnected() {
        if (this == CONNECTED) {
            return true;
        }
        return false;
    }

    public final boolean isDestroy() {
        if (this == DESTROY) {
            return true;
        }
        return false;
    }

    public final boolean isDisConnect() {
        if (this == DISCONNECTED) {
            return true;
        }
        return false;
    }

    public final boolean isReconnecting() {
        if (this == RECONNECTING) {
            return true;
        }
        return false;
    }
}
