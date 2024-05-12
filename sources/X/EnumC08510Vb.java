package X;

/* renamed from: X.0Vb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC08510Vb {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean isFinished() {
        if (this == SUCCEEDED || this == FAILED || this == CANCELLED) {
            return true;
        }
        return false;
    }

    public static EnumC08510Vb valueOf(String str) {
        return (EnumC08510Vb) V0N.LJJJ(EnumC08510Vb.class, str);
    }
}
