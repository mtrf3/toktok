package X;

/* renamed from: X.Q9q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66542Q9q {
    public static final C66543Q9r LIZ;
    public static final C66543Q9r LIZIZ;
    public static final java.util.Map<String, C66543Q9r> LIZJ;

    static {
        C66543Q9r authEx = C66543Q9r.authEx(1000, "invalid_request");
        C66543Q9r authEx2 = C66543Q9r.authEx(1001, "unauthorized_client");
        C66543Q9r authEx3 = C66543Q9r.authEx(1002, "access_denied");
        C66543Q9r authEx4 = C66543Q9r.authEx(1003, "unsupported_response_type");
        C66543Q9r authEx5 = C66543Q9r.authEx(1004, "invalid_scope");
        C66543Q9r authEx6 = C66543Q9r.authEx(1005, "server_error");
        C66543Q9r authEx7 = C66543Q9r.authEx(1006, "temporarily_unavailable");
        C66543Q9r authEx8 = C66543Q9r.authEx(1007, null);
        C66543Q9r authEx9 = C66543Q9r.authEx(1008, null);
        LIZ = authEx9;
        LIZIZ = C66543Q9r.generalEx(9, "Response state param did not match request state");
        LIZJ = C66543Q9r.exceptionMapByString(authEx, authEx2, authEx3, authEx4, authEx5, authEx6, authEx7, authEx8, authEx9);
    }
}
