package X;

/* renamed from: X.0W1, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0W1 {
    ServerDetectionFailure(1, "server detect failure"),
    UrlEmptyFailure(2, "url is empty or blank"),
    SocketHadClosedFailure(3, "socket had closed"),
    SocketOnFailureCallbackFailure(4, "on socket failure");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static C0W1 valueOf(String str) {
        return (C0W1) V0N.LJJJ(C0W1.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    public final String getMessage() {
        return this.LJLILLLLZI;
    }

    C0W1(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
