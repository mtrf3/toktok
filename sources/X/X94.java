package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X94 {
    public static final ConcurrentHashMap<String, OSZ<C0R2, Object>> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str, String taskFlag) {
        o.LJIIJ(taskFlag, "taskFlag");
        ConcurrentHashMap<String, OSZ<C0R2, Object>> concurrentHashMap = LIZ;
        OSZ<C0R2, Object> osz = concurrentHashMap.get(str);
        if (osz != null) {
            synchronized (osz.getSecond()) {
                try {
                    osz.getSecond().notifyAll();
                    int LIZ2 = osz.getFirst().LIZ();
                    if (osz.getFirst().LIZIZ() == 0) {
                        C12310e3 c12310e3 = C12310e3.LIZIZ;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("[End][");
                        LIZ3.append(taskFlag);
                        LIZ3.append("][");
                        LIZ3.append(str);
                        LIZ3.append("][Clear]");
                        String LIZIZ = X1D.LIZIZ(LIZ3);
                        c12310e3.getClass();
                        C12310e3.LIZ("LLL", LIZIZ);
                        concurrentHashMap.remove(str);
                    } else {
                        C12310e3 c12310e32 = C12310e3.LIZIZ;
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("[End][");
                        LIZ4.append(taskFlag);
                        LIZ4.append("][");
                        LIZ4.append(str);
                        LIZ4.append("][");
                        LIZ4.append(LIZ2);
                        LIZ4.append(']');
                        String LIZIZ2 = X1D.LIZIZ(LIZ4);
                        c12310e32.getClass();
                        C12310e3.LIZIZ("LLL", LIZIZ2, null);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    public static void LIZIZ(String str, String taskFlag) {
        o.LJIIJ(taskFlag, "taskFlag");
        synchronized (X94.class) {
            ConcurrentHashMap<String, OSZ<C0R2, Object>> concurrentHashMap = LIZ;
            if (concurrentHashMap.get(str) == null) {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[Start][");
                LIZ2.append(taskFlag);
                LIZ2.append("][");
                LIZ2.append(str);
                LIZ2.append("][Empty]");
                String LIZIZ = X1D.LIZIZ(LIZ2);
                c12310e3.getClass();
                C12310e3.LIZ("LLL", LIZIZ);
                concurrentHashMap.put(str, new OSZ<>(new C0R2(1), new Object()));
                return;
            }
            C12310e3 c12310e32 = C12310e3.LIZIZ;
            String LIZIZ2 = UPJ.LIZIZ("[Start][", taskFlag, "][", str, "][Wait]");
            c12310e32.getClass();
            C12310e3.LIZLLL("LLL", LIZIZ2);
            OSZ<C0R2, Object> osz = concurrentHashMap.get(str);
            if (osz != null && osz.getSecond() != null) {
                synchronized (osz.getSecond()) {
                    try {
                        osz.getFirst().LIZJ();
                        osz.getSecond().wait();
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
    }
}
