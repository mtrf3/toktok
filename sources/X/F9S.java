package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Debug;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import java.io.File;
import java.lang.Thread;

/* loaded from: classes7.dex */
public final class F9S implements Thread.UncaughtExceptionHandler {
    public static Thread.UncaughtExceptionHandler LIZIZ;
    public final Context LIZ;

    public F9S(Context context) {
        this.LIZ = context;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Long l;
        boolean z;
        SharedPreferences LIZIZ2;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        SharedPreferences LIZIZ3;
        Context context = this.LIZ;
        if (context != null && (LIZIZ3 = F9J.LIZIZ(context, 0, "LeakDetectorSp")) != null) {
            l = Long.valueOf(LIZIZ3.getLong("ld_oom_dump_time", -1L));
        } else {
            l = null;
        }
        if (System.currentTimeMillis() - l.longValue() < 3600000) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dump:");
        LIZ.append(!z);
        X1D.LIZIZ(LIZ);
        if ((th instanceof OutOfMemoryError) && !z) {
            try {
                File LIZ2 = F95.LIZ(this.LIZ, MemoryConfig.getMemoryConfig().oversea);
                if (LIZ2 != null) {
                    Debug.dumpHprofData(LIZ2.getAbsolutePath());
                    FPY.LIZ(LIZ2.getParentFile(), thread.getStackTrace());
                    Context context2 = this.LIZ;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (context2 != null && (LIZIZ2 = F9J.LIZIZ(context2, 0, "LeakDetectorSp")) != null && (edit = LIZIZ2.edit()) != null && (putLong = edit.putLong("ld_oom_dump_time", currentTimeMillis)) != null) {
                        putLong.commit();
                    }
                    F9T.LIZIZ(this.LIZ, LIZ2.getAbsolutePath());
                }
            } catch (Throwable unused) {
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = LIZIZ;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
