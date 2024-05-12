package X;

import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.o;

/* renamed from: X.Flm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39930Flm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String msg) {
        o.LJIIJ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Forest_");
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
    }

    public static int LIZIZ(String str, String msg, Throwable th) {
        o.LJIIJ(msg, "msg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Forest_");
        LIZ2.append(str);
        return android.util.Log.e(X1D.LIZIZ(LIZ2), msg, th);
    }

    public static /* synthetic */ void LJ(String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        LIZIZ(str, str2, null);
    }

    public static int LJFF(String str, String msg, boolean z) {
        o.LJIIJ(msg, "msg");
        if (z) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Forest_");
                LIZ2.append(str);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(X1D.LIZIZ(LIZ2), msg);
            } catch (Throwable unused) {
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Forest_");
        LIZ3.append(str);
        return android.util.Log.i(X1D.LIZIZ(LIZ3), msg);
    }

    public static int LIZJ(String str, String msg, Throwable th, boolean z) {
        o.LJIIJ(msg, "msg");
        if (z) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Forest_");
                LIZ2.append(str);
                ALog.e(X1D.LIZIZ(LIZ2), msg, th);
            } catch (Throwable unused) {
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Forest_");
        LIZ3.append(str);
        return android.util.Log.e(X1D.LIZIZ(LIZ3), msg, th);
    }

    public static /* synthetic */ void LJI(String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        LJFF(str, str2, z);
    }
}
