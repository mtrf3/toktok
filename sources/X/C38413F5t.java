package X;

import Y.IDrS12S0000000_6;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.F5t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38413F5t {
    public static final List<String> LIZ;
    public static final C38414F5u LIZIZ;
    public static final IDrS12S0000000_6 LIZJ;
    public static final ConcurrentHashMap<String, Long> LIZLLL;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        arrayList.add("android.intent.action.BATTERY_CHANGED");
        arrayList.add("android.net.wifi.RSSI_CHANGED");
        LIZIZ = new C38414F5u();
        LIZJ = new IDrS12S0000000_6(0);
        LIZLLL = new ConcurrentHashMap<>();
    }

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZLLL;
        if (concurrentHashMap.containsKey(str)) {
            if (SystemClock.elapsedRealtime() - concurrentHashMap.get(str).longValue() <= ((Number) C34921DnB.LIZ.getValue()).longValue()) {
                return false;
            }
            concurrentHashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            return true;
        }
        concurrentHashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        return true;
    }
}
