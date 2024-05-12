package X;

import android.os.Process;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.EVh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36529EVh {
    public static final java.util.Map<Integer, Integer> LIZ = new ConcurrentHashMap();

    public static void LIZ(int i) {
        try {
            java.util.Map<Integer, Integer> map = LIZ;
            if (((ConcurrentHashMap) map).get(Integer.valueOf(i)) == null) {
                return;
            }
            Process.setThreadPriority(i, ((Integer) ((ConcurrentHashMap) map).get(Integer.valueOf(i))).intValue());
        } catch (Throwable unused) {
        }
    }

    public static void LIZIZ(int i, int i2) {
        try {
            java.util.Map<Integer, Integer> map = LIZ;
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
