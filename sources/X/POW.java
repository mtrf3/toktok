package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class POW {
    public static final AtomicLong LIZ = new AtomicLong(SystemClock.uptimeMillis());

    public static long LIZ(String str) {
        boolean z;
        File[] listFiles;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    length += LIZ(file2.getAbsolutePath());
                } catch (Throwable unused) {
                    return 0L;
                }
            }
        }
        return length;
    }

    public static POY LIZJ(POZ logSource) {
        o.LJIIIZ(logSource, "logSource");
        int i = C64368POa.LIZ[logSource.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return POY.UNKNOWN_LOG;
                    }
                    return POY.APM_EVENT_LOG;
                }
                return POY.APM_NET_API_LOG;
            }
            return POY.APP_LOG;
        }
        return POY.ORIGIN_LOG;
    }

    public static boolean LIZIZ(String str, List list) {
        if (list == null || str == null) {
            return false;
        }
        if (list.size() == 1 && o.LJ(ListProtector.get(list, 0), "*")) {
            return true;
        }
        for (Object obj : list) {
            if (ujb.o.LJJJLIIL(str, (String) obj, false)) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
