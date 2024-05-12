package X;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes15.dex */
public final class WE0 {
    public static WE0 LJII;
    public static final long LJIIIIZZ = TimeUnit.MINUTES.toMillis(2);
    public volatile StatFs LIZ;
    public volatile File LIZIZ;
    public volatile StatFs LIZJ;
    public volatile File LIZLLL;
    public long LJ;
    public final Lock LJFF = new ReentrantLock();
    public volatile boolean LJI;

    public final void LIZ() {
        if (!this.LJI || this.LIZLLL == null) {
            ((ReentrantLock) this.LJFF).lock();
            try {
                if (!this.LJI || this.LIZLLL == null) {
                    this.LIZIZ = Environment.getDataDirectory();
                    try {
                        this.LIZLLL = C16880lQ.LLLLLLLLLL();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        W58.LJI("StatFsHelper", "getExternalStorageDirectory return null");
                    }
                    this.LIZ = LIZIZ(this.LIZ, this.LIZIZ);
                    this.LIZJ = LIZIZ(this.LIZJ, this.LIZLLL);
                    this.LJ = SystemClock.uptimeMillis();
                    this.LJI = true;
                }
            } finally {
                ((ReentrantLock) this.LJFF).unlock();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static StatFs LIZIZ(StatFs statFs, File file) {
        ?? r1 = 0;
        r1 = 0;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = new StatFs(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            r1 = statFs;
            return r1;
        } catch (IllegalArgumentException unused) {
            return r1;
        } catch (Throwable th) {
            J7I.LJIIL(th);
            throw r1;
        }
    }
}
