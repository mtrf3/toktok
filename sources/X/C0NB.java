package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;

/* renamed from: X.0NB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NB {
    public static final BZL LIZ = ((ILoggerService) CN1.LIZ(ILoggerService.class)).la0();

    public static boolean LIZJ() {
        return LIZ.LIZIZ();
    }

    public static void LIZ(String str) {
        LIZ.d("ALogger", str);
    }

    public static void LIZLLL(String str) {
        LIZ.e("ALogger", str);
    }

    public static void LJII(Throwable th) {
        LIZ.e("ALogger", null, th);
    }

    public static void LJIIIIZZ(String str) {
        LIZ.i("ALogger", str);
    }

    public static void LIZIZ(String str, String str2) {
        LIZ.d(str, str2);
    }

    public static void LJ(String str, String str2) {
        LIZ.e(str, str2);
    }

    public static void LJI(String str, Throwable th) {
        LIZ.e(str, null, th);
    }

    public static void LJIIIZ(String str, String str2) {
        LIZ.i(str, str2);
    }

    public static void LJIIJJI(String str, String str2) {
        LIZ.v(str, str2);
    }

    public static void LJIIL(String str, String str2) {
        LIZ.w(str, str2);
    }

    public static void LJFF(String str, String str2, Throwable th) {
        LIZ.e(str, str2, th);
    }

    public static void LJIIJ(int i, String str, StackTraceElement[] stackTraceElementArr) {
        LIZ.LIZJ(i, str, stackTraceElementArr);
    }
}
