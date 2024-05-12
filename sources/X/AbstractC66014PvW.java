package X;

import com.ss.android.agilelogger.ALog;

/* renamed from: X.PvW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66014PvW {
    public static AbstractC66014PvW LIZ;

    public AbstractC66014PvW() {
        LIZ = this;
    }

    public static void LIZ(String str, String str2) {
        AbstractC66014PvW abstractC66014PvW = LIZ;
        if (abstractC66014PvW == null) {
            return;
        }
        abstractC66014PvW.getClass();
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(str, str2);
    }

    public static void LIZIZ(String str, String str2, Throwable th) {
        AbstractC66014PvW abstractC66014PvW = LIZ;
        if (abstractC66014PvW == null) {
            return;
        }
        abstractC66014PvW.getClass();
        ALog.e(str, str2, th);
    }
}
