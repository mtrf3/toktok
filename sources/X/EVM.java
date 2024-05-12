package X;

import android.os.Process;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class EVM {
    public static volatile int LIZ = -1;
    public static boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static final java.util.Map<Integer, Integer> LIZLLL = new ConcurrentHashMap();

    public static void LIZ(int i, int i2) {
        try {
            java.util.Map<Integer, Integer> map = LIZLLL;
            int i3 = 0;
            if (((ConcurrentHashMap) map).get(Integer.valueOf(i)) == null) {
                if (i == -1) {
                    i3 = Process.getThreadPriority(0);
                } else {
                    i3 = Process.getThreadPriority(i);
                }
                ((ConcurrentHashMap) map).put(Integer.valueOf(i), Integer.valueOf(i3));
            }
            if (i3 != i2) {
                if (i != -1) {
                    Process.setThreadPriority(i, i2);
                } else {
                    Process.setThreadPriority(i2);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
