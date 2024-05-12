package X;

import com.ss.android.agilelogger.ALog;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.EjS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37238EjS {
    public static final void LIZIZ(String str) {
        LIZLLL(6, str, null);
    }

    public static final void LIZJ(String str, Throwable th) {
        LIZLLL(4, str, th);
    }

    public static final void LJFF(String str) {
        LJI(6, str, null);
    }

    public static void LIZ(String message) {
        o.LJIIJ(message, "message");
        String LJ = LJ(message);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJ);
        LIZ.append(android.util.Log.getStackTraceString(null));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("PiaCore", X1D.LIZIZ(LIZ));
    }

    public static String LJ(String str) {
        if (ujb.o.LJJJLIIL(str, "[PIA]", false)) {
            return str;
        }
        return i0.LJFF("[PIA] ", str);
    }

    public static void LJII(String message) {
        o.LJIIJ(message, "message");
        String LJ = LJ(message);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJ);
        LIZ.append(android.util.Log.getStackTraceString(null));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV("PiaCore", X1D.LIZIZ(LIZ));
    }

    public static void LIZLLL(int i, String message, Throwable th) {
        String tag = null;
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            tag = "PiaCore";
        }
        o.LJIIJ(message, "message");
        o.LJIIJ(tag, "tag");
        String LJ = LJ(message);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJ);
        LIZ.append(android.util.Log.getStackTraceString(th));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(tag, X1D.LIZIZ(LIZ));
    }

    public static void LJI(int i, String message, Throwable th) {
        String tag = null;
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            tag = "PiaCore";
        }
        o.LJIIJ(message, "message");
        o.LJIIJ(tag, "tag");
        String LJ = LJ(message);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJ);
        LIZ.append(android.util.Log.getStackTraceString(th));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(tag, X1D.LIZIZ(LIZ));
    }

    public static void LJIIIIZZ(int i, String message, Throwable th) {
        String tag = null;
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            tag = "PiaCore";
        }
        o.LJIIJ(message, "message");
        o.LJIIJ(tag, "tag");
        String LJ = LJ(message);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJ);
        LIZ.append(android.util.Log.getStackTraceString(th));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(tag, X1D.LIZIZ(LIZ));
    }
}
