package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Pdj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64911Pdj<K, V> {
    public final ConcurrentHashMap<String, C64914Pdm> LIZ = new ConcurrentHashMap<>();
    public final String LIZIZ = "not_support";
    public final String LIZJ = "not_pending";

    public final void LIZ(String str) {
        C64914Pdm remove = this.LIZ.remove(str);
        if (remove != null) {
            ReentrantLock reentrantLock = remove.LIZ;
            reentrantLock.lock();
            try {
                remove.LIZIZ.signalAll();
                reentrantLock.unlock();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(((C64910Pdi) this).LJ);
                LIZ.append(": remove pending cache lock for ");
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
