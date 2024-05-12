package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.otis.resource.cpu.CpuNative;
import com.bytedance.otis.resource.cpu.OtisCPUTime;
import com.bytedance.otis.resource.util.EnsureLoad;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.E8q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35940E8q {
    public static java.util.Map<Integer, Long> LJI;
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int[] LIZLLL;
    public OtisCPUTime LJ;
    public final C35941E8r LJFF;

    public final void LIZ() {
        java.util.Map<Integer, java.util.Map<Integer, Long>> threadCpuPolicyMap;
        java.util.Map<Integer, Long> threadCpuMap;
        java.util.Map<Integer, java.util.Map<Long, Long>> map;
        Long key;
        java.util.Map<Integer, java.util.Map<Long, Long>> devCpuFreqMap;
        int[] iArr;
        EnsureLoad.LIZ.getClass();
        if (!EnsureLoad.LIZIZ) {
            return;
        }
        if (!this.LIZ && ((iArr = this.LIZLLL) == null || iArr.length == 0)) {
            return;
        }
        C35941E8r c35941E8r = this.LJFF;
        c35941E8r.LIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        c35941E8r.LIZIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        c35941E8r.LIZJ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        c35941E8r.LIZLLL = 0L;
        java.util.Map<Integer, java.util.Map<Long, Long>> map2 = c35941E8r.LJ;
        if (map2 != null) {
            map2.clear();
        }
        c35941E8r.LJFF = 0L;
        c35941E8r.LJI = 0L;
        java.util.Map<Integer, Long> map3 = c35941E8r.LJII;
        if (map3 != null) {
            map3.clear();
        }
        java.util.Map<Integer, java.util.Map<Integer, Long>> map4 = c35941E8r.LJIIIIZZ;
        if (map4 != null) {
            map4.clear();
        }
        boolean z = this.LIZ;
        int[] iArr2 = this.LIZLLL;
        boolean z2 = this.LIZIZ;
        long currentTimeMillis = System.currentTimeMillis();
        OtisCPUTime dumpOtisCpuTime = CpuNative.dumpOtisCpuTime(z, z, iArr2, z2, z2);
        dumpOtisCpuTime.setRefreshTime(currentTimeMillis);
        OtisCPUTime otisCPUTime = this.LJ;
        if (otisCPUTime != null) {
            this.LJFF.LJI = System.currentTimeMillis() - otisCPUTime.getRefreshTime();
            long procCpu = dumpOtisCpuTime.getProcCpu() - otisCPUTime.getProcCpu();
            if (procCpu > 0) {
                C35941E8r c35941E8r2 = this.LJFF;
                c35941E8r2.LJFF = procCpu;
                c35941E8r2.LIZIZ = procCpu / c35941E8r2.LJI;
                long devCpu = dumpOtisCpuTime.getDevCpu() - otisCPUTime.getDevCpu();
                if (devCpu > 0) {
                    C35941E8r c35941E8r3 = this.LJFF;
                    c35941E8r3.LIZLLL = devCpu;
                    c35941E8r3.LIZ = c35941E8r3.LJFF / devCpu;
                }
            }
            java.util.Map<Integer, java.util.Map<Long, Long>> devCpuFreqMap2 = dumpOtisCpuTime.getDevCpuFreqMap();
            if (devCpuFreqMap2 != null && (devCpuFreqMap = otisCPUTime.getDevCpuFreqMap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Integer, java.util.Map<Long, Long>> entry : devCpuFreqMap2.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    java.util.Map<Long, Long> value = entry.getValue();
                    java.util.Map<Long, Long> map5 = devCpuFreqMap.get(Integer.valueOf(intValue));
                    if (map5 != null) {
                        Integer valueOf = Integer.valueOf(intValue);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry<Long, Long> entry2 : value.entrySet()) {
                            long longValue = entry2.getKey().longValue();
                            long longValue2 = entry2.getValue().longValue();
                            Long l = map5.get(Long.valueOf(longValue));
                            if (l != null) {
                                linkedHashMap2.put(Long.valueOf(longValue), Long.valueOf(longValue2 - l.longValue()));
                            }
                        }
                        linkedHashMap.put(valueOf, linkedHashMap2);
                    }
                }
                this.LJFF.LJ = linkedHashMap;
            }
            if (this.LIZJ && (map = this.LJFF.LJ) != null) {
                if (LJI == null) {
                    synchronized (new TBT() { // from class: X.E8s
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return obj.getClass();
                        }
                    }) {
                        if (LJI == null) {
                            LJI = new LinkedHashMap();
                            java.util.Map<Integer, Integer> LIZ = CpuNative.LIZ.LIZ();
                            if (LIZ != null) {
                                for (Map.Entry<Integer, Integer> entry3 : LIZ.entrySet()) {
                                    int intValue2 = entry3.getKey().intValue();
                                    int intValue3 = entry3.getValue().intValue();
                                    java.util.Map<Long, Long> map6 = map.get(Integer.valueOf(intValue2));
                                    if (map6 != null) {
                                        Iterator<Map.Entry<Long, Long>> it = map6.entrySet().iterator();
                                        Map.Entry<Long, Long> entry4 = null;
                                        if (it.hasNext()) {
                                            entry4 = it.next();
                                            if (it.hasNext()) {
                                                long longValue3 = entry4.getKey().longValue();
                                                do {
                                                    Map.Entry<Long, Long> next = it.next();
                                                    long longValue4 = next.getKey().longValue();
                                                    if (longValue3 < longValue4) {
                                                        entry4 = next;
                                                        longValue3 = longValue4;
                                                    }
                                                } while (it.hasNext());
                                            }
                                        }
                                        Map.Entry<Long, Long> entry5 = entry4;
                                        if (entry5 != null && (key = entry5.getKey()) != null) {
                                            Integer valueOf2 = Integer.valueOf(intValue2);
                                            java.util.Map<Integer, Long> map7 = LJI;
                                            o.LJI(map7);
                                            map7.put(valueOf2, Long.valueOf(intValue3 * key.longValue()));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                for (Map.Entry<Integer, java.util.Map<Long, Long>> entry6 : map.entrySet()) {
                    int intValue4 = entry6.getKey().intValue();
                    java.util.Map<Long, Long> value2 = entry6.getValue();
                    java.util.Map<Integer, Long> map8 = LJI;
                    o.LJI(map8);
                    Long l2 = (Long) ((LinkedHashMap) map8).get(Integer.valueOf(intValue4));
                    if (l2 != null) {
                        long longValue5 = l2.longValue();
                        long j = 0;
                        for (Map.Entry<Long, Long> entry7 : value2.entrySet()) {
                            j += entry7.getValue().longValue() * entry7.getKey().longValue();
                        }
                        double d2 = j / (longValue5 * this.LJFF.LJI);
                        if (d2 > 1.0d) {
                            d2 = 1.0d;
                        }
                        d += d2;
                    }
                }
                C35941E8r c35941E8r4 = this.LJFF;
                c35941E8r4.LIZJ = c35941E8r4.LIZ * (d / map.size());
            }
            java.util.Map<Integer, Long> threadCpuMap2 = dumpOtisCpuTime.getThreadCpuMap();
            if (threadCpuMap2 != null && (threadCpuMap = otisCPUTime.getThreadCpuMap()) != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry<Integer, Long> entry8 : threadCpuMap2.entrySet()) {
                    int intValue5 = entry8.getKey().intValue();
                    long longValue6 = entry8.getValue().longValue();
                    Long l3 = threadCpuMap.get(Integer.valueOf(intValue5));
                    if (l3 != null) {
                        linkedHashMap3.put(Integer.valueOf(intValue5), Long.valueOf(longValue6 - l3.longValue()));
                    }
                }
                this.LJFF.LJII = linkedHashMap3;
            }
            java.util.Map<Integer, java.util.Map<Integer, Long>> threadCpuPolicyMap2 = dumpOtisCpuTime.getThreadCpuPolicyMap();
            if (threadCpuPolicyMap2 != null && (threadCpuPolicyMap = otisCPUTime.getThreadCpuPolicyMap()) != null) {
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry<Integer, java.util.Map<Integer, Long>> entry9 : threadCpuPolicyMap2.entrySet()) {
                    int intValue6 = entry9.getKey().intValue();
                    java.util.Map<Integer, Long> value3 = entry9.getValue();
                    java.util.Map<Integer, Long> map9 = threadCpuPolicyMap.get(Integer.valueOf(intValue6));
                    if (map9 != null) {
                        Integer valueOf3 = Integer.valueOf(intValue6);
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        for (Map.Entry<Integer, Long> entry10 : value3.entrySet()) {
                            int intValue7 = entry10.getKey().intValue();
                            long longValue7 = entry10.getValue().longValue();
                            Long l4 = map9.get(Integer.valueOf(intValue7));
                            if (l4 != null) {
                                linkedHashMap5.put(Integer.valueOf(intValue7), Long.valueOf(longValue7 - l4.longValue()));
                            }
                        }
                        linkedHashMap4.put(valueOf3, linkedHashMap5);
                    }
                }
                this.LJFF.LJIIIIZZ = linkedHashMap4;
            }
        }
        this.LJ = dumpOtisCpuTime;
    }

    public C35940E8q(boolean z, int[] iArr, int i) {
        z = (i & 1) != 0 ? true : z;
        iArr = (i & 8) != 0 ? null : iArr;
        this.LIZ = z;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = iArr;
        this.LJFF = new C35941E8r(null);
    }
}
