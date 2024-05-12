package X;

import Y.ARunnableS9S0201000_6;
import com.ss.android.ugc.aweme.legoImp.task.IOThreadBoostTask;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.EVk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36532EVk implements InterfaceC36534EVm {
    public final /* synthetic */ IOThreadBoostTask LIZ;

    public C36532EVk(IOThreadBoostTask iOThreadBoostTask) {
        this.LIZ = iOThreadBoostTask;
    }

    @Override // X.InterfaceC36534EVm
    public final PthreadThread LIZ(String str, int i, boolean z, int i2, Runnable runnable) {
        if ("tp-background" == str) {
            PthreadThread pthreadThread = new PthreadThread(new ARunnableS9S0201000_6(this.LIZ, runnable, i2, 2), "IOThreadBoostTask$run$1");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append('-');
            LIZ.append(i);
            pthreadThread.setName(X1D.LIZIZ(LIZ));
            pthreadThread.setDaemon(z);
            return pthreadThread;
        }
        return null;
    }
}
