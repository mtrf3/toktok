package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import defpackage.i0;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class CA3 {
    public static final java.util.Map<String, Object> LIZ = new LinkedHashMap();
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static long LJ = -1;

    public static long LIZIZ(long j, long j2) {
        if (j == -1 || j2 <= j) {
            return -1L;
        }
        return j2 - j;
    }

    public static void LIZJ(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("banner_type", 2);
        linkedHashMap.put("dynamic_banner_container_type", Integer.valueOf(i));
        linkedHashMap.put("dynamic_banner_engine_type", 1);
        linkedHashMap.put("duration", Long.valueOf(LIZIZ(LIZIZ, elapsedRealtime)));
        LJFF(0, "show", linkedHashMap);
    }

    public static void LIZ(int i, String str, String str2) {
        long j;
        EnterRoomLinkSession LIZ2;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.TimeStamp timeStamp;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("banner_state", str);
        if (str2 != null && str2.length() != 0) {
            linkedHashMap.put("fail_reason", str2);
        }
        linkedHashMap.put("reuse_type", Integer.valueOf(i));
        linkedHashMap.put("duration", Long.valueOf(LIZIZ(LIZLLL, SystemClock.elapsedRealtime())));
        C28643BLz c28643BLz = B57.LIZ;
        if (c28643BLz != null && (LIZ2 = c28643BLz.LIZ()) != null && (enterRoomConfig = LIZ2.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null && (timeStamp = roomsData.timeStamps) != null) {
            j = timeStamp.enterRoomStarTimeReal;
        } else {
            j = -1;
        }
        linkedHashMap.put("duration_from_enter_room", Long.valueOf(LIZIZ(j, System.currentTimeMillis())));
        LJFF(0, "show_state", linkedHashMap);
        LIZLLL = -1L;
    }

    public static void LJ(int i, int i2, int i3) {
        long j;
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("duration", Long.valueOf(LIZIZ(LJ, j)));
        linkedHashMap.put("dynamic_banner_container_type", Integer.valueOf(i));
        linkedHashMap.put("dynamic_banner_engine_type", 1);
        linkedHashMap.put("reuse_type", Integer.valueOf(i2));
        LJFF(0, "dynamic_load_finished", linkedHashMap);
    }

    public static void LJFF(int i, String str, java.util.Map map) {
        String LJFF = i0.LJFF("livesdk_banner_", str);
        if (C38354F3m.LIZJ(str, "show") || C38354F3m.LIZJ(str, "req_success")) {
            C0K2.LJIILL(i, 1, LJFF, map);
        } else if (!C38354F3m.LIZJ("livesdk_banner_req_success", LJFF) || LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_livesdk_banner_req_success", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
            C0K2.LJII(i, LJFF, map);
        }
        map.put("event_name", LJFF);
        if (i == 0) {
            C28733BPl.LJIILIIL().LJIIIIZZ("ttlive_banner", map);
        } else {
            C28733BPl.LJIILIIL().LJ("ttlive_banner", map);
        }
    }

    public static void LIZLLL(int i, String str, int i2, int i3) {
        long j;
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if ((i3 & 16) != 0) {
            j = SystemClock.elapsedRealtime();
        } else {
            j = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("duration", Long.valueOf(LIZIZ(LJ, j)));
        linkedHashMap.put("dynamic_banner_container_type", Integer.valueOf(i));
        linkedHashMap.put("dynamic_banner_engine_type", 1);
        linkedHashMap.put("dynamic_banner_error_reason", str);
        linkedHashMap.put("reuse_type", Integer.valueOf(i2));
        LJFF(1, "dynamic_load_finished", linkedHashMap);
    }
}
