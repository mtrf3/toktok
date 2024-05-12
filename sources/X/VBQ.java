package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes15.dex */
public class VBQ implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "VideoLiveManager-L");
        pthreadThread.setPriority(VBO.LJ.LIZ);
        return pthreadThread;
    }
}
