package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS6S1100100_6;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FMX {
    public static ExecutorService LIZ;
    public static volatile CopyOnWriteArrayList<InterfaceC35766E1y> LIZIZ;
    public static final Object LIZJ = new Object();
    public static volatile boolean LIZLLL;
    public static volatile N3D LJ;
    public static volatile N3H LJFF;

    static {
        new Random();
        LIZLLL = true;
    }

    public static ExecutorService LIZIZ() {
        if (LIZ == null) {
            synchronized (FMX.class) {
                if (LIZ == null) {
                    C38027EwB LIZ2 = C38028EwC.LIZ(FSY.SERIAL);
                    LIZ2.LIZIZ = "EventUpload";
                    LIZ = C38995FSd.LIZ(LIZ2.LIZ());
                }
            }
        }
        return LIZ;
    }

    public static void LIZ(InterfaceC35766E1y interfaceC35766E1y) {
        if (!LIZLLL) {
            return;
        }
        if (LIZIZ == null) {
            synchronized (LIZJ) {
                if (LIZIZ == null) {
                    LIZIZ = new CopyOnWriteArrayList<>();
                }
            }
        }
        LIZIZ.add(interfaceC35766E1y);
    }

    public static boolean LIZJ(String str) {
        if (C38354F3m.LIZJ(EF7.LJIILIIL, "local_test") || LJ == null) {
            return true;
        }
        if (((Boolean) FMY.LIZ.getValue()).booleanValue()) {
            return !LJ.LIZ(LJFF, str, new JSONObject());
        }
        return LJ.LIZ(LJFF, str, new JSONObject());
    }

    public static void onEvent(MobClick mobClick) {
        if (!TextUtils.isEmpty(mobClick.getExtValueStr())) {
            LJFF(CastLongProtector.parseLong(mobClick.getExtValueStr()), mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), mobClick.getExtJson());
        } else {
            LJFF(mobClick.getExtValueLong(), mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), mobClick.getExtJson());
        }
        mobClick.recycle();
    }

    public static void onEventV3(String str) {
        try {
            AppLogNewUtils.onEventV3(str, new JSONObject());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (!LIZLLL || LIZIZ == null) {
            return;
        }
        Iterator<InterfaceC35766E1y> it = LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().onEvent(str);
        }
    }

    public static void LIZLLL(String str, java.util.Map<String, String> map) {
        if (LIZLLL && LIZIZ != null) {
            Iterator<InterfaceC35766E1y> it = LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().onEvent(str, map);
            }
        }
    }

    public static void LJ(String str, JSONObject jSONObject) {
        if (LIZLLL && LIZIZ != null) {
            Iterator<InterfaceC35766E1y> it = LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().onEvent(str, jSONObject);
            }
        }
    }

    public static void LJIIJJI(String str, Bundle bundle) {
        try {
            AppLogNewUtils.LIZJ(str, bundle);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJIIL(String eventName, java.util.Map map) {
        YG0 yg0;
        try {
            if (((Boolean) C2TX.LIZIZ.getValue()).booleanValue()) {
                AppLogNewUtils.LIZLLL(eventName, map);
            } else {
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
                if (((Boolean) C2RA.LIZIZ.getValue()).booleanValue()) {
                    HandlerThreadC36423ERf.LIZJ().LIZ(new ARunnableS6S1100100_6(eventName, System.currentTimeMillis(), jSONObject, 3));
                } else {
                    AppLogNewUtils.onEventV3(eventName, jSONObject);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        LIZLLL(eventName, map);
        try {
            o.LJIIIZ(eventName, "eventName");
            o.LJIIIZ(map, "map");
            if (C49895Ji7.LIZ() && !TextUtils.isEmpty(eventName) && (yg0 = C87091YFz.LJ.get(eventName)) != null) {
                C86918Y9i.LIZ().execute(new ARunnableS25S0200000_6(yg0, map, 69));
            }
        } catch (Exception e2) {
            C78983UzD.LJIJ(e2, "MobClickConsumeLancet onEventV3 exception");
        }
        int intValue = ((Number) DVB.LIZ.getValue()).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return;
            }
        } else if (!eventName.startsWith("livesdk_")) {
            return;
        }
        try {
            RunnableC39007FSp.LIZIZ(new E31(eventName, map, System.currentTimeMillis()));
        } catch (Exception e3) {
            C16880lQ.LLLLIIL(e3);
        }
    }

    public static void LJIILJJIL(String eventName, JSONObject jSONObject) {
        YG0 yg0;
        try {
            AppLogNewUtils.onEventV3(eventName, jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        LJ(eventName, jSONObject);
        try {
            o.LJIIIZ(eventName, "eventName");
            if (C49895Ji7.LIZ() && !TextUtils.isEmpty(eventName) && (yg0 = C87091YFz.LJ.get(eventName)) != null) {
                C86918Y9i.LIZ().execute(new ARunnableS25S0200000_6(yg0, jSONObject, 68));
            }
        } catch (Exception e2) {
            C78983UzD.LJIJ(e2, "MobClickConsumeLancet onEventV3 exception");
        }
        int intValue = ((Number) DVB.LIZ.getValue()).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return;
            }
        } else if (!eventName.startsWith("livesdk_")) {
            return;
        }
        try {
            RunnableC39007FSp.LIZIZ(new E30(eventName, System.currentTimeMillis(), jSONObject));
        } catch (Exception e3) {
            C16880lQ.LLLLIIL(e3);
        }
    }

    public static void LJIILL(String str, OSZ<Object, String>... oszArr) {
        String second;
        String obj;
        HashMap hashMap = new HashMap(oszArr.length);
        for (OSZ<Object, String> osz : oszArr) {
            if (osz != null && (second = osz.getSecond()) != null) {
                Object first = osz.getFirst();
                if (first == null) {
                    obj = "";
                } else {
                    obj = first.toString();
                }
                hashMap.put(second, obj);
            }
        }
        LJIIL(str, hashMap);
        LIZLLL(str, hashMap);
    }

    public static void LJIILLIIL(String str, JSONObject jSONObject) {
        try {
            AppLogNewUtils.onEventV3(str, jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        LJ(str, jSONObject);
    }

    public static void LJIIIIZZ(String str, String str2, long j) {
        try {
            C38836FMa.LIZJ(EF7.LIZIZ(), "event_v1", str, str2, j, 0L, null);
        } catch (Exception unused) {
        }
    }

    public static void LJIILIIL(String str, java.util.Map map, boolean z) {
        if (z && !C67612l3.LIZIZ.get()) {
            XKX.LIZLLL(C48841JEv.LIZ(C67612l3.LIZJ), null, null, new C67582l0(new C67602l2(str, map, System.currentTimeMillis()), null), 3);
        } else {
            LJIIL(str, map);
        }
    }

    public static void LJII(String str, long j, String str2, String str3) {
        try {
            C38836FMa.LIZJ(EF7.LIZIZ(), "event_v1", str, str2, CastLongProtector.parseLong(str3), j, null);
        } catch (Exception unused) {
        }
    }

    public static void LJIIIZ(String str, String str2, String str3, String str4) {
        try {
            C38836FMa.LIZJ(EF7.LIZIZ(), "event_v1", str, str2, CastLongProtector.parseLong(str3), CastLongProtector.parseLong(str4), null);
        } catch (Exception unused) {
        }
    }

    public static void LJI(long j, String str, String str2, String str3, JSONObject jSONObject) {
        try {
            C38836FMa.LIZIZ(EF7.LIZIZ(), str, str2, CastLongProtector.parseLong(str3), j, jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void LJIIJ(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        try {
            C38836FMa.LIZIZ(EF7.LIZIZ(), str, str2, CastLongProtector.parseLong(str3), CastLongProtector.parseLong(str4), jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void LJFF(long j, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        try {
            C38836FMa.LIZJ(EF7.LIZIZ(), str, str2, str3, CastLongProtector.parseLong(str4), j, jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
