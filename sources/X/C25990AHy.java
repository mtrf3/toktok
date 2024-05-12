package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.AHy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25990AHy {
    public static final LinkedHashMap<String, Pair<Long, Long>> LIZ = new LinkedHashMap<>(10, 0.75f, true);
    public static final LinkedHashMap<String, Boolean> LIZIZ = new LinkedHashMap<>(10, 0.75f, true);

    public static boolean LIZ(String str) {
        Long valueOf;
        Object obj;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            valueOf = 0L;
        } else {
            LinkedHashMap<String, Pair<Long, Long>> linkedHashMap = LIZ;
            synchronized (linkedHashMap) {
                Pair<Long, Long> pair = linkedHashMap.get(str);
                if (pair != null && (obj = pair.second) != null) {
                    j = ((Long) obj).longValue();
                }
                valueOf = Long.valueOf(j);
            }
        }
        if (currentTimeMillis - valueOf.longValue() > LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            return false;
        }
        return true;
    }

    public static Long LIZJ(String str, boolean z) {
        Object obj;
        Long l = null;
        if (str == null) {
            return null;
        }
        if (z && !LIZ(str)) {
            return -1L;
        }
        LinkedHashMap<String, Pair<Long, Long>> linkedHashMap = LIZ;
        synchronized (linkedHashMap) {
            Pair<Long, Long> pair = linkedHashMap.get(str);
            if (pair != null && (obj = pair.first) != null) {
                l = Long.valueOf(((Long) obj).longValue());
            }
        }
        return l;
    }

    public static void LIZIZ(long j, String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            LinkedHashMap<String, Pair<Long, Long>> linkedHashMap = LIZ;
            synchronized (linkedHashMap) {
                Long valueOf = Long.valueOf(j);
                if (z) {
                    j2 = System.currentTimeMillis();
                }
                linkedHashMap.put(str, new Pair<>(valueOf, Long.valueOf(j2)));
                linkedHashMap.get(str);
                if (linkedHashMap.size() > 10) {
                    Iterator<Map.Entry<String, Pair<Long, Long>>> it = linkedHashMap.entrySet().iterator();
                    it.next();
                    it.remove();
                }
            }
        }
    }
}
