package X;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.FEl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38639FEl {
    public static InterfaceC36611EYl LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;
    public static final ReadWriteLock LIZLLL = new ReentrantReadWriteLock();
    public static C38490F8s LJ = null;
    public static InterfaceC35921E7x LJFF;

    public static InterfaceC36611EYl LIZ() {
        InterfaceC36611EYl interfaceC36611EYl;
        synchronized (C38639FEl.class) {
            interfaceC36611EYl = LIZ;
        }
        return interfaceC36611EYl;
    }

    public static boolean LIZIZ() {
        String th;
        boolean z;
        try {
            C16880lQ.LLJJJIL("scc_adblock");
            th = "";
            z = true;
        } catch (Throwable th2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Load adblock library fail: ");
            LIZ2.append(th2);
            X1D.LIZIZ(LIZ2);
            th = th2.toString();
            z = false;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("adblock_mount_message", th);
        LIZJ("ttwebview_scc", Collections.unmodifiableMap(concurrentHashMap));
        return z;
    }

    public static void LIZLLL(InterfaceC36611EYl interfaceC36611EYl) {
        synchronized (C38639FEl.class) {
            LIZ = interfaceC36611EYl;
        }
    }

    public static void LIZJ(String str, java.util.Map<String, Object> map) {
        synchronized (C38639FEl.class) {
            InterfaceC35921E7x interfaceC35921E7x = LJFF;
            if (interfaceC35921E7x == null) {
                return;
            }
            interfaceC35921E7x.LIZ(str, map);
        }
    }
}
