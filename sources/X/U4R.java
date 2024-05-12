package X;

import Y.ARunnableS14S1100000_13;
import Y.ARunnableS2S2000000_13;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLoggerSdkReportSetting;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U4R {
    public static long LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C30787C6l.LJLIL);

    public static void LIZ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        try {
            new ARunnableS2S2000000_13(str, msg, 0).run();
        } catch (Throwable th) {
            C0K2.LIZ("LinkMicSdkLogger Error", th);
        }
    }

    public static void LIZIZ(String str, String str2) {
        try {
            new ARunnableS2S2000000_13(str, str2, 1).run();
        } catch (Throwable th) {
            C0K2.LIZ("LinkMicSdkLogger Error", th);
        }
    }

    public static void LIZJ(String str, Throwable th) {
        try {
            new ARunnableS14S1100000_13(th, str, 16).run();
        } catch (Throwable th2) {
            C0K2.LIZ("LinkMicSdkLogger Error", th2);
        }
    }

    public static void LIZLLL(String TAG, String msg) {
        o.LJIIIZ(TAG, "TAG");
        o.LJIIIZ(msg, "msg");
        try {
            new ARunnableS2S2000000_13(TAG, msg, 2).run();
        } catch (Throwable th) {
            C0K2.LIZ("LinkMicSdkLogger Error", th);
        }
    }

    public static void LJ(String str, String str2) {
        U4S u4s = U4S.ERROR;
        LinkMicLoggerSdkReportSetting linkMicLoggerSdkReportSetting = LinkMicLoggerSdkReportSetting.INSTANCE;
        if (linkMicLoggerSdkReportSetting.getValue().sladarReportEnabled) {
            String str3 = linkMicLoggerSdkReportSetting.getValue().sladarReportLevel;
            if (o.LJ(str3, "info")) {
                u4s = U4S.INFO;
            } else {
                o.LJ(str3, "error");
            }
            if (u4s.LJLIL <= 2) {
                LinkedHashMap LIZ2 = C0JU.LIZ("event_id", str);
                LIZ2.put("room_id", String.valueOf(LIZ));
                LIZ2.put("msg", str2);
                C0K2.LJII(0, "ttlive_link_mic_sdk", C113554cx.LJJLIIIJLLLLLLLZ(LIZ2));
            }
        }
    }
}
