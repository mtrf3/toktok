package com.bytedance.apm.trace.model.cross;

import X.PIE;
import X.PIR;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class TracingCrossManager {
    public static Map<String, PIE> sCrossTracingContext = new ConcurrentHashMap();

    public static void unRegisterCross(String str) {
        sCrossTracingContext.remove(str);
    }

    public static void registerCross(String str, PIE pie) {
        sCrossTracingContext.put(str, pie);
    }

    public static void onPassBackAsChild(String str, String str2, ArrayList<NativeSpan> arrayList) {
        PIR parseToSpan;
        PIE pie = sCrossTracingContext.get(str);
        if (pie != null) {
            sCrossTracingContext.remove(str);
            synchronized (pie) {
                if (!pie.LJII && pie.LJI) {
                    Iterator<NativeSpan> it = arrayList.iterator();
                    boolean z = true;
                    while (it.hasNext()) {
                        NativeSpan next = it.next();
                        if (next != null && (parseToSpan = next.parseToSpan(pie.LJ)) != null) {
                            if (z) {
                                parseToSpan.LJFF(str2);
                            }
                            parseToSpan.LIZ(next.getStartTime(), next.getFinishTime());
                            z = false;
                        }
                    }
                }
            }
        }
    }

    public static void onPassBackAsReference(String str, String str2, ArrayList<NativeSpan> arrayList) {
        PIR parseToSpan;
        PIE pie = sCrossTracingContext.get(str);
        if (pie != null) {
            sCrossTracingContext.remove(str);
            synchronized (pie) {
                if (!pie.LJII && pie.LJI) {
                    Iterator<NativeSpan> it = arrayList.iterator();
                    boolean z = true;
                    while (it.hasNext()) {
                        NativeSpan next = it.next();
                        if (next != null && (parseToSpan = next.parseToSpan(pie.LJ)) != null) {
                            if (z) {
                                parseToSpan.LJ(str2);
                            }
                            parseToSpan.LIZ(next.getStartTime(), next.getFinishTime());
                            z = false;
                        }
                    }
                }
            }
        }
    }
}
