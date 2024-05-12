package X;

import android.os.Process;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EVn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36535EVn {
    public static final java.util.Map<Integer, Integer> LIZ = new ConcurrentHashMap();

    public static void LIZ() {
        try {
            java.util.Map<Integer, Integer> map = LIZ;
            if (((ConcurrentHashMap) map).get(-1) == null) {
                return;
            }
            Object obj = ((ConcurrentHashMap) map).get(-1);
            o.LJI(obj);
            Process.setThreadPriority(0, ((Number) obj).intValue());
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
