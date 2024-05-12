package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fgp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39623Fgp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C55668Lt2 c55668Lt2) {
        String stackTraceString = android.util.Log.getStackTraceString(new C39624Fgq("NOT A CRASH !!!", c55668Lt2));
        o.LJIIIIZZ(stackTraceString, "getStackTraceString(bugReportRuntimeIssue)");
        LIZIZ(stackTraceString);
    }

    public static void LIZIZ(String str) {
        if (C187857Yv.LIZ >= 1) {
            AbstractC73672Svk.LJJIJIL(str).LJJL(T16.LIZ()).LJJIJL(C35802E3i.LJLIL).LJJJLIIL(C35803E3j.LJLIL, C35804E3k.LJLIL);
        } else {
            C36922EeM.LIZLLL(6, "BugReportCrashUtil", "can't report:".concat(str));
        }
    }

    public static void LIZJ(String str) {
        try {
            if (!Npth.isInit()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Npth is not init, report abort:");
                LIZ2.append(str);
                C36922EeM.LIZLLL(6, "BugReportCrashUtil", X1D.LIZIZ(LIZ2));
                return;
            }
            C64268PKe LIZLLL = C64268PKe.LIZLLL();
            CrashType crashType = CrashType.JAVA;
            PKN pkn = new PKN(new JSONObject());
            pkn.LJIIJJI("data", PKW.LIZJ(new C39625Fgr(str)));
            pkn.LJIIJJI("isOOM", Boolean.FALSE);
            pkn.LJIIJJI("crash_time", Long.valueOf(System.currentTimeMillis()));
            C63986P9i.LJIIIIZZ(C63986P9i.LJI(), LIZLLL.LIZ(crashType, pkn).LIZ.toString());
        } catch (Throwable th) {
            C36922EeM.LJFF(th);
        }
    }
}
