package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;

/* renamed from: X.Q9p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66541Q9p {
    public static final C66543Q9r LIZ;
    public static final java.util.Map<String, C66543Q9r> LIZIZ;

    static {
        C66543Q9r c66543Q9r = C66543Q9r.tokenEx(LiveNetAdaptiveHurryTimeSetting.DEFAULT, "invalid_request");
        C66543Q9r c66543Q9r2 = C66543Q9r.tokenEx(2001, "invalid_client");
        C66543Q9r c66543Q9r3 = C66543Q9r.tokenEx(2002, "invalid_grant");
        C66543Q9r c66543Q9r4 = C66543Q9r.tokenEx(2003, "unauthorized_client");
        C66543Q9r c66543Q9r5 = C66543Q9r.tokenEx(2004, "unsupported_grant_type");
        C66543Q9r c66543Q9r6 = C66543Q9r.tokenEx(2005, "invalid_scope");
        C66543Q9r c66543Q9r7 = C66543Q9r.tokenEx(2006, null);
        C66543Q9r c66543Q9r8 = C66543Q9r.tokenEx(2007, null);
        LIZ = c66543Q9r8;
        LIZIZ = C66543Q9r.exceptionMapByString(c66543Q9r, c66543Q9r2, c66543Q9r3, c66543Q9r4, c66543Q9r5, c66543Q9r6, c66543Q9r7, c66543Q9r8);
    }
}
