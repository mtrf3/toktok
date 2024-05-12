package X;

import android.os.Looper;
import android.os.Message;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Qim, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerC67772Qim extends HandlerC67272Qai {
    public final /* synthetic */ C67759QiZ LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Lock lock;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                throw ((Throwable) message.obj);
            }
        }
        AbstractC67782Qiw abstractC67782Qiw = (AbstractC67782Qiw) message.obj;
        C67759QiZ c67759QiZ = this.LIZ;
        abstractC67782Qiw.getClass();
        c67759QiZ.LJLIL.lock();
        try {
            if (c67759QiZ.LJLLI != abstractC67782Qiw.LIZ) {
                lock = c67759QiZ.LJLIL;
            } else {
                abstractC67782Qiw.LIZ();
                lock = c67759QiZ.LJLIL;
            }
            lock.unlock();
        } catch (Throwable th) {
            c67759QiZ.LJLIL.unlock();
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC67772Qim(C67759QiZ c67759QiZ, Looper looper) {
        super(looper);
        this.LIZ = c67759QiZ;
    }
}
