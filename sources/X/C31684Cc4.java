package X;

import Y.ARunnableS41S0100000_5;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Cc4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31684Cc4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ(InterfaceC31710CcU interfaceC31710CcU) {
        String str;
        String str2;
        if (interfaceC31710CcU != null) {
            str = interfaceC31710CcU.LIZ();
            Enum LLJJJJLIIL = interfaceC31710CcU.LLJJJJLIIL();
            if (LLJJJJLIIL != null) {
                str2 = LLJJJJLIIL.name();
                C38995FSd.LIZIZ().execute(new RunnableC28216B5o("live_slot_click", str, str2, null));
            }
        } else {
            str = null;
        }
        str2 = null;
        C38995FSd.LIZIZ().execute(new RunnableC28216B5o("live_slot_click", str, str2, null));
    }

    public static long LIZ(String str, java.util.Map map) {
        java.util.Map map2;
        String str2;
        if (map == null) {
            return 0L;
        }
        Object obj = map.get("param_live_show_time");
        if (!(obj instanceof java.util.Map) || (map2 = (java.util.Map) obj) == null || (str2 = (String) map2.get(str)) == null) {
            return 0L;
        }
        try {
            return CastLongProtector.parseLong(str2);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void LJFF(InterfaceC31710CcU interfaceC31710CcU, java.util.Map map) {
        String str;
        String str2 = null;
        if (interfaceC31710CcU != null) {
            str = interfaceC31710CcU.LIZ();
            Enum LLJJJJLIIL = interfaceC31710CcU.LLJJJJLIIL();
            if (LLJJJJLIIL != null) {
                str2 = LLJJJJLIIL.name();
            }
        } else {
            str = null;
        }
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_live_slot_show")) {
            C38995FSd.LIZIZ().execute(new RunnableC28216B5o("live_slot_show", str, str2, map));
        }
    }

    public static void LIZIZ(String str, InterfaceC31710CcU interfaceC31710CcU, String message) {
        o.LJIIIZ(message, "message");
        LIZJ(str, interfaceC31710CcU, message, null);
    }

    public static void LIZLLL(String str, String message, Object obj) {
        o.LJIIIZ(message, "message");
        C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(obj, 334));
    }

    public static void LIZJ(String str, InterfaceC31710CcU interfaceC31710CcU, String message, Object obj) {
        o.LJIIIZ(message, "message");
        if (interfaceC31710CcU != null) {
            interfaceC31710CcU.LIZ();
            Enum LLJJJJLIIL = interfaceC31710CcU.LLJJJJLIIL();
            if (LLJJJJLIIL != null) {
                LLJJJJLIIL.name();
            }
        }
        LIZLLL(str, message, obj);
    }
}
