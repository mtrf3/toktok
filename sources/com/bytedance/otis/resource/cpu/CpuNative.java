package com.bytedance.otis.resource.cpu;

import X.C113554cx;
import X.OSZ;
import com.bytedance.otis.resource.util.EnsureLoad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class CpuNative {
    public static final CpuNative LIZ = new CpuNative();
    public static Map<Integer, Integer> LIZIZ;

    public static final native HashMap<String, String> dumpCpuPolicy();

    public static final native OtisCPUTime dumpOtisCpuTime(boolean z, boolean z2, int[] iArr, boolean z3, boolean z4);

    public static final native long getDeviceCpuTime();

    public static final native long getProcessCpuTime();

    public static final native long[] getThreadArrayCpuTime(int[] iArr);

    public static final native long getThreadCpuTime(int i);

    static {
        EnsureLoad.LIZ.init();
    }

    public final Map<Integer, Integer> LIZ() {
        Map<Integer, Integer> linkedHashMap;
        if (LIZIZ == null) {
            synchronized (this) {
                if (LIZIZ == null) {
                    HashMap<String, String> dumpCpuPolicy = dumpCpuPolicy();
                    if (dumpCpuPolicy != null) {
                        ArrayList arrayList = new ArrayList(dumpCpuPolicy.size());
                        for (Map.Entry<String, String> entry : dumpCpuPolicy.entrySet()) {
                            arrayList.add(new OSZ(Integer.valueOf(Integer.parseInt(entry.getKey())), Integer.valueOf(Integer.parseInt(entry.getValue()))));
                        }
                        linkedHashMap = C113554cx.LJJLIIIJLJLI(arrayList);
                    } else {
                        linkedHashMap = new LinkedHashMap<>();
                    }
                    LIZIZ = linkedHashMap;
                }
            }
        }
        return LIZIZ;
    }
}
