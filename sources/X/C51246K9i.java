package X;

import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;

/* renamed from: X.K9i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51246K9i {
    public static long LIZ;
    public static long LIZIZ;
    public static final /* synthetic */ int LIZJ = 0;

    public static void LIZ(ISearchMiddleForECService iSearchMiddleForECService, ActivityC45651qj activityC45651qj) {
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZ(activityC45651qj)) {
            if (iSearchMiddleForECService != null) {
                iSearchMiddleForECService.LJJIIJ();
            }
        } else {
            LIZ = 0L;
            LIZIZ = 0L;
        }
    }

    public static C51245K9h LIZIZ(ISearchMiddleForECService iSearchMiddleForECService, ActivityC45651qj activityC45651qj) {
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZ(activityC45651qj)) {
            if (iSearchMiddleForECService != null) {
                iSearchMiddleForECService.LJIILJJIL();
            }
            return new C51245K9h();
        }
        C51245K9h c51245K9h = new C51245K9h();
        c51245K9h.LJIILL("new_sug_session_start_time", String.valueOf(LIZ));
        c51245K9h.LJIILL("new_sug_session_end_time", String.valueOf(LIZIZ));
        c51245K9h.LJIILL("new_sug_session_cost", String.valueOf(LIZIZ - LIZ));
        return c51245K9h;
    }

    public static void LIZJ(ISearchMiddleForECService iSearchMiddleForECService, ActivityC45651qj activityC45651qj) {
        C51141K5h.LIZ.getClass();
        if (C51141K5h.LIZ(activityC45651qj)) {
            if (iSearchMiddleForECService != null) {
                iSearchMiddleForECService.LJ();
            }
        } else if (LIZ == 0) {
            LIZ = System.currentTimeMillis();
        }
    }
}
