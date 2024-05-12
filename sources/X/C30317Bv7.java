package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveWidgetSlardarSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Bv7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30317Bv7 {
    public static final java.util.Map<Integer, YA1> LIZ = new LinkedHashMap();
    public static final java.util.Map<InterfaceC30319Bv9, Long> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<InterfaceC30319Bv9, Long> LIZJ = new LinkedHashMap();
    public static final java.util.Map<InterfaceC30319Bv9, Integer> LIZLLL = new LinkedHashMap();

    public static void LIZIZ(RecyclableWidgetManager recyclableWidgetManager) {
        if (recyclableWidgetManager != null) {
            LIZLLL.remove(recyclableWidgetManager);
            LIZIZ.remove(recyclableWidgetManager);
            LIZJ.remove(recyclableWidgetManager);
        }
    }

    public static long LIZJ(InterfaceC30319Bv9 widgetManager) {
        o.LJIIIZ(widgetManager, "widgetManager");
        Long l = (Long) ((LinkedHashMap) LIZIZ).get(widgetManager);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static long LIZLLL(RecyclableWidgetManager recyclableWidgetManager) {
        long LIZJ2;
        long uptimeMillis;
        if (LJ(recyclableWidgetManager) == 0) {
            LIZJ2 = LIZJ(recyclableWidgetManager);
            if (LIZJ2 <= 0) {
                return 0L;
            }
            uptimeMillis = System.currentTimeMillis();
        } else {
            LIZJ2 = LIZJ(recyclableWidgetManager);
            if (LIZJ2 <= 0) {
                return 0L;
            }
            uptimeMillis = SystemClock.uptimeMillis();
        }
        return uptimeMillis - LIZJ2;
    }

    public static int LJ(InterfaceC30319Bv9 widgetManager) {
        o.LJIIIZ(widgetManager, "widgetManager");
        Integer num = (Integer) ((LinkedHashMap) LIZLLL).get(widgetManager);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static void LJFF(int i) {
        YA1 ya1 = (YA1) ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
        if (ya1 != null) {
            Iterator it = ((HashMap) ya1.LJLJJI).entrySet().iterator();
            while (it.hasNext()) {
                ya1.LJLJJL.LIZ(((Map.Entry) it.next()).getValue());
            }
            ((HashMap) ya1.LJLJJI).clear();
            for (Map.Entry entry : ((HashMap) ya1.LJLJJLL).entrySet()) {
                ya1.LJJI(i, (String) entry.getKey(), (YA2) entry.getValue());
                ya1.LJLJL.LIZ(entry.getValue());
            }
            ((HashMap) ya1.LJLJJLL).clear();
        }
        LIZ.remove(Integer.valueOf(i));
        ((LinkedHashMap) LIZIZ).clear();
        ((LinkedHashMap) LIZJ).clear();
    }

    public static void LIZ(int i, RecyclableWidgetManager recyclableWidgetManager) {
        if (LiveWidgetSlardarSetting.INSTANCE.getValue() && recyclableWidgetManager != null) {
            recyclableWidgetManager.addSubWidgetManagerListener(new C30310Bv0(i));
        }
    }

    public static void LJI(int i, RecyclableWidgetManager recyclableWidgetManager) {
        long currentTimeMillis;
        if (LiveWidgetSlardarSetting.INSTANCE.getValue() && recyclableWidgetManager != null) {
            LIZLLL.put(recyclableWidgetManager, Integer.valueOf(i));
            if (i == 0) {
                java.util.Map<InterfaceC30319Bv9, Long> map = LIZIZ;
                EnterRoomConfig.TimeStamp timeStamp = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.timeStamps;
                if (timeStamp != null) {
                    currentTimeMillis = timeStamp.enterRoomStarTime;
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                map.put(recyclableWidgetManager, Long.valueOf(currentTimeMillis));
            } else {
                LIZIZ.put(recyclableWidgetManager, Long.valueOf(SystemClock.uptimeMillis()));
            }
            LIZJ.put(recyclableWidgetManager, Long.valueOf(SystemClock.uptimeMillis()));
            if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
                recyclableWidgetManager.addRecyclableWidgetEventListener(new C86935Y9z());
            }
            java.util.Map<Integer, YA1> map2 = LIZ;
            YA1 ya1 = (YA1) ((LinkedHashMap) map2).get(Integer.valueOf(i));
            if (ya1 == null) {
                ya1 = new YA1();
                map2.put(Integer.valueOf(i), ya1);
            }
            recyclableWidgetManager.addRecyclableWidgetEventListener(ya1);
        }
    }
}
