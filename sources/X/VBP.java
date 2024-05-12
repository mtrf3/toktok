package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes15.dex */
public class VBP implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "VideoLiveManager-H");
        pthreadThread.setPriority(VBO.LIZLLL.LIZ);
        return pthreadThread;
    }
}
