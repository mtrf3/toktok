package X;

import com.bytedance.pumbaa.base.settings.FrequencyConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.2Zx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60732Zx {
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<OSZ<Long, Integer>>> LIZ = new ConcurrentHashMap<>();

    public static boolean LIZ(FrequencyConfig frequencyConfig) {
        int i;
        o.LJIIIZ(frequencyConfig, "frequencyConfig");
        LIZIZ(frequencyConfig.timeInterval, frequencyConfig.name);
        CopyOnWriteArrayList<OSZ<Long, Integer>> copyOnWriteArrayList = LIZ.get(frequencyConfig.name);
        if (copyOnWriteArrayList != null) {
            i = copyOnWriteArrayList.size();
        } else {
            i = 0;
        }
        if (i <= frequencyConfig.maxCalledTimes) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(long j, String str) {
        CopyOnWriteArrayList<OSZ<Long, Integer>> copyOnWriteArrayList = LIZ.get(str);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        ArrayList arrayList = new ArrayList();
        Iterator<OSZ<Long, Integer>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            OSZ<Long, Integer> next = it.next();
            if (next.getFirst().longValue() < currentTimeMillis) {
                arrayList.add(next);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return;
        }
        copyOnWriteArrayList.removeAll(ORZ.LLJJ(arrayList));
        LIZ.put(str, copyOnWriteArrayList);
    }

    public static void LIZJ(int i, long j, FrequencyConfig frequencyConfig) {
        o.LJIIIZ(frequencyConfig, "frequencyConfig");
        LIZIZ(frequencyConfig.timeInterval, frequencyConfig.name);
        ConcurrentHashMap<String, CopyOnWriteArrayList<OSZ<Long, Integer>>> concurrentHashMap = LIZ;
        CopyOnWriteArrayList<OSZ<Long, Integer>> copyOnWriteArrayList = concurrentHashMap.get(frequencyConfig.name);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        if (copyOnWriteArrayList.size() >= frequencyConfig.maxStoreSize) {
            copyOnWriteArrayList.remove(ORZ.LLFF(copyOnWriteArrayList));
        }
        copyOnWriteArrayList.add(new OSZ<>(Long.valueOf(j), Integer.valueOf(i)));
        concurrentHashMap.put(frequencyConfig.name, copyOnWriteArrayList);
    }
}
