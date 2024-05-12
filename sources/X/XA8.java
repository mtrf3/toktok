package X;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes16.dex */
public final class XA8 {
    public final java.util.Map<String, XAA> LIZ = new HashMap();
    public final XA9 LIZIZ = new XA9();

    public final void LIZ(String str) {
        String valueOf;
        int i;
        synchronized (this) {
            XAA xaa = (XAA) ((HashMap) this.LIZ).get(str);
            if (xaa == null || (i = xaa.LIZIZ) < 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Cannot release a lock that is not held, safeKey: ");
                LIZ.append(str);
                LIZ.append(", interestedThreads: ");
                LIZ.append(xaa);
                if (X1D.LIZIZ(LIZ) == null) {
                    valueOf = "null";
                } else {
                    valueOf = String.valueOf(xaa.LIZIZ);
                }
                C131935Ft.LIZLLL("DiskCacheWriteLocker", valueOf);
                return;
            }
            int i2 = i - 1;
            xaa.LIZIZ = i2;
            if (i2 == 0) {
                XAA xaa2 = (XAA) ((HashMap) this.LIZ).remove(str);
                if (!xaa2.equals(xaa)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Removed the wrong lock, expected to remove: ");
                    LIZ2.append(xaa);
                    LIZ2.append(", but actually removed: ");
                    LIZ2.append(xaa2);
                    LIZ2.append(", safeKey: ");
                    LIZ2.append(str);
                    C131935Ft.LIZJ(X1D.LIZIZ(LIZ2));
                    return;
                }
                this.LIZIZ.LIZIZ(xaa2);
            }
            ((ReentrantLock) xaa.LIZ).unlock();
        }
    }
}
