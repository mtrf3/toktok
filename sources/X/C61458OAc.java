package X;

import Y.ARunnableS46S0100000_10;
import android.os.Process;
import android.util.Pair;
import com.bytedance.geckox.utils.FileLock;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.OAc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61458OAc {
    public static final java.util.Map<String, Pair<FileLock, AtomicLong>> LIZ = new HashMap();

    public static boolean LIZ(String str) {
        java.util.Map<String, Pair<FileLock, AtomicLong>> map = LIZ;
        synchronized (map) {
            FileLock LJ = FileLock.LJ(str);
            if (LJ == null) {
                return false;
            }
            Pair pair = (Pair) ((HashMap) map).get(str);
            if (pair != null && ((AtomicLong) pair.second).get() != 0) {
                LJ.LJI();
                FileLock.LIZJ(Process.myPid(), str);
                return false;
            }
            File parentFile = new File(str).getParentFile();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(parentFile.getAbsolutePath());
            LIZ2.append("--pending-delete");
            File file = new File(X1D.LIZIZ(LIZ2));
            boolean renameTo = parentFile.renameTo(file);
            LJ.LJI();
            LJ.LIZLLL();
            if (renameTo) {
                OAY.LIZ().execute(new ARunnableS46S0100000_10(file, 157));
            }
            return renameTo;
        }
    }

    public static void LIZIZ(String str) {
        java.util.Map<String, Pair<FileLock, AtomicLong>> map = LIZ;
        synchronized (map) {
            Pair pair = (Pair) ((HashMap) map).get(str);
            if (pair == null) {
                pair = new Pair(FileLock.LIZJ(Process.myPid(), str), new AtomicLong(0L));
                ((HashMap) map).put(str, pair);
            }
            ((AtomicLong) pair.second).incrementAndGet();
        }
    }

    public static void LIZJ(String str) {
        java.util.Map<String, Pair<FileLock, AtomicLong>> map = LIZ;
        synchronized (map) {
            Pair pair = (Pair) ((HashMap) map).get(str);
            if (pair != null) {
                long decrementAndGet = ((AtomicLong) pair.second).decrementAndGet();
                if (decrementAndGet >= 0) {
                    if (decrementAndGet == 0) {
                        ((FileLock) pair.first).LJI();
                        ((HashMap) map).remove(str);
                    }
                } else {
                    throw new RuntimeException("using.lock count illegal");
                }
            } else {
                throw new RuntimeException("using.lock illegal state");
            }
        }
    }
}
