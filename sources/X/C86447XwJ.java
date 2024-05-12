package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XwJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86447XwJ {
    public static final java.util.Map<String, C86450XwM> LIZ = new LinkedHashMap();

    public static int LIZ(Throwable th) {
        if (th == null) {
            return 0;
        }
        if (th instanceof C29401Dk) {
            return ((C276516r) th).getErrorCode();
        }
        if (th instanceof C64698PaI) {
            return ((C64698PaI) th).getCronetInternalErrorCode();
        }
        if (th instanceof C0TL) {
            return ((C0TL) th).statusCode;
        }
        if (th instanceof C64802Pby) {
            return ((C64802Pby) th).getStatusCode();
        }
        if (th instanceof C64799Pbv) {
            return ((C64799Pbv) th).getStatusCode();
        }
        return -1;
    }

    public static long LIZIZ(Context context) {
        o.LJIIIZ(context, "<this>");
        Object LLILL = C16880lQ.LLILL(context, "activity");
        o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) LLILL).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem - memoryInfo.availMem;
    }

    public static void LIZJ(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C86450XwM c86450XwM = (C86450XwM) ((LinkedHashMap) LIZ).get(str);
        if (c86450XwM == null) {
            return;
        }
        C86448XwK c86448XwK = c86450XwM.LJLILLLLZI;
        if (c86448XwK.LJLILLLLZI != 0) {
            return;
        }
        c86448XwK.LJLILLLLZI = currentTimeMillis;
        c86448XwK.LJLJJL = currentTimeMillis - c86448XwK.LJLIL;
        C86449XwL c86449XwL = c86450XwM.LJLJI;
        c86449XwL.LJLJI = LIZIZ(c86450XwM.LJLIL) - c86449XwL.LJLILLLLZI;
    }

    public static void LIZLLL(String str, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        C86450XwM c86450XwM = (C86450XwM) ((LinkedHashMap) LIZ).get(str);
        if (c86450XwM == null) {
            return;
        }
        C86448XwK c86448XwK = c86450XwM.LJLILLLLZI;
        if (c86448XwK.LJLJI != 0) {
            return;
        }
        c86448XwK.LJLJI = currentTimeMillis;
        c86448XwK.LJLJJLL = currentTimeMillis - c86448XwK.LJLIL;
        C86449XwL c86449XwL = c86450XwM.LJLJI;
        c86449XwL.LJLJJI = LIZIZ(c86450XwM.LJLIL) - c86449XwL.LJLILLLLZI;
        c86450XwM.LJLILLLLZI.LJLJLJ = LIZ(th);
        c86450XwM.LJLJI.LJLJL = LIZ(th);
    }

    public static void LJ(String str, String eventName, Throwable th) {
        C86450XwM c86450XwM;
        o.LJIIIZ(eventName, "eventName");
        long currentTimeMillis = System.currentTimeMillis();
        java.util.Map<String, C86450XwM> map = LIZ;
        C86450XwM c86450XwM2 = (C86450XwM) ((LinkedHashMap) map).get(str);
        if (c86450XwM2 == null) {
            return;
        }
        C86448XwK c86448XwK = c86450XwM2.LJLILLLLZI;
        if (c86448XwK.LJLJJI != 0) {
            return;
        }
        c86448XwK.LJLJJI = currentTimeMillis;
        c86448XwK.LJLJL = currentTimeMillis - c86448XwK.LJLIL;
        C86449XwL c86449XwL = c86450XwM2.LJLJI;
        c86449XwL.LJLJJL = LIZIZ(c86450XwM2.LJLIL) - c86449XwL.LJLILLLLZI;
        c86450XwM2.LJLILLLLZI.LJLJLLL = LIZ(th);
        c86450XwM2.LJLJI.LJLJLJ = LIZ(th);
        if (!map.containsKey(str) || (c86450XwM = (C86450XwM) ((LinkedHashMap) map).get(str)) == null) {
            return;
        }
        C86448XwK c86448XwK2 = c86450XwM.LJLILLLLZI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(eventName);
        LIZ2.append("_show_time");
        BZI LIZ3 = C28787BRn.LIZ(X1D.LIZIZ(LIZ2));
        LIZ3.LJIJJ(Long.valueOf(c86448XwK2.LJLIL), "start_ts");
        LIZ3.LJIJJ(Long.valueOf(c86448XwK2.LJLILLLLZI), "fcp_ts");
        LIZ3.LJIJJ(Long.valueOf(c86448XwK2.LJLJI), "fmp_ts");
        LIZ3.LJIJJ(Long.valueOf(c86448XwK2.LJLJJI), "tti_ts");
        LIZ3.LJIJJ(Long.valueOf(c86448XwK2.LJLJJL), "fcp_duration");
        LIZ3.LJIJJ(Long.valueOf(c86448XwK2.LJLJJLL), "fmp_duration");
        LIZ3.LJIJJ(Long.valueOf(c86448XwK2.LJLJL), "tti_duration");
        LIZ3.LJIJJ(Integer.valueOf(c86448XwK2.LJLJLJ), "fmp_error_code");
        LIZ3.LJIJJ(Integer.valueOf(c86448XwK2.LJLJLLL), "tti_error_code");
        LIZ3.LJIJJ(c86448XwK2.LJLL, "show_entrance");
        LIZ3.LJJIIJZLJL();
        C86449XwL c86449XwL2 = c86450XwM.LJLJI;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(eventName);
        LIZ4.append("_memory");
        BZI LIZ5 = C28787BRn.LIZ(X1D.LIZIZ(LIZ4));
        LIZ5.LJIJJ(Long.valueOf(c86449XwL2.LJLIL), "start_ts");
        LIZ5.LJIJJ(Long.valueOf(c86449XwL2.LJLILLLLZI / 1024), "start_memory");
        LIZ5.LJIJJ(Long.valueOf(c86449XwL2.LJLJI / 1024), "fcp_memory_increase");
        LIZ5.LJIJJ(Long.valueOf(c86449XwL2.LJLJJI / 1024), "fmp_memory_increase");
        LIZ5.LJIJJ(Long.valueOf(c86449XwL2.LJLJJL / 1024), "tti_memory_increase");
        LIZ5.LJIJJ(c86449XwL2.LJLJJLL, "show_entrance");
        LIZ5.LJIJJ(Integer.valueOf(c86449XwL2.LJLJL), "fmp_memory_error_code");
        LIZ5.LJIJJ(Integer.valueOf(c86449XwL2.LJLJLJ), "tti_memory_error_code");
        LIZ5.LJJIIJZLJL();
        map.remove(str);
    }

    public static void LJFF(Context context, String str, String show_entrance) {
        o.LJIIIZ(show_entrance, "show_entrance");
        long currentTimeMillis = System.currentTimeMillis();
        LIZ.put(str, new C86450XwM(context, new C86448XwK(currentTimeMillis, show_entrance), new C86449XwL(currentTimeMillis, LIZIZ(context), show_entrance)));
    }
}
