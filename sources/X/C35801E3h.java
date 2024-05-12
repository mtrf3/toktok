package X;

import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS9S0002000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.E3h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35801E3h {
    public static final java.util.Map<String, C35808E3o> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, Thread> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<String, Integer> LIZJ = new LinkedHashMap();
    public static final ArrayList<String> LIZLLL = C47261Igj.LJII("ChromiumNet", "NetNormal", "EventUpload");
    public static final java.util.Map<String, Thread> LJ = new LinkedHashMap();
    public static final java.util.Map<String, Thread> LJFF = new LinkedHashMap();
    public static boolean LJI;

    static {
        C221108m2.LIZIZ(C37153Ei5.LJLIL);
    }

    public static void LIZJ() {
        if (LJI) {
            return;
        }
        ThreadGroup threadGroup = C16880lQ.LLLLIIIILLL().getThreadGroup();
        ThreadGroup threadGroup2 = threadGroup;
        while (threadGroup != null) {
            threadGroup2 = threadGroup;
            threadGroup = threadGroup.getParent();
        }
        if (threadGroup2 != null) {
            int activeCount = threadGroup2.activeCount() * 2;
            Thread[] threadArr = new Thread[activeCount];
            threadGroup2.enumerate(threadArr);
            for (int i = 0; i < activeCount; i++) {
                Thread thread = threadArr[i];
                if (thread != null) {
                    java.util.Map<String, Thread> map = LIZIZ;
                    String name = thread.getName();
                    o.LJIIIIZZ(name, "thread.name");
                    map.put(name, thread);
                    Iterator<String> it = LIZLLL.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        String name2 = thread.getName();
                        o.LJIIIIZZ(name2, "thread.name");
                        if (ujb.o.LJJJLIIL(name2, next, false)) {
                            java.util.Map<String, Thread> map2 = LJ;
                            String name3 = thread.getName();
                            o.LJIIIIZZ(name3, "thread.name");
                            map2.put(name3, thread);
                            java.util.Map<String, Integer> map3 = LIZJ;
                            String name4 = thread.getName();
                            o.LJIIIIZZ(name4, "thread.name");
                            map3.put(name4, Integer.valueOf(thread.getPriority()));
                        }
                    }
                }
            }
        }
        LJI = true;
    }

    public static void LIZLLL() {
        for (Map.Entry entry : ((LinkedHashMap) LJ).entrySet()) {
            Integer num = (Integer) ((LinkedHashMap) LIZJ).get(entry.getKey());
            if (num != null) {
                ((Thread) entry.getValue()).setPriority(num.intValue());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if ((X.C33780DNo.LIZ() & 2) != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        LIZIZ(r3, r2, 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if ((X.C33780DNo.LIZ() & 4) != 4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        LIZIZ(r3, r2, 15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if ((X.C33780DNo.LIZ() & 1) != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        LIZIZ(r3, r2, 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if ((X.C33780DNo.LIZ() & 8) == 8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        LIZIZ(r3, r2, 20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF() {
        /*
            boolean r0 = X.DSR.LIZ()
            if (r0 == 0) goto L75
            int r3 = android.os.Process.myTid()
            int r2 = android.os.Process.getThreadPriority(r3)
            com.ss.android.ugc.aweme.strategy.api.IStrategyApi r0 = X.C2NW.LIZ()
            boolean r0 = r0.isNewUser()
            r4 = 1
            if (r0 == 0) goto L2c
        L1a:
            com.ss.android.ugc.aweme.strategy.api.IStrategyApi r1 = X.C2NW.LIZ()
            X.DS5 r0 = X.DS5.LJLIL
            boolean r0 = r1.LJIILLIIL(r0)
        L24:
            if (r0 == 0) goto L4a
        L26:
            r0 = 20
            LIZIZ(r3, r2, r0)
        L2b:
            return
        L2c:
            com.ss.android.ugc.aweme.strategy.api.IStrategyApi r0 = X.C2NW.LIZ()
            boolean r0 = r0.LJJIJLIJ()
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.strategy.api.IStrategyApi r0 = X.C2NW.LIZ()
            boolean r0 = r0.LJIIJJI()
            goto L24
        L3f:
            int r0 = X.C33780DNo.LIZ()
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L4a
            goto L26
        L4a:
            int r0 = X.C33780DNo.LIZ()
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L59
            r0 = 10
            LIZIZ(r3, r2, r0)
            goto L2b
        L59:
            int r0 = X.C33780DNo.LIZ()
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L68
            r0 = 15
            LIZIZ(r3, r2, r0)
            goto L2b
        L68:
            int r0 = X.C33780DNo.LIZ()
            r0 = r0 & 1
            if (r0 != r4) goto L2b
            r0 = 5
            LIZIZ(r3, r2, r0)
            goto L2b
        L75:
            java.lang.Thread r1 = X.C16880lQ.LLLLIIIILLL()
            r0 = 7
            r1.setPriority(r0)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35801E3h.LJFF():void");
    }

    public static void LJI() {
        if (DSR.LIZ()) {
            JatoXL.resetPriority(Process.myTid());
        } else {
            C16880lQ.LLLLIIIILLL().setPriority(5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(String str) {
        Object obj = ((LinkedHashMap) LIZIZ).get(str);
        if (obj != null) {
            LJFF.put(str, obj);
        }
    }

    public static void LJII(String str) {
        Thread thread = (Thread) ((LinkedHashMap) LIZIZ).get(str);
        if (thread != null) {
            thread.setPriority(7);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setThreadPriorityHighByName ");
            LIZ2.append(str);
            LIZ2.append(' ');
            X1D.LIZIZ(LIZ2);
        }
    }

    public static void LJIIIIZZ(Thread thread) {
        o.LJIIIZ(thread, "thread");
        thread.setPriority(1);
    }

    public static void LJIIIZ(String str) {
        Thread thread = (Thread) ((LinkedHashMap) LIZIZ).get(str);
        if (thread != null) {
            LJIIIIZZ(thread);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setThreadPriorityMinByName ");
            LIZ2.append(str);
            LIZ2.append(' ');
            X1D.LIZIZ(LIZ2);
        }
    }

    public static void LJIIJ(Thread thread) {
        o.LJIIIZ(thread, "thread");
        thread.setPriority(5);
    }

    public static void LJIIJJI(String str) {
        Thread thread = (Thread) ((LinkedHashMap) LIZIZ).get(str);
        if (thread != null) {
            LJIIJ(thread);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setThreadPriorityNormalByName ");
            LIZ2.append(str);
            LIZ2.append(' ');
            X1D.LIZIZ(LIZ2);
        }
    }

    public static void LJIIL(int i) {
        if (DSR.LJFF()) {
            JatoXL.resetRenderThread();
        } else {
            Thread thread = (Thread) ((LinkedHashMap) LJFF).get("RenderThread");
            if (thread != null) {
                thread.setPriority(7);
            }
        }
        if (DSR.LJ()) {
            JatoXL.resetPriority(i);
        } else {
            Thread thread2 = (Thread) ((LinkedHashMap) LJFF).get("main");
            if (thread2 != null) {
                LJIIJ(thread2);
            }
        }
        if (!DSR.LIZIZ()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LJFF;
            Thread thread3 = (Thread) linkedHashMap.get("play_thread_0");
            if (thread3 != null) {
                LJIIJ(thread3);
            }
            Thread thread4 = (Thread) linkedHashMap.get("play_thread_1");
            if (thread4 != null) {
                LJIIJ(thread4);
            }
            Thread thread5 = (Thread) linkedHashMap.get("explay_thread_1");
            if (thread5 != null) {
                LJIIJ(thread5);
            }
        }
    }

    public static void LJIILIIL(int i) {
        Iterator it = ((LinkedHashMap) LJ).entrySet().iterator();
        while (it.hasNext()) {
            ((Thread) ((Map.Entry) it.next()).getValue()).setPriority(i);
        }
    }

    public static void LIZ(int i, int i2) {
        C2NW.LIZ().LJIIIZ("JavaThreadPriorityHelp", new AqS9S0002000_6(i, i2, 3));
    }

    public static void LIZIZ(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 <= -20) {
            EVM.LIZ(i, -20);
        } else if (i4 >= 19) {
            EVM.LIZ(i, 19);
        } else {
            EVM.LIZ(i, i4);
        }
    }
}
