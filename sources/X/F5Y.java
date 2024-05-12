package X;

/* loaded from: classes7.dex */
public enum F5Y {
    UNKNOWN,
    TIMEOUT,
    PENDING,
    RUNNING,
    DOWNLOADED,
    SUCCEEDED,
    FAILED,
    CANCELED;

    public static F5Y valueOf(String str) {
        return (F5Y) V0N.LJJJ(F5Y.class, str);
    }

    public final boolean isFinished() {
        if (this == SUCCEEDED || this == FAILED || this == CANCELED || this == DOWNLOADED || this == UNKNOWN) {
            return true;
        }
        return false;
    }
}
