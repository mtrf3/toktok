package com.bytedance.monitor.collector;

import X.C09970aH;
import X.C16880lQ;
import X.C64125PEr;
import X.F9U;
import X.P8P;
import X.P8Q;
import X.PEQ;
import X.PFF;
import X.PFI;
import X.PFM;
import X.PFN;
import X.PGQ;
import Y.ARunnableS16S1000000_11;
import Y.ARunnableS18S0000000_11;
import Y.ARunnableS47S0100000_11;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LockMonitorManager {
    public static volatile String lastJavaStack;
    public static volatile boolean openFetchStack;
    public static int position;
    public static PFF[] lockInfoQueue = new PFF[100];
    public static final BlockingQueue<String> sStackBlockingQueue = new LinkedBlockingQueue();
    public static final List<PFM> sOnLockListenerList = new CopyOnWriteArrayList();
    public static ExecutorService sLockHandler = C16880lQ.LLLLZLLLI(new P8Q());
    public static ExecutorService sStackFetcher = C16880lQ.LLLLZLLLI(new P8P());
    public static boolean isLockMonitoring = false;

    public static List<PFF> dumpLockInfo() {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 100; i++) {
            int i2 = (((position + 100) - i) - 1) % 100;
            PFF[] pffArr = lockInfoQueue;
            PFF pff = pffArr[i2];
            pffArr[i2] = null;
            if (pff != null) {
                linkedList.add(pff);
            }
        }
        return linkedList;
    }

    public static void nativeGetJavaStack() {
        if (openFetchStack) {
            sStackFetcher.execute(new ARunnableS18S0000000_11(10));
        }
    }

    public static void startLockDetect() {
        startLockDetect(30L);
    }

    public static void dumpLockInfo(PFN pfn) {
        F9U.LIZ.LIZJ(new ARunnableS47S0100000_11(pfn, 26));
    }

    public static void endLockDetect(JSONObject jSONObject) {
        endLockDetect(jSONObject, true);
    }

    public static void enqueue(PFF pff) {
        if (pff == null) {
            return;
        }
        PFF[] pffArr = lockInfoQueue;
        int i = position;
        pffArr[i] = pff;
        position = (i + 1) % 100;
    }

    public static void nativePut(String str) {
        sLockHandler.execute(new ARunnableS16S1000000_11(str, 3));
    }

    public static void registerOnLockListener(PFM pfm) {
        if (pfm != null) {
            List<PFM> list = sOnLockListenerList;
            if (list.contains(pfm)) {
                return;
            }
            list.add(pfm);
        }
    }

    public static void reportLockInfo(JSONObject jSONObject) {
        dumpLockInfo(new PFI(jSONObject));
    }

    public static void setOpenFetchStack(boolean z) {
        openFetchStack = z;
        if (!z) {
            lastJavaStack = null;
        }
    }

    public static void startLockDetect(long j) {
        if (isLockMonitoring) {
            return;
        }
        isLockMonitoring = true;
        if (C09970aH.LJIIIZ()) {
            C64125PEr LIZLLL = C64125PEr.LIZLLL();
            if (LIZLLL.LIZIZ) {
                long j2 = LIZLLL.LJIIIZ.LJFF;
                if (LIZLLL.LIZIZ) {
                    if (LIZLLL.LJII == null) {
                        LIZLLL.LJII = new PEQ(LIZLLL.LJIIIZ.LJI);
                    }
                    PEQ peq = LIZLLL.LJII;
                    peq.getClass();
                    try {
                        if (C64125PEr.LJIIJJI) {
                            MonitorJni.doEnableAtrace(peq.LIZJ, j2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            C64125PEr LIZLLL2 = C64125PEr.LIZLLL();
            if (LIZLLL2.LIZIZ) {
                if (LIZLLL2.LJII == null) {
                    PEQ peq2 = new PEQ(LIZLLL2.LJIIIZ.LJI);
                    LIZLLL2.LJII = peq2;
                    long j3 = LIZLLL2.LJIIIZ.LJFF;
                    try {
                        if (C64125PEr.LJIIJJI) {
                            MonitorJni.doEnableAtrace(peq2.LIZJ, j3);
                        }
                    } catch (Throwable unused2) {
                    }
                }
                LIZLLL2.LJII.getClass();
                try {
                    if (C64125PEr.LJIIJJI) {
                        MonitorJni.doEnableLock();
                    }
                } catch (Throwable unused3) {
                }
            }
            C64125PEr LIZLLL3 = C64125PEr.LIZLLL();
            synchronized (LIZLLL3) {
                if (!LIZLLL3.LJ) {
                    LIZLLL3.LJ = true;
                    setOpenFetchStack(true);
                    if (C64125PEr.LJIIJJI) {
                        try {
                            MonitorJni.doOpenLockStackTrace(j);
                        } catch (Throwable unused4) {
                        }
                    }
                }
            }
        }
    }

    public static void unRegisterOnLockListener(PFM pfm) {
        sOnLockListenerList.remove(pfm);
    }

    public static String dumpLockInfo(long j, long j2) {
        PFF[] pffArr = new PFF[100];
        int i = 0;
        System.arraycopy(lockInfoQueue, 0, pffArr, 0, 100);
        ArrayList arrayList = new ArrayList();
        do {
            int i2 = position;
            if (i2 < 0) {
                break;
            }
            PFF pff = pffArr[((i2 + i) + 1) % 100];
            if (pff != null) {
                long j3 = pff.LIZ;
                if (j3 < j2 || j3 + pff.LIZIZ > j) {
                    arrayList.add(pff);
                }
                if (pff.LIZ + pff.LIZIZ < j) {
                    break;
                }
            }
            i++;
        } while (i < 100);
        return arrayList.toString();
    }

    public static void endLockDetect(JSONObject jSONObject, boolean z) {
        if (!isLockMonitoring) {
            return;
        }
        try {
            jSONObject.put("is_lock", true);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        isLockMonitoring = false;
        if (C09970aH.LJIIIZ()) {
            if (z) {
                reportLockInfo(jSONObject);
            }
            C64125PEr LIZLLL = C64125PEr.LIZLLL();
            synchronized (LIZLLL) {
                if (LIZLLL.LJ) {
                    LIZLLL.LJ = false;
                    setOpenFetchStack(false);
                    if (C64125PEr.LJIIJJI) {
                        try {
                            MonitorJni.doCloseLockStackTrace();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            C64125PEr LIZLLL2 = C64125PEr.LIZLLL();
            if (!LIZLLL2.LIZIZ || LIZLLL2.LJII == null) {
                return;
            }
            try {
                if (!C64125PEr.LJIIJJI) {
                    return;
                }
                MonitorJni.doDisableAtrace();
            } catch (Throwable unused2) {
            }
        }
    }

    public static JSONObject packJsonData(PFF pff, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("timestamp", pff.LIZ);
            jSONObject2.put("crash_time", pff.LIZ);
            jSONObject2.put("is_main_process", C09970aH.LJIIIIZZ());
            jSONObject2.put("process_name", C09970aH.LIZIZ());
            jSONObject2.put("block_duration", pff.LIZIZ);
            jSONObject2.put("raw_dump_info", pff.LIZJ);
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(pff.LJFF)) {
                sb.append(pff.LJFF.replace("\t", ""));
                sb.append("\n");
            }
            sb.append("-OwnerThread: ");
            sb.append(pff.LJII);
            sb.append("\n");
            sb.append("-OwnerStack: ");
            sb.append(pff.LJI);
            sb.append("\n");
            sb.append("-WaiterStack: ");
            sb.append(pff.LJ);
            sb.append("\n");
            sb.append("-RawAtrace: ");
            sb.append(pff.LIZJ);
            sb.append("\n");
            if (pff.LIZLLL != null) {
                sb.append("-Activity: ");
                sb.append(pff.LIZLLL);
                sb.append("\n");
            }
            JSONObject LIZIZ = PGQ.LIZ().LIZIZ();
            LIZIZ.put("block_stack_type", "stack");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                LIZIZ.put(next, jSONObject.get(next));
            }
            jSONObject2.put("filters", LIZIZ);
            jSONObject2.put("stack", sb.toString());
            jSONObject2.put("event_type", "lag");
            return jSONObject2;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
