package X;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.FUb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39045FUb {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static final Lock LIZJ = new ReentrantLock();

    public static boolean LIZ() {
        Lock lock;
        try {
            lock = LIZJ;
            ((ReentrantLock) lock).lock();
            if (!LIZIZ) {
                C16880lQ.LLJJJIL("ttcrypto");
                LIZIZ = true;
            }
            if (!LIZ) {
                C16880lQ.LLJJJIL("ttboringssl");
                LIZ = true;
            }
        } catch (Error unused) {
            lock = LIZJ;
        } catch (Throwable th) {
            ((ReentrantLock) LIZJ).unlock();
            throw th;
        }
        ((ReentrantLock) lock).unlock();
        return LIZ && LIZIZ;
    }
}
