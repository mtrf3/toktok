package com.bytedance.otis.resource.cpu;

import X.U26;
import X.X1D;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class OtisCPUTime {
    public long devCpu;
    public Map<Integer, Map<Long, Long>> devCpuFreqMap;
    public long procCpu;
    public long refreshTime;
    public Map<Integer, Long> threadCpuMap;
    public Map<Integer, Map<Integer, Long>> threadCpuPolicyMap;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OtisCPUTime() {
        /*
            r12 = this;
            r1 = 0
            r5 = 0
            r10 = 63
            r0 = r12
            r3 = r1
            r6 = r1
            r8 = r5
            r9 = r5
            r11 = r5
            r0.<init>(r1, r3, r5, r6, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.otis.resource.cpu.OtisCPUTime.<init>():void");
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(refreshTime:");
        LIZ.append(this.refreshTime);
        LIZ.append(", devCpu:");
        LIZ.append(this.devCpu);
        LIZ.append(", procCpu:");
        LIZ.append(this.procCpu);
        LIZ.append(", devCpuPolicy:");
        Object obj = this.devCpuFreqMap;
        Object obj2 = "null";
        if (obj == null) {
            obj = "null";
        }
        LIZ.append(obj);
        LIZ.append(" threadCpuMap:");
        Object obj3 = this.threadCpuMap;
        if (obj3 == null) {
            obj3 = "null";
        }
        LIZ.append(obj3);
        LIZ.append(" threadCpuPolicyMap:");
        Object obj4 = this.threadCpuPolicyMap;
        if (obj4 != null) {
            obj2 = obj4;
        }
        return U26.LIZJ(LIZ, obj2, ')', LIZ);
    }

    public final long getDevCpu() {
        return this.devCpu;
    }

    public final Map<Integer, Map<Long, Long>> getDevCpuFreqMap() {
        return this.devCpuFreqMap;
    }

    public final long getProcCpu() {
        return this.procCpu;
    }

    public final long getRefreshTime() {
        return this.refreshTime;
    }

    public final Map<Integer, Long> getThreadCpuMap() {
        return this.threadCpuMap;
    }

    public final Map<Integer, Map<Integer, Long>> getThreadCpuPolicyMap() {
        return this.threadCpuPolicyMap;
    }

    public final void setDevCpu(long j) {
        this.devCpu = j;
    }

    public final void setDevCpuFreqMap(Map<Integer, Map<Long, Long>> map) {
        this.devCpuFreqMap = map;
    }

    public final void setProcCpu(long j) {
        this.procCpu = j;
    }

    public final void setRefreshTime(long j) {
        this.refreshTime = j;
    }

    public final void setThreadCpuMap(Map<Integer, Long> map) {
        this.threadCpuMap = map;
    }

    public final void setThreadCpuPolicyMap(Map<Integer, Map<Integer, Long>> map) {
        this.threadCpuPolicyMap = map;
    }

    public final void putThreadCpu(int i, long j) {
        if (this.threadCpuMap == null) {
            this.threadCpuMap = new LinkedHashMap();
        }
        Map<Integer, Long> map = this.threadCpuMap;
        if (map != null) {
            map.put(Integer.valueOf(i), Long.valueOf(j));
        }
    }

    public final void putDeviceCpuFreq(int i, long j, long j2) {
        if (this.devCpuFreqMap == null) {
            this.devCpuFreqMap = new LinkedHashMap();
        }
        Map<Integer, Map<Long, Long>> map = this.devCpuFreqMap;
        if (map != null) {
            Integer valueOf = Integer.valueOf(i);
            Map<Long, Long> map2 = map.get(valueOf);
            if (map2 == null) {
                map2 = new LinkedHashMap<>();
                map.put(valueOf, map2);
            }
            map2.put(Long.valueOf(j), Long.valueOf(j2));
        }
        this.devCpu += j2;
    }

    public final void putThreadCpuPolicy(int i, int i2, long j) {
        if (this.threadCpuPolicyMap == null) {
            this.threadCpuPolicyMap = new LinkedHashMap();
        }
        Map<Integer, Map<Integer, Long>> map = this.threadCpuPolicyMap;
        if (map != null) {
            Integer valueOf = Integer.valueOf(i);
            Map<Integer, Long> map2 = map.get(valueOf);
            if (map2 == null) {
                map2 = new LinkedHashMap<>();
                map.put(valueOf, map2);
            }
            map2.put(Integer.valueOf(i2), Long.valueOf(j));
        }
        if (this.threadCpuMap == null) {
            this.threadCpuMap = new LinkedHashMap();
        }
        Map<Integer, Long> map3 = this.threadCpuMap;
        if (map3 != null) {
            Integer valueOf2 = Integer.valueOf(i);
            Long l = map3.get(valueOf2);
            if (l == null) {
                l = 0L;
                map3.put(valueOf2, l);
            }
            map3.put(Integer.valueOf(i), Long.valueOf(l.longValue() + j));
        }
    }

    public OtisCPUTime(long j, long j2, Map<Integer, Map<Long, Long>> map, long j3, Map<Integer, Long> map2, Map<Integer, Map<Integer, Long>> map3) {
        this.refreshTime = j;
        this.devCpu = j2;
        this.devCpuFreqMap = map;
        this.procCpu = j3;
        this.threadCpuMap = map2;
        this.threadCpuPolicyMap = map3;
    }

    public /* synthetic */ OtisCPUTime(long j, long j2, Map map, long j3, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? null : map, (i & 8) == 0 ? j3 : 0L, (i & 16) != 0 ? null : map2, (i & 32) == 0 ? map3 : null);
    }
}
