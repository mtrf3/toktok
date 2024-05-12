package X;

import com.bytedance.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.OAb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61457OAb {
    public static final java.util.Map<String, Lock> LIZJ = new HashMap();
    public final FileLock LIZ;
    public final String LIZIZ;

    public final void LIZIZ() {
        java.util.Map<String, Lock> map = LIZJ;
        synchronized (map) {
            try {
                this.LIZ.LJI();
                this.LIZ.LIZLLL();
                ((Lock) ((HashMap) map).get(this.LIZIZ)).unlock();
            } catch (Throwable th) {
                ((Lock) ((HashMap) LIZJ).get(this.LIZIZ)).unlock();
                throw th;
            }
        }
    }

    public static C61457OAb LIZ(String str) {
        java.util.Map<String, Lock> map = LIZJ;
        synchronized (map) {
            Lock lock = (Lock) ((HashMap) map).get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                ((HashMap) map).put(str, lock);
            }
            if (!lock.tryLock()) {
                return null;
            }
            try {
                FileLock LJFF = FileLock.LJFF(str);
                if (LJFF == null) {
                    lock.unlock();
                    return null;
                }
                return new C61457OAb(str, LJFF);
            } catch (Exception e) {
                lock.unlock();
                C45804HyK.LJJLIIIJJIZ(new RuntimeException(e));
                return null;
            }
        }
    }

    public C61457OAb(String str, FileLock fileLock) {
        this.LIZIZ = str;
        this.LIZ = fileLock;
    }
}
