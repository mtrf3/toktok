package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.XHm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84582XHm implements LEA {
    public static final C84582XHm LJLIL = new C84582XHm();

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        int i3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MotaMemoryCache.onAccountResult success: ");
        LIZ.append(z);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Mota", X1D.LIZIZ(LIZ));
        if (z) {
            ReentrantReadWriteLock reentrantReadWriteLock = C84578XHi.LIZ;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i4 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i3 = reentrantReadWriteLock.getReadHoldCount();
                for (int i5 = 0; i5 < i3; i5++) {
                    readLock.unlock();
                }
            } else {
                i3 = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                C84578XHi.LIZIZ.evictAll();
            } finally {
                while (i4 < i3) {
                    readLock.lock();
                    i4++;
                }
                writeLock.unlock();
            }
        }
    }
}
