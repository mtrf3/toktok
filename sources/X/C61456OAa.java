package X;

import com.bytedance.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.OAa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61456OAa {
    public static final java.util.Map<String, Lock> LIZJ = new HashMap();
    public static final ReentrantLock LIZLLL = new ReentrantLock();
    public final String LIZ;
    public final FileLock LIZIZ;

    public final void LIZIZ() {
        try {
            this.LIZIZ.LJI();
            this.LIZIZ.LIZLLL();
            Lock lock = (Lock) ((HashMap) LIZJ).get(this.LIZ);
            if (lock == null) {
                return;
            }
            lock.unlock();
        } finally {
            LIZLLL.unlock();
        }
    }

    public static C61456OAa LIZ(String str) {
        FileLock fileLock;
        LIZLLL.lock();
        Lock lock = null;
        try {
            fileLock = FileLock.LIZIZ(str);
            try {
                java.util.Map<String, Lock> map = LIZJ;
                Lock lock2 = (Lock) ((HashMap) map).get(str);
                if (lock2 == null) {
                    try {
                        lock = new ReentrantLock();
                        ((HashMap) map).put(str, lock);
                    } catch (Throwable th) {
                        th = th;
                        lock = lock2;
                        LIZLLL.unlock();
                        if (lock != null) {
                            lock.unlock();
                        }
                        if (fileLock != null) {
                            fileLock.LJI();
                            fileLock.LIZLLL();
                        }
                        throw th;
                    }
                } else {
                    lock = lock2;
                }
                lock.lock();
                return new C61456OAa(str, fileLock);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileLock = null;
        }
    }

    public C61456OAa(String str, FileLock fileLock) {
        this.LIZ = str;
        this.LIZIZ = fileLock;
    }
}
