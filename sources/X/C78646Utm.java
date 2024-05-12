package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Utm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78646Utm {
    public static final C78646Utm LIZ = new C78646Utm();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C78647Utn.INSTANCE);

    public static String LJFF(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static void LIZLLL(InterfaceC65784Pro interfaceC65784Pro) {
        ((ExecutorService) LIZIZ.getValue()).execute(new C0HV(interfaceC65784Pro));
    }

    public static int LJ(EnumC41264GHk enumC41264GHk) {
        o.LJIIIZ(enumC41264GHk, "<this>");
        int i = C41263GHj.LIZ[enumC41264GHk.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    public static void LIZ(java.util.Map map, JSONObject jSONObject) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            jSONObject.putOpt((String) entry.getKey(), entry.getValue());
        }
    }

    public static long LIZIZ(C78646Utm c78646Utm, long j) {
        c78646Utm.getClass();
        if (j > 600000) {
            return -1L;
        }
        return j;
    }

    public static void LIZJ(String eventName, JSONObject params) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("track: ");
        LIZ2.append(eventName);
        LIZ2.append(", params: ");
        LIZ2.append(params.toString(4));
        C221018lt.LJFF("PerfMonitor", X1D.LIZIZ(LIZ2));
        FMX.LJIILJJIL(eventName, params);
    }
}
